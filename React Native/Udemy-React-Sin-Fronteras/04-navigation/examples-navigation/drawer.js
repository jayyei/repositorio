import { StatusBar } from 'expo-status-bar';
import React, {useEffect, useState} from 'react';
import {AntDesign} from '@expo/vector-icons';
import { StyleSheet, Text, View, Button, Dimensions } from 'react-native';
import {createAppContainer} from 'react-navigation'; //Todos los componentes que se encuentren dentro de este envolotrio, podran realizar navegacion
import { createBottomTabNavigator } from 'react-navigation-tabs';
import { createStackNavigator } from 'react-navigation-stack';
import { createDrawerNavigator } from 'react-navigation-drawer';

const Logo = () =><Text>Lalala</Text>;

const HomeScreen = ({navigation}) =>{
  return (
    <View style={styles.container}>
      <Text>Esta es la pantalla de inicio</Text>
      <Button
        title="Ir a detalle"
        onPress={()=>{ navigation.openDrawer();}}
      />
      <StatusBar style="auto" />
    </View>
  );
};

HomeScreen.navigationOptions = {
  drawerIcon: ({tintColor})=>(
    <AntDesign name='menufold' color={tintColor} size={25}/>
  ),
  title: 'Hogar',
  /*headerStyle: {
    backgroundColor: '#ffeecc',
  },
  headerTintColor: '#222', //Cambia los colores de las etiquetas en los header
  headerTitleStyle: {
    fontWeight: '300',
    textAlign: 'center'
  }*/
};

const DetalleScreen = ({navigation})=> {
  const user = navigation.getParam('user', 0);
  const [count, setCount] = useState(0);
  const incrementar = ()=> setCount(count +1);
  useEffect(()=>{
    navigation.setParams({incrementar});
  },[count]);
  return ( <View style={styles.container}>
      <Text>Esta es la pantalla de detalle {count}</Text>
      <StatusBar style="auto" />
      <Button
        title='Volver'
        onPress={()=> navigation.navigate('MiModal')}
      />
    </View>
    );
};

DetalleScreen.navigationOptions = ({navigation})=>{
  return {
    title: navigation.getParam('title', 'Cargando...'),
    headerRight: ()=> <Button 
    title='Soy un boton'
    color='#222'
    onPress={navigation.getParam('incrementar')}/> //La clave esta en hacer getParam y setParam para pasarse parametros entre el navigationOptions y el componente de detalles
    //headerTintColor: '#5e5', //Cambia el color tanto del texto como del texto en botones
  };
};

//Seccion de creacion del stack y del AppContainer
const AppNavigator = createDrawerNavigator({
  Home: {
    screen: HomeScreen
  },
  Detail: {
    screen: DetalleScreen
  }
  }, 
  { 
    initialRouteName: 'Home',
  });

const RootStack = createStackNavigator({
  Main: AppNavigator,
  MiModal: () =><Text style={styles.modal}>texto en un modal</Text>
},{
  mode: 'modal',
  headerMode: 'none',
  defaultNavigationOptions: {
  }
});

export default createAppContainer(RootStack);

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
  modal:{
    padding: 40,
    height: Dimensions.get('window').height -250
  }
});
