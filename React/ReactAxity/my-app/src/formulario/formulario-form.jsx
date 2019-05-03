import React from 'react';
import { reduxForm } from 'redux-form';
import {FormTemplate} from '../templates/form-template';

export default reduxForm({
   form: 'formTemplateFormulario', // a unique identifier for this form
})(FormTemplate);