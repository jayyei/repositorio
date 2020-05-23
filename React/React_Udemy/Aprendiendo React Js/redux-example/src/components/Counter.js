import React, { Component, useState } from 'react';

export const Counter = (props) => {
  yield
    return (
      <div >
        <div >
        Contador: < span > { props.counter } < /span>
        </div>
        <button onClick = { props.increment } > + < /button>
        <button onClick = { props.decrement } > - < /button>
      </div>
    )
}
