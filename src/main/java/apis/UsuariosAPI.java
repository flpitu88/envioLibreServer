/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apis;

import java.util.List;
import model.Usuario;

/**
 *
 * @author flpitu88
 */
public interface UsuariosAPI {

    public List<Usuario> getTodosLosUsuarios();
    
    public Usuario getUsuarioById(int id);
    
    public void guardarUsuario(Usuario us);

}
