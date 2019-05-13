Ext.application({
    name: 'App',
    extend: 'Ext.app.Application',
    stores: ['AlumnoStore'],
    models: ['AlumnoModel'],
    views: ['alumno.AlumnoGrid'],
    launch: function () {
        Ext.create('App.view.alumno.AlumnoGrid', {
            renderTo: Ext.getBody()
        })
    }
});