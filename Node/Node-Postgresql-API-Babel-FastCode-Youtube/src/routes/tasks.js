import Router from 'express';
import { createTask, getTasks, updateTask, deleteTask, getOneTask, getTasksByProject } from '../controllers/task.controller';

const router = Router();

router.post('/task', createTask);
router.put('/task/:id', updateTask);
router.delete('/task/:id', deleteTask);
router.get('/task/:id', getOneTask);
router.get('/project/:id', getTasksByProject );

router.get('/', getTasks);






export default router;