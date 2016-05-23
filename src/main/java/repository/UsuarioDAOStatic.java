/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

import java.util.ArrayList;
import java.util.List;
import model.Usuario;
import org.springframework.stereotype.Repository;

/**
 *
 * @author flpitu88
 */
@Repository
public class UsuarioDAOStatic implements UsuarioDAO {

    private List<Usuario> listado;

    public UsuarioDAOStatic() {

        listado = new ArrayList<>();
        Usuario us1 = new Usuario("Flavio", "Pietrolati");
        listado.add(us1);
    }

    @Override
    public void guardarUsuario(Usuario u) {
        listado.add(u);
    }

    @Override
    public Usuario getUsuarioByNombre(String nombre) {
        return listado.get(0);
    }

    @Override
    public List<Usuario> getTodosLosUsuarios() {
        return listado;
    }

}
