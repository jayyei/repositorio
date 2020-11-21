require('./config/config');

const express = require('express');
const mongoose = require('mongoose');

var bodyParser = require('body-parser');

const app = express();

// parse application/x-www-form-urlencoded
app.use(bodyParser.urlencoded({ extended: false })); //son middleWares, pero que son middlewares

// parse application/json
app.use(bodyParser.json());

app.use( require('./routes/usuario'));

mongoose.connect('mongodb://localhost:27017/cafe',  { useUnifiedTopology: true, useNewUrlParser: true }, (err, res) =>{
    if(err) throw err;
    console.log('Base de datos online');
});

app.listen(process.env.PORT, () => {
    console.log("Escuchando el puerto 3000")
})