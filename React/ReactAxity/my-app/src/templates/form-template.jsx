import React from 'react';

export const FormTemplate = props => {
 const { handleSubmit, pristine, reset, submitting, submitHandler, closeDialog, fields } = props;
 return (
   <form onSubmit={handleSubmit(submitHandler) }>
       {fields}
   </form>
 );
};