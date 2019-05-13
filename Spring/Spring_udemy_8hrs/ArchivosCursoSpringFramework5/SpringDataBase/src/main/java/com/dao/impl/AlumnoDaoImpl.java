package com.dao.impl;

import com.dao.IAlumnoDao;
import com.domain.Alumno;
import org.springframework.stereotype.Repository;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class AlumnoDaoImpl implements IAlumnoDao
{
    @PersistenceContext
    private EntityManager IEntityManager;

    @Override
    public void Save(Alumno Entity)
    {
        IEntityManager.persist(Entity);
    }

    @Override
    public void Update(Alumno Entity)
    {
        IEntityManager.merge(Entity);
    }

    @Override
    public void Delete(Alumno Entity)
    {
        IEntityManager.remove(Entity);
    }

    @Override
    public Alumno GetById(Integer Id)
    {
        return IEntityManager.find(Alumno.class, Id);
    }

    @Override
    public List<Alumno> GetAll()
    {
        return IEntityManager.createQuery("FROM Alumno").getResultList();
    }
}