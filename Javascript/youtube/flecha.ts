let nombre = "Pedro"

let hulk = {
    nombre: "Hulk",
    smash(){

        setTimeout( () => console.log(this.nombre + " Smash!!") , 2000) ;

    }

}

hulk.smash();