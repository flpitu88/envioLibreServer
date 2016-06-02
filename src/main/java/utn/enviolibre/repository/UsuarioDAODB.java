/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.enviolibre.repository;

import java.util.List;
import javax.transaction.Transactional;
import org.hibernate.Session;
import utn.enviolibre.model.Usuario;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author flpitu88
 */
@Repository
@Transactional
public class UsuarioDAODB implements UsuarioDAO {

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void guardarUsuario(Usuario u) {
        sessionFactory.getCurrentSession().save(u);
    }

    @Override
    public Usuario getUsuarioByNombre(String nombre) {
        return (Usuario) sessionFactory.getCurrentSession()
                .createCriteria(Usuario.class)
                .add(Restrictions.eq("nombre", nombre))
                .uniqueResult();
    }

    @Override
    public List<Usuario> getTodosLosUsuarios() {
        return sessionFactory.getCurrentSession()
                .createCriteria(Usuario.class)
                .list();
    }

    @Override
    public Usuario getUsuarioById(int id) {
        return (Usuario) sessionFactory.getCurrentSession()
                .createCriteria(Usuario.class)
                .add(Restrictions.eq("id", id))
                .uniqueResult();
    }

}
