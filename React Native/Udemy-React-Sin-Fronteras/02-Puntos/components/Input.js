import React from 'react';
import { Text, TextInput, View, StyleSheet } from 'react-native';

export default ({title, ...rest})=>{
    return (
        <View style={styles.wrapper}>
            <Text style={styles.text}>{title}</Text>
            <TextInput style={styles.textInput} {...rest}/>
        </View>
    )
}

const styles = StyleSheet.create({
  wrapper :{
      height: 55,
      margin: 10
  },
  text:{
      fontSize: 20
  },
  textInput: {
      fontSize: 30,
  }
})

