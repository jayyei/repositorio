const express = require('express');
const Usuario = require('../models/usuario')
const bcrypt = require('bcrypt');

const app = express();

app.get('/usuario', function(req, res) { //obtener un recurso del servidor
    res.json('get Usuario')
});

app.put('/usuario/:id', function(req, res) { //para poner un recurso en un lugar especificado (la url)//para enviar informacion al servidor para que este la trate como considere oportuno
    let id = req.params.id;
    let body = req.body;

    Usuario.findByIdAndUpdate(id, body, {new: true, runValidators:  true}, (err, usuarioDB) =>{
        if(err){
            return res.status(400).json({
                ok: false,
                err
            });
        }
        res.json({
            ok: true,
            usuario: usuarioDB
        });
    });

    
});

app.post('/usuario', function(req, res) { //para enviar informacion al servidor para que este la trate como considere oportuno
    let body = req.body;
    
    let usuario = new Usuario({
        nombre: body.nombre,
        email: body.email,
        password: bcrypt.hashSync(body.password, 10),
        role: body.role
    });

    usuario.save((err, usuarioDB) =>{
        if(err){
            return res.status(400).json({
                ok: false,
                err
            });
        }
        
        res.json({
            ok:true,
            usuario: usuarioDB
        })

    });
});

app.delete('/usuario', function(req, res) {
    res.json('delete Usuario');
});

module.exports = app;