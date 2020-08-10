import React, {Component } from 'react';
import './App.css';
import PropTypes from 'prop-types'



class Box extends Component {
    render (){
        return (
            <div style={{ border: '1px solid #0ff', margin: 5, padding: 5}}>
                {this.props.children}
            </div>
        )
    }
}

class Article extends Component{
    static propTypes = { //A traves de la dependenncia de proptypes, se puede crear un objeto statico dentro de la clase indicando el tipo de dato de las propiedades a esperar asi como si es requerida o no, esto solo lanzara un warning a la consola del navegador
        author: PropTypes.string.isRequired
    }
    
    render(){
        const { author, children, date, title } = this.props
        return(
            <section>
                <h2>{title}</h2>
                {author&& <p><em>Escrito por: {author}</em></p>}
                <Box>{date}</Box>
                <article>
                    {children}
                </article>
            </section>
        )
    }
}


class Children extends Component { 
    render(){
        return(
            <div className="App">
                <h4>Children props</h4>
                <Article
                    
                    date={new Date().toLocaleDateString()}
                    title="Articulo sobre la prop children"
                >
                    <p>El contenido que envolvemos dentro del componente Article sera enviado al componente como this.props.children. </p>
                    <strong>Y mantiene las etiquetas que hayais agregado dentro <br/></strong> 
                    
                </Article>
            </div>
        )
    }
}

export default Children;