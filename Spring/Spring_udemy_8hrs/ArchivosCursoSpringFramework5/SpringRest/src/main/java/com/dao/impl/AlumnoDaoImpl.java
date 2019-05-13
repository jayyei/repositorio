package com.dao.impl;

import com.dao.IAlumnoDao;
import com.domain.Alumno;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
@Transactional
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
        IEntityManager.remove(IEntityManager.contains(Entity) ? Entity : IEntityManager.merge(Entity));
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

    @Override
    public List<Alumno> GetAll(Integer Start, Integer Limit)
    {
        String Jpql = "FROM Alumno";
        Query IQuery = IEntityManager.createQuery(Jpql);
        IQuery.setFirstResult(Start).setMaxResults(Limit);
        return IQuery.getResultList();
    }
}