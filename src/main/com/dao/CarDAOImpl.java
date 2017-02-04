package main.com.dao;

import main.com.entity.IVehicle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarDAOImpl implements CarDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<IVehicle> getCars() {

        Session session = sessionFactory.getCurrentSession();
        Query<IVehicle> query = session.createQuery("from Vehicle v order by v.brand", IVehicle.class);
        return query.getResultList();
    }
}
