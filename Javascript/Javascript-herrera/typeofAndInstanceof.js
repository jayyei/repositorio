function identifica ( param ) {
    /*console.log(typeof param);
    if ( typeof param == "function"){
        param();
    } else {
        console.log( param);
    }*/
    console.log( param instanceof Persona);
}

function Persona(){
    this.nombre = "fernando";
    this.edad = 30;

}

var fernando = new Persona();

identifica( "fernando");