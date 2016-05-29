/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utn.enviolibre.config;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.web.filter.RequestContextFilter;
import utn.enviolibre.resources.TarjetaCreditoResource;
import utn.enviolibre.resources.UsuarioResource;

public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        // Enable Spring DI and Jackson configuration
        register(RequestContextFilter.class);
        register(JacksonFeature.class);
        // Application resources
        register(UsuarioResource.class);
        register(TarjetaCreditoResource.class);
    }
}
