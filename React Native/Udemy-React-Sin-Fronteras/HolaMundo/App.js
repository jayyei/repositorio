import React, { useState, useCallback } from 'react';
import { StyleSheet, Text, View } from 'react-native'; //El componente de view 

const Texto = ({style})=>{
  const [texto, setTexto] = useState("Hola Mundo"); 
  const actualizaTexto = useCallback(() => {
      setTexto('Adios Mundo')
  },[texto],);

  //Al style se le puede aplicar un arreglo que se leerá de izquierda a derecha, sobreescribiendo si es que aplica
  return (
  <Text style={[styles.text, style]}
    onPress={actualizaTexto}
  >{texto}</Text>
  )
}

export default function App() {
  return (
    <View style={styles.container}>     
      <Texto style={styles.red}/>
      <Texto style={styles.green}/>
      <Texto style={styles.blue}/>
    </View>
  );
}

const styles = StyleSheet.create({
  text:{
    color:'white',
    fontSize: 24,
    //height:100, //100 unidades, no pixeles, estos 100 son unidades relativas
    //width:100
  },
  red:{
    backgroundColor: 'red'
  },
  green:{
    backgroundColor: 'green'
  },
  blue:{
    backgroundColor: 'blue'
  },
  container: {
    flexDirection:'column',
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'baseline', 
    justifyContent: 'space-evenly', 
  },
});
