const express = require('express');
const app = express();
const hbs = require('hbs');
require('./hbs/helpers');

const port = process.env.PORT || 3000
app.use(express.static(__dirname + '/public'));

//Express HBS engine HBS = handleBars
hbs.registerPartials(__dirname + '/views/parciales')
app.set('view engine', 'hbs');

app.get('/', (req, res) => {
    //res.send('Hola mundo')
    let salida = {
        nombre: 'fernando',
        edad: 32,
        url: req.url
    }
    res.render('home', {
        nombre: 'jay',
    });
});
app.get('/about', (req, res) => {
    //res.send('Hola mundo')
    let salida = {
        nombre: 'fernando',
        edad: 32,
        url: req.url
    }
    res.render('about');
});

/* app.get('/data', (req, res) => {
    res.send('Hola Data')
}) */

app.listen(port, () => {
    console.log(`Escuchando peticiones en el puerto ${3000}`)
})