import { Router } from 'express';
import { createProject, getProjects } from '../controllers/project.controller'
const router = Router();

router.post('/project', createProject);

router.get('/', getProjects)

export default router;