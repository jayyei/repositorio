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
    public List<Alumno> GetByNroDniLis(String NroDni)
    {
        return IEntityManager.createQuery("FROM Alumno WHERE nroDni = :NroDni").setParameter("NroDni", NroDni).getResultList();
    }

    @Override
    public List<Alumno> GetForSearchList(String DesBus)
    {
        String Jpql = "FROM Alumno WHERE UPPER(apePat||apeMat||desNom||nroDni) LIKE :DesBus";
        Query IQuery= IEntityManager.createQuery(Jpql);
        IQuery.setParameter("DesBus", "%" + DesBus.toUpperCase() + "%");
        return (List<Alumno>)IQuery.setMaxResults(10).getResultList();
    }
}