import React from 'react';
import {FlatList, Text, Button, StyleSheet, Dimensions, View} from 'react-native';


const Item = ({item})=>(
    <View style={styles.itemStyle}>
        <Text style={styles.text}>{item}</Text>
    </View>
)

export default ({puntos, closeModal})=> {
    return (
        <>
         <View style={styles.list}>
            <FlatList
             data={puntos.map(x=>x.name)}
             renderItem={ Item }
             keyExtractor={item => item}
            />
         </View>
         <View style={styles.button}>
             <Button 
                color='#ccc'
                onPress={closeModal}
                title='Cerrar'/>
         </View>
        </>
    )
}

const styles = StyleSheet.create({
    button: {
        paddingBottom: 2,
    },
    list: {
        height : Dimensions.get('window').height - 250,  
    },
    itemStyle: {
        borderBottomWidth: 1,
        backgroundColor: '#2DB4C8',
        borderColor: '#ccc',
        height: 50,
        justifyContent: 'center',
        padding: 15,
        margin: 1,
    },
    text: {
        fontSize: 20,
        color: '#6E7576'
    }
})