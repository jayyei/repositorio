import { Router } from 'express';
import { createProject, getProjects, getOneProject, deleteOneProject, updateProject } from '../controllers/project.controller'

const router = Router();

router.post('/project', createProject);

router.get('/', getProjects);

// /api/projects/:projectID
router.get('/project/:id', getOneProject);

router.delete('/project/:id', deleteOneProject);

router.put('/project/:id', updateProject);

export default router;