Ext.define('App.store.AlumnoStore',{
    extend:'Ext.data.Store',
    model:'App.model.AlumnoModel',
    sorters:['name'],
    autoLoad:true,
    autoSync:false,
    pageSize:4,
    proxy:{
        type:'ajax',
        method: 'GET',
        url:'/alumnos',
        reader:{
            type:'json',
            rootProperty:'AlumnoListJson',
            totalProperty:'total'
        }
    }
});