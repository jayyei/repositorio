import Sequelize from 'sequelize';

export const sequelizeInstance = new Sequelize(
    'postgres',
    'postgres',
    'abc',
    {
        host: 'localhost',
        dialect: 'postgres',
        pool:{
            max: 5,
            min: 0,
            require: 30000,
            idle: 10000
        },
        logging: true
    }
);
