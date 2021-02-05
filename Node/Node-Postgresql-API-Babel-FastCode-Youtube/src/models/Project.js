import Sequelize from 'sequelize';
import { sequelizeInstance } from '../database/database';
import Task from './Task';

const Project = sequelizeInstance.define('project',{
    id: {
        type: Sequelize.INTEGER,
        primaryKey: true
    },
    name: {
        type: Sequelize.TEXT
    },
    priority: {
        type: Sequelize.INTEGER
    },
    description: {
        type: Sequelize.TEXT
    },
    deliverydate: {
        type: Sequelize.DATE
    }
}, {
    timestamps: false
});

Project.hasMany(Task,{
    foreignKey: 'projectId',
    sourceKey: 'id'
});
Task.belongsTo(Project, {foreignKey: 'projectId', targetKey: 'id'})

export default Project;