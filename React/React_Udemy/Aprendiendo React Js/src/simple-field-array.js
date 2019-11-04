import React from "react";
import { Field, FieldArray, reduxForm } from "redux-form";
import validate from "./validate";

const renderField = ({ input, label, type, meta: { touched, error } }) => (
  <div>
    <label>{label}</label>
    <div>
      <input {...input} type={type} placeholder={label} />
      {touched && error && <span>{error}</span>}
    </div>
  </div>
);

const renderMembers = ({ fields, meta: { touched, error, submitFailed } }) => (
  <ul>
    <li>
      <button type="button" onClick={() => fields.push({})}>
        Add Member
      </button>
      {(touched || submitFailed) && error && <span>{error}</span>}
    </li>
    {fields.map((member, index) => (
      <li key={index}>
        <button
          type="button"
          title="Remove Member"
          onClick={() => fields.remove(index)}
        />
        <Field
          name={`${member}.firstName`}
          type="text"
          component={renderField}
          label="First Name"
        />
        <Field
          name={`${member}.lastName`}
          type="text"
          component={renderField}
          label="Last Name"
        />
      </li>
    ))}
  </ul>
);

const FieldArraysForm = props => {
  const { handleSubmit, pristine, reset, submitting } = props;
  return (
    <form onSubmit={handleSubmit}>
      <Field
        name="clubName"
        type="text"
        component={renderField}
        label="Club Name"
      />
      <FieldArray name="members" component={renderMembers} />
    </form>
  );
};

export default reduxForm({
  form: "fieldArrays", // a unique identifier for this form
  validate
})(FieldArraysForm);



// para mas informacion consulte a react redux form array field

/* El <FieldArray/> puede recibir tres props que son el nombre de dicho arreglo, 
el componente a repetir y las validaciones, ademas de warn, props, fowardRef y reRenderOnEveryChange
 */

 El componente que recibe el FieldArray recibira como props el fields y un arreglo meta
 El fields dentro del componente puede realizar los metodos de un arreglo en javascript(Ver https://redux-form.com/8.2.2/docs/api/fieldarray.md/)
 Losatributos bajo la etiqueta meta es metadata sobre el estado del field array que redux form esta inspeccionando
 Dichos atributos los puedes consultar en el apendice de meta (Ver https://redux-form.com/8.2.2/docs/api/fieldarray.md/)

 cuando se itera dentro del componente que recibe el field Array, sus callbacks pueden recibir parametros como
 name, index y fields

 y listo eso seria todo de react field array