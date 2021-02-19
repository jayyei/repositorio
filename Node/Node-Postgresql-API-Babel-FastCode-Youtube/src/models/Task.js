import Sequelize from 'sequelize';
import { sequelizeInstance } from '../database/database';

const Task = sequelizeInstance.define('task', {
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
        type: Sequelize.INTEGER,
        field:'projectid'
    }
}, {
    timestamps: false
});


export default Task;