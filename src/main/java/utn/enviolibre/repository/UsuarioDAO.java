/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.enviolibre.repository;

import java.util.List;
import utn.enviolibre.model.Usuario;

/**
 *
 * @author flpitu88
 */
public interface UsuarioDAO {
    
    public void guardarUsuario(Usuario u);
    
    public Usuario getUsuarioByNombre(String nombre);
    
    public List<Usuario> getTodosLosUsuarios();
    
    public Usuario getUsuarioById(int id);
    
}
