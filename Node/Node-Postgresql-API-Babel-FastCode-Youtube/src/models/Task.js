import Sequelize from 'sequelize';
import { sequelize } from '../database/database';
import Project from './Project';

const Task = sequelize.define('task', {
    id: {
        type: Sequelize.INTEGER,
        primaryKey: true
    },
    name: {
        type: Sequelize.TEXT
    },
    done: {
        type: Sequelize.BOOLEAN
    },
    projectId: {
        type: Sequelize.INTEGER
    }
}, {
    timestamps: false
});

Task.belongsTo(Project, {
    foreignKey: 'projectId',
    targetKey: 'id'
});

export default Task;