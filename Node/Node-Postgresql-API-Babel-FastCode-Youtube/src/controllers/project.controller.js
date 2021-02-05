import Project from '../models/Project'

export async function getProjects(req, res) {
    try {
        const projects = await Project.findAll();
        res.status(200).json({
            data: projects
        });
    } catch (e) {
        console.log(e)
    }
};

export async function createProject (req, res) {
    const {name, priority, description, deliverydate } = req.body;
    try {
        let newProject = await Project.create({
            name,
            priority,
            description,
            deliverydate
        },{
            fields: ['name', 'priority', 'description', 'deliverydate']
        })
        if (newProject) {
            return res.status(200).json({
                message:'Project created succesfully',
                data: newProject
            })
        }
    } catch (e) {
        res.status(500).json({
            message: 'Something went wrong',
            data: {}
        })
    }
    res.send(newProject);
};


export async function getOneProject (req, res) {
    const { id } = req.params;
    try {
        const project = await Project.findOne({
            where: {
                id
            }
        })
        res.json({
            data: project
        })
    } catch (e) {
        console.error(e);
    }  
};

export async function deleteOneProject (req, res) {
    const { id } = req.params;
    try {
        const deleteRowCount = await Project.destroy({
            where: {
                id
            }
        });
        res.json({
            message: 'Project deleted successfully',
            count: deleteRowCount
        })
    } catch (e) {
        console.error(e);
    }
}

export async function updateProject (req, res) {
    const { id } = req.params;
    const { name, priority, description, deliverydate } = req.body;
    const arrayNumbers = await Project.update({
        name,
        priority,
        description,
        deliverydate
    }, {
        where: {
            id
        }
    });
    res.json({
        info: arrayNumbers
    })
}