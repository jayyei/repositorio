import React, { Component } from 'react';

export const actionSendData = data => (
   dispatch => {
       console.log("action Formulario");
       dispatch(actionSendDataFulfilled(data));
   });

export const actionSendDataFulfilled = data => (
   { type: 'SEND_DATA_FORM', payload: data }
);