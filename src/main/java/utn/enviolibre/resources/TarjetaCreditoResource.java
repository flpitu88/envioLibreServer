/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.enviolibre.resources;

import utn.enviolibre.apis.TarjetasCreditoAPI;
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
import utn.enviolibre.model.TarjetaCredito;

/**
 *
 * @author flpitu88
 */
@Component
@Path("/tarjetas")
@Produces(MediaType.APPLICATION_JSON)
public class TarjetaCreditoResource {

    private final TarjetasCreditoAPI tarjSrv;

    @Inject
    public TarjetaCreditoResource(TarjetasCreditoAPI tarjSrv) {
        this.tarjSrv = tarjSrv;
    }

    @GET
    @Produces("application/json")
    public List<TarjetaCredito> getTarjetas() {
        return tarjSrv.getTodasLasTarjetas();
    }

    @GET
    @Path("{id}")
    @Produces("application/json")
    public TarjetaCredito getTarjetaById(@PathParam("id") String idTarj) {
        return tarjSrv.getTarjetaById(Integer.parseInt(idTarj));
    }

    @POST
    @Consumes("application/json")
    public Response guardarUsuario(TarjetaCredito tc) {
        tarjSrv.guardarTarjetaCredito(tc);
        return Response.status(Response.Status.CREATED).build();
    }
}
