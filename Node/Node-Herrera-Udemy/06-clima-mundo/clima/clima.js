const axios = require('axios');

const getClima = async(lat, lng) => {
    const resp = await axios.get(`https://api.openweathermap.org/data/2.5/weather?lat=${parseFloat(lat)}&lon=${parseFloat(lng)}&appid=69d7b9e40987dc4cce1b640fa0263f6e&units=metric`)
    return resp.data.main.temp
}

module.exports = {
    getClima
}