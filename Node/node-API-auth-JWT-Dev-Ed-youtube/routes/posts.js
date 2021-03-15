const router = require('express').Router();
const verify = require('./verifyToken');

router.get('/', verify, (req, res) => {
    res.json({
        post: {
            title: 'My first Post', 
            description: 'random data you shouldnt access' 
        },
        user: req.user
    })
});


module.exports = router;
