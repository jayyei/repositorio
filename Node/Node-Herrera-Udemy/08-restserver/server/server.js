require('./config/config')
const express = require('express')
const app = express();
var bodyParser = require('body-parser');

// parse application/x-www-form-urlencoded
app.use(bodyParser.urlencoded({ extended: false })); //son middleWares, pero que son middlewares

// parse application/json
app.use(bodyParser.json());

app.get('/usuario', function(req, res) { //obtener un recurso del servidor
    res.json('get Usuario')
});

app.put('/usuario/:id', function(req, res) { //para poner un recurso en un lugar especificado (la url)//para enviar informacion al servidor para que este la trate como considere oportuno
    let id = req.params.id;
    res.json({
        id
    });
});

app.post('/usuario', function(req, res) { //para enviar informacion al servidor para que este la trate como considere oportuno
    let body = req.body;
    if (body.nombre === undefined) {
        res.status(400).json({
            ok: false,
            mensaje: 'El nombre es necesario'
        });
    }
    res.json({
        persona: body
    });
});

app.delete('/usuario', function(req, res) {
    res.json('delete Usuario');
})

app.listen(process.env.PORT, () => {
    console.log("Escuchando el puerto 3000")
})