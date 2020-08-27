import { StatusBar } from 'expo-status-bar';
import React, {useReducer} from 'react';
import { StyleSheet, Text, View } from 'react-native';

const initialState = {
  count: 0
}

const reducer = (state, action) =>{
  switch(action.type){
    case 'incrementar':
      return { count: state.count + 1}
      break;
    case 'decrementar':
      return { count: state.count - 1}
      break;
    default: 
      return state;
  }
}

export default function App() {

  const [state, dispatch] = useReducer(reducer, initialState);
  
  return (
    <View style={styles.container}>
      <Text onPress={()=>{dispatch({type: 'incrementar'})}}>+</Text>
      <Text style={styles.text}>
        {state.count}
      </Text>
      <Text onPress={()=>{dispatch({type: 'decrementar'})}}>-</Text>
      <StatusBar style="auto" />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#fff',
    alignItems: 'center',
    justifyContent: 'center',
  },
  text:{
    fontSize: 20
  }
});