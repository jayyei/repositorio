const axios = require('axios');

const getLugarLtLng = async(direccion) => {

    const encodedURL = encodeURI(direccion);

    const instance = axios.create({
        baseURL: `https://devru-latitude-longitude-find-v1.p.rapidapi.com/latlon.php?location=${encodedURL}`,
        headers: {
            'x-rapidapi-key': '8eec15ffb7mshecf7f937d4bec60p1db4c7jsn39b18a980d2d'
        }
    });

    const resp = await instance.get();

    if (resp.data.Results.length === 0) {
        throw new Error(`No hay resultados para ${direccion}`)
    }

    const data = resp.data.Results[0];
    const name = data.name;
    const lat = data.lat;
    const lng = data.lon;

    return {
        name,
        lat,
        lng
    }
    /* instance.get()
        .then(resp => {
            console.log(resp.data.Results[0])
        })
        .catch(err => {
            console.log('Error', err)
        }); */
}

module.exports = {
    getLugarLtLng
}