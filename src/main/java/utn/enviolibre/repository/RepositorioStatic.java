/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.enviolibre.repository;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.springframework.stereotype.Repository;
import utn.enviolibre.model.TarjetaCredito;
import utn.enviolibre.model.Usuario;

/**
 *
 * @author flpitu88
 */
@Repository
public class RepositorioStatic implements UsuarioDAO, TarjetaCreditoDAO {

    private final List<Usuario> listadoUser;
    private final List<TarjetaCredito> listadoTarj;

    public RepositorioStatic() {

        listadoUser = new ArrayList<>();
        listadoTarj = new ArrayList<>();

        Date fechaNac = new Date(1988, 1, 1);
        Usuario us1 = new Usuario(2, "Flavio", "Pietrolati",
                "flavio", "flpitu88", "flpitu88@hotmail.com",
                fechaNac, "Buenos Aires", "JLS", "San Martin");
        TarjetaCredito tc1 = new TarjetaCredito(1, "visa", "123", us1);
        us1.setTarjeta(tc1);

        listadoUser.add(us1);
        listadoTarj.add(tc1);
    }

    @Override
    public void guardarUsuario(Usuario u) {
        listadoUser.add(u);
    }

    @Override
    public Usuario getUsuarioByNombre(String nombre) {
        return listadoUser.get(0);
    }

    @Override
    public List<Usuario> getTodosLosUsuarios() {
        return listadoUser;
    }

    @Override
    public Usuario getUsuarioById(int id) {
        Usuario user = null;
        Iterator<Usuario> iterator = listadoUser.iterator();
        while (iterator.hasNext()) {
            Usuario next = iterator.next();
            if (next.getId() == id) {
                user = next;
            }
        }
        return user;
    }

    @Override
    public TarjetaCredito getTarjetaById(int id) {
        TarjetaCredito tc = null;
        Iterator<TarjetaCredito> iterator = listadoTarj.iterator();
        while (iterator.hasNext()) {
            TarjetaCredito next = iterator.next();
            if (next.getId() == id) {
                tc = next;
            }
        }
        return tc;
    }

    @Override
    public List<TarjetaCredito> getTarjetas() {
        return listadoTarj;
    }

    @Override
    public void guardarTarjetaCredito(TarjetaCredito tc) {
        listadoTarj.add(tc);
    }

}
