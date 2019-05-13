Ext.define('App.model.AlumnoModel', {
    extend: 'Ext.data.Model',
    field: [
        {name: 'ideAlu', type: 'int'},
        {name: 'nroDni', type: 'string'},
        {name: 'apePat', type: 'string'},
        {name: 'apeMat', type: 'string'},
        {name: 'desNom', type: 'string'},
        {name: 'fchNac', type: 'string'}
    ]
});