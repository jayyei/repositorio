// Son las diferentes faser de ejecucion por donde pasa un componente

// Fase de montaje

/* Se ejecuta siempre y solo una vez, cre el compoennte con su estado
inicial */

//  Fase de actualizacion 

/* Por defecto se ejecuta cad vez que recibe props o se actualiza su estado
podemos controlar cuando el componente necesita renderizarse de nuevo */

// Fase de desmontaje

//Aqui se elimina algunos listeners y referencias al DOM

Montaje //Se ejecuta siempre y solo lo hace una vez
                    //Construye el componente en su estado inicial
                    //Obtiene las props
                    //Primera ejecuccion del metodo render
                    //Termina con el componente montado en el DOM

constructor(props) //Se ejecuta antes de montar el componente
                    // Inicializa el state del componente
                    //bindea contexto en los metodos
                    //NO SE DEBE DE LLAMAR EL SETSTATE

componentWillMount(){} //Se ejecuta una vez
                        //Se invoca antes de montar el componente y antes del render
                        //Todavia no tenemos el componente disponible en el DOM
                        //Se recomienda usar el constructor en su lugar
                        //Se puede usar el setState y no provoca otro render

render()                //El unico metodo obligatorio
                        //Retorna los elementos que queremos mostrar en nuestra interfaz
                        //No se debe de llamar el setState, porvocaria un loop infinito
                        //Se puede devolver un arreglo de elementos [ ya sean de react o del DOM]

componentDidMount()     //Se ejecuta tras renderizar el componente
                        //Ya tendremos una representacion en el DOM
                        /* Aqui podemos anadir las llamadas para recuperar datos del
                        servidor y escuchar eventos */
                        //Se puede usar el setState

componentWillReceiveProps() //Solo se ejecuta cuando el componente recibira nuevas props
                            //Util cuando se usa las props para formar el state del componente
                            //se puede usar el setstate y a veces no provoca render
                            