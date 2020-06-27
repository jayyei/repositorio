import React from 'react';

const Footer = ({fecha})=>{ //function expression, con esta forma puedes reducir la expresion de return de la funcion, a diferencia de la function declaration
    return(
        <footer>
            <p>Todos los derechos reservados &copy;{fecha}</p>
        </footer>
    );
};

export default Footer;