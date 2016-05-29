/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.enviolibre.resources;

import utn.enviolibre.apis.UsuariosAPI;
import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.stereotype.Component;
import utn.enviolibre.model.Usuario;

/**
 *
 * @author flpitu88
 */
@Component
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

    @GET
    @Path("{id}")
    @Produces("application/json")
    public Usuario getUsuarioById(@PathParam("id") String idUser) {
        return usuarioSrv.getUsuarioById(Integer.parseInt(idUser));
    }

    @POST
    @Consumes("application/json")
    public Response guardarUsuario(Usuario usuario) {
        usuarioSrv.guardarUsuario(usuario);
        return Response.status(Response.Status.CREATED).build();
    }

}
