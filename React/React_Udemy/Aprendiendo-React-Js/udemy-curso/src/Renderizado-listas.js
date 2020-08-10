import React, {Component} from 'react';
import ConditionalSection from './sections/conditional';

class App extends Component {
    render () {
        //Utiliza la extension de react developer tools para observar las props que se les pasa a cada componente en react
        //Cada child en una lista deberia de tener un unico key prop para ayudarle a react que elementos deben de renderizar de esa lista y evitar confusiones futuras
        const numbers = [1,1,2,3,4,5];
        return (
            <div className="App"> 
            {numbers.map((number, index)=>(
                <p key={index}>Soy el numero {number}</p>
            ))}
            </div>
        );
    }
}
export default App;