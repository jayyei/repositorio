import Project from '../models/Project';
import Task from '../models/Task'

export async function createTask(req, res) {
    const {name, done, projectId} = req.body;
    try {
        let newTask = await Task.create({
            name,
            done,
            projectId
        },{
            fields: ['name', 'done', 'projectId']
        });
        if(newTask) {
            return res.status(200).json({
                message: 'Task created succesfully',
                data: newTask
            });
        }

    } catch (e) {
        console.error(e)
        res.status(400).json({message:'Something broke!'})
    }
}
export async function getTasks(req, res) {
    try {
        const tasks = await Task.findAll();
        res.status(200).json({
            data: tasks
        })
    } catch (e) {
        console.error(e);
        res.status(400).json({message:'Something broke!'});
    }

}

export async function updateTask(req, res) {
    const {name, done, projectId} = req.body;
    const { id } = req.params;
    try {
        const arrayNumbers = await Task.update({
            name,
            done,
            projectId
        }, {
            where: {
                id
            }
        });
        res.status(200).json({
            info: arrayNumbers
        })
    } catch (e) {
        console.error(e);
        res.status(400).json({message:'Something broke!'});
    }

}

export async function deleteTask(req, res) {
    const { id } = req.params;
    try{
        const deleted = await Task.destroy({
            where: {
                id
            }
        });
        res.status(200).json({
            deleted
        })
    } catch (e) {
        console.error(e);
        res.status(400).json({message:'Something broke!'});
    }
}

export async function getOneTask(req, res) {
    const { id } = req.params;
    try {
        const taskFound = await Task.findByPk(id);
        res.status(200).json({
            taskFound
        })
    } catch (e) {
        console.error(e);
        res.status(400).json({message:'Something broke!'});
    }

}

export async function getTasksByProject(req, res) {
    const {id} = req.params;
    try {
        const project = await Project.findByPk(id);
        if(project === null){
            return;
        }
        const taskInProject = await project.getTasks();
        res.status(200).json({
            tasks: taskInProject
        });
    } catch (e) {
        console.error(e);
    }
}