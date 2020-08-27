import React, {useState, useEffect} from 'react';
import { StyleSheet, View, Modal, Text, Alert, Dimensions, Button} from 'react-native'; //El componente de view 

import MapView, {Marker} from 'react-native-maps'
import { Camera } from 'expo-camera'

//const {width, height} = Dimensions.get('window');

  //Al style se le puede aplicar un arreglo que se leerá de izquierda a derecha, sobreescribiendo si es que aplica
export default function App() {

  const [permisos, setPermisos] = useState(null);
  const [tipo, setTipo] = useState(Camera.Constants.Type.back);

  const getPermisos = async ()=> {
    const {status} = await Camera.requestPermissionsAsync();
    setPermisos(status == 'granted')
    console.log(status)
  }

  useEffect(()=>{
   getPermisos(); 
  },[])

  if (permisos === null)  {
    return (<View><Text>Esperando permisos</Text></View>)
  }
  if (permisos === false)  {
    return (<View><Text>No tenemos acceso a la camara :(</Text></View>)
  }
  return (
      <View style={styles.container}>
        <Camera
          style={styles.camera}
          type={tipo}
        >
          <Button
            title='Voltear'
            onPress={()=>{
              const { front, back} = Camera.Constants.Type
              const nuevoTipo =  tipo === back ? front : back;
              setTipo(nuevoTipo)
            }}
          />
        </Camera>
      </View>
  );
}

const styles = StyleSheet.create({
  camera:{
    flex:1
  },
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'stretch', 
    justifyContent: 'center', 
    paddingTop: 22
  }
});
