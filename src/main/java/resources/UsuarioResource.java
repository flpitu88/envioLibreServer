/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resources;

import apis.UsuariosAPI;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import model.Usuario;

/**
 *
 * @author flpitu88
 */
@Path("/usuarios")
@Produces(MediaType.APPLICATION_JSON)
public class UsuarioResource {

    private final UsuariosAPI usuarioSrv;

    @Inject
    public UsuarioResource(UsuariosAPI usService) {
        this.usuarioSrv = usService;
    }

    @GET
    @Produces("application/json")
    public List<Usuario> getUsuarios() {
        return usuarioSrv.getTodosLosUsuarios();
    }

}
