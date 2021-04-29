const router = require('express').Router();

const User = require('../model/User');
const jwt = require('jsonwebtoken');
const bcrypt = require('bcryptjs');
const { registerValidation, loginValidation } = require('../validation')

router.post('/register', async (req, res) => {
    //Lets validate The data Before we a user
    const { error } = registerValidation(req.body)
    if (error) {
       return  res.status(400).send(error.details[0].message);
    }

    // Checking if the user is already in the database
    const emailExist = await User.findOne({email: req.body.email});
    if (emailExist) return res.status(400).send('Email already exists');

    //Hash the password
    const salt = await bcrypt.genSalt(10);
    const hashPassword = await bcrypt.hash(req.body.password, salt);

    // create a new user
    const user = new User({
        name: req.body.name,
        email: req.body.email,
        password: hashPassword
    });
    try {
        const saveUser = await user.save();
        res.send({user: saveUser._id})
    } catch (err) {
        res.status(400).send(err)
    }

});

//Login
router.post('/login', async (req, res) => {
    const { error } = loginValidation(req.body);
    if (error) return res.status(400).send(error.details[0].message);

    // Checking if the user is already in the database
    const user = await User.findOne({email: req.body.email});
    if (!user) return res.status(400).send('Email is not found');
    //Password is correct
    const validPass = await bcrypt.compare(req.body.password, user.password)
    if(!validPass) return res.status(400).send('Invalid password');

    // Create and assign token
    const token = jwt.sign({_id: user._id, name: user.name}, process.env.TOKEN_SECRET)
    res.header('auth-token', token).send(token);

})

module.exports = router;