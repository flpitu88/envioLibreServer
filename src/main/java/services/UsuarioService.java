/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import apis.UsuariosAPI;
import java.util.List;
import model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UsuarioDAO;

/**
 *
 * @author flpitu88
 */
@Service
public class UsuarioService implements UsuariosAPI {

    @Autowired
    private UsuarioDAO usDao;

    @Override
    public List<Usuario> getTodosLosUsuarios() {
        return usDao.getTodosLosUsuarios();
    }

}
