import React, { Component } from 'react';

class Title extends Component {
  render(){
    return <h1>{this.props.text}</h1>
  }
}

Title.defaultProps = {
  text: 'otra cosa'
}

class App extends Component {
  render() {
    return (
      <div className="App">
      <Title text='El titulo original' />
      </div>
    )
  }
}

export default App;