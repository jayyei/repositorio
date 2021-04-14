import {html, render} from 'lit-html';

const myTemplate = (name) = html`<p>Hello ${name}</p>`;

// Class
const myTemplate = (data) = html`<div class=${data.cssClass}>Stylish text</div>`;

// condicional
const myTemplate2 = (data) => html`<div ?disabled=${!data.active}>Stylish text.</div>`;

//Bind properties
const myTempalte3 = (data) => html`<input .value=${data.value}</input>`;

//Add event listeners
const myTemlateListener = () => html`<button @click=${clickHandler}>Click me!</button>`
const clickHandler = {
    handleEvent(e) {
        console.log('Clicked');
    },
    capture: true
}

// Nested elements

const myHeader = html`<h1>Header</h1>`;
const myPage = html`
    ${myHeader}
    <div>Here's my gain page</div>
`;
render(myTemplate('World'), document.body);