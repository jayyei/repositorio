
'use strict';

const e = React.createElement;

class LikeButton extends React.Component { //Aqui en vez de comportarse como clase, se comienza a comportar como componenete
 constructor(props) { //Para acceder a las propiedades del componente
   super(props); 
   this.state = { liked: false };
 }

 render() { //Cada vez que se carga el componente, obtiene informacion del html y lo
   if (this.state.liked) {
     return 'You liked this.';
   }

   return e(
     'button',
     { onClick: () => this.setState({ liked: true }) },
     'Like'
   );
 }
}

const domContainer = document.querySelector('#like_button_container');
ReactDOM.render(e(LikeButton), domContainer);