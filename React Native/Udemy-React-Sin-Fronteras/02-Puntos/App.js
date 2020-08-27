import { StatusBar } from 'expo-status-bar';
import React, { useState } from 'react';
import { StyleSheet, Text, View, Dimensions, Button } from 'react-native';
import { Map, Modal, Panel, Input, List} from './components';

export default function App() {

  const [puntos, setPuntos] = useState([]);
  const [puntoTemp, setPuntoTemp] = useState({});
  const [nombre, setNombre] = useState('');
  const [visibilityFilter, setVisibilityFilter] = useState('new_punto'); //new_punto o puntos
  const [visibility, setVisibility] = useState(false);
  const [pointsFilter, setPointsFilter] = useState(true);

  const handleLongPress = ({nativeEvent} ) =>{
    setVisibilityFilter('new_punto');
    setPuntoTemp(nativeEvent.coordinate );
    setVisibility(true);
  }
  
  const handleChangeText = text => { 
    setNombre(text)
  }

  const handleSubmit = () =>{
    const newPunto = { coordinate: puntoTemp, name: nombre};
    setPuntos(puntos.concat(newPunto));
    setVisibility(false);
    setNombre('');
  }

  const handleReject = () =>{
    setPuntoTemp({});
    setNombre('');
    setVisibility(false);
  }

  const handleLista = ()=>{
    setVisibilityFilter('all_puntos');
    setVisibility(true);
  }

  const togglePointsFilter = ()=> {
    setPointsFilter(!pointsFilter)
  }
  return (
    <View style={styles.container}>
      <Map 
        onLongPress= {handleLongPress} 
        puntos= {puntos}
        pointsFilter={pointsFilter}
      />
      <Panel 
        onPressLeft={handleLista}
        onPressRight={togglePointsFilter}
        textLeft='Lista'
      />
      <Modal visibility={visibility}>
        {visibilityFilter === 'new_punto' ? 
        <View styles={styles.form}>
          <Input
          title='Nombre'
          placeHolder='Nombre del punto'
          onChangeText={handleChangeText}
          />
          <View style={styles.buttons}>
            <Button color='#5699A9' title='Aceptar' onPress={handleSubmit}/>
            <Button color='#AD1717' title='Cancelar' onPress={handleReject}/>
          </View>
        </View> :
        <List
          puntos={puntos}
          closeModal={()=>setVisibility(false)}
        />}
      </Modal>
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'flex-start',
  },
  form: {
    padding: 20
  },
  buttons: {
    paddingTop: 10
  }
});
