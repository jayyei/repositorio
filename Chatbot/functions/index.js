// See https://github.com/dialogflow/dialogflow-fulfillment-nodejs
// for Dialogflow fulfillment library docs, samples, and to report issues
'use strict';
 
const functions = require('firebase-functions');
const {WebhookClient} = require('dialogflow-fulfillment');
const {Card, Suggestion} = require('dialogflow-fulfillment');
 
process.env.DEBUG = 'dialogflow:debug'; // enables lib debugging statements
 
exports.dialogflowFirebaseFulfillment = functions.https.onRequest((request, response) => {
  const agent = new WebhookClient({ request, response });
  console.log('Dialogflow Request headers: ' + JSON.stringify(request.headers));
  console.log('Dialogflow Request body: ' + JSON.stringify(request.body));
 
  function welcome(agent){
    const ssml = `<speak> <audio src="https://storage.googleapis.com/audio-prueba2/sonidos/bienvenido.mp3">Bienvenido</audio> </speak> `
    agent.add(ssml);
}

  function comprarTacos(agent) {
    const ssml = `<speak> Claro <break time="2"/> , hagamos una prueba de voz ssml Jay </speak> `
    agent.add(ssml);
  }
 
  
  let intentMap = new Map();
  intentMap.set('Comprar Tacos', comprarTacos);
  intentMap.set('Default Welcome Intent', welcome);
  // intentMap.set('your intent name here', yourFunctionHandler);
  // intentMap.set('your intent name here', googleAssistantHandler);
  agent.handleRequest(intentMap);
});