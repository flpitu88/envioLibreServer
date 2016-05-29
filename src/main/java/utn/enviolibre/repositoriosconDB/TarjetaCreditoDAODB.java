/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.enviolibre.repositoriosconDB;

import java.util.List;
import utn.enviolibre.model.TarjetaCredito;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import utn.enviolibre.repository.TarjetaCreditoDAO;

/**
 *
 * @author flpitu88
 */
@Repository
public class TarjetaCreditoDAODB implements TarjetaCreditoDAO {

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public TarjetaCredito getTarjetaById(int id) {
        return (TarjetaCredito) sessionFactory.getCurrentSession()
                .createCriteria(TarjetaCredito.class)
                .add(Restrictions.eq("id", id))
                .uniqueResult();
    }

    @Override
    public List<TarjetaCredito> getTarjetas() {
        return sessionFactory.getCurrentSession()
                .createCriteria(TarjetaCredito.class)
                .list();
    }

//    @Override
//    public TarjetaCredito getTarjetaByIdUsuario(int idUser) {
//        return (TarjetaCredito) sessionFactory.getCurrentSession()
//                .createCriteria(TarjetaCredito.class)
//                .add(Restrictions.eq("usuario.id", idUser))
//                .uniqueResult();
//    }

    @Override
    public void guardarTarjetaCredito(TarjetaCredito tc) {
        sessionFactory.getCurrentSession().save(tc);
    }

}
