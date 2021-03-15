const express = require('express');
const app = express();
const mongoose = require('mongoose');
const dotenv = require('dotenv');
//Import routes
const authRoute = require('./routes/auth');
const postRoute = require('./routes/posts');


dotenv.config();

//Connect to DB
mongoose.connect(
    process.env.DB_CONNECT,
    { useNewUrlParser: true },
    ()=> console.log('connected to db!'));

//Middlewares
app.use(express.json());

// Routes Middlewares
app.use('/api/user', authRoute);

app.use('/api/posts', postRoute);



app.listen(3002, ()=> console.log('Up and running'));