

const contador = document.getElementById('contador')
const decrementar = document.getElementById('decrementar')
const incrementar = document.getElementById('incrementar')

console.log(incrementar,decrementar, contador)
const INITIAL_STATE = {
    counter : 0
}

function counterApp(state= INITIAL_STATE, action) {  //Este es un reducer
    console.log(state, action)
    switch(action.type){
        case 'INCREMENT':
            return {
                counter: state.counter + 1  //Solo se consulta el state actual para crear uno nuevo y devolverlo
            }
        case 'DECREMENT':
            return {
                counter: state.counter - 1
            }
        default:
            return state;
    }
}

const store = Redux.createStore(counterApp) //El create store recibe como parametro el reducer creado
store.subscribe(() =>{
    const state = store.getState()
    console.log('state cambiado', state);
    contador.innerText = state.counter
})

incrementar && incrementar.addEventListener('click', () =>{
    store.dispatch({type: 'INCREMENT'})
})

decrementar && decrementar.addEventListener('click', () =>{
    store.dispatch({type: 'DECREMENT'})
})