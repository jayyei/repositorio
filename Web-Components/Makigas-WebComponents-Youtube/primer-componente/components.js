class SaludoBasicoElement extends HTMLElement {

    constructor () {
        super();
        this.saludo = "Hola que tal"
        this.pintado = false
    }

    static get observedAttributes() {
        return ['nombre']
    }

    connectedCallback() {
        this.pintado = true
        console.log(`montado`)
        let bold = document.createElement("strong");
        bold.innerHTML = this.saludo;
        this.appendChild(bold);

    }

    attributeChangedCallback(attr, oldValue, newValue) {
        if(attr === 'nombre'){
            this.saludo = `Hola ${newValue}`
        }
        if (this.pintado) {
            this.innerHTML = this.saludo
        }
    }

    disconnectedCallback() {

    }
}

window.customElements.define('saludo-basico', SaludoBasicoElement)