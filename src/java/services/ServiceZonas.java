package services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import models.Zona;

@Path("/zonas")
public class ServiceZonas {

    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Zona getZonaXml() {
        Zona zona
                = new Zona("Playa de Calblanque", "Cartagena", "Murcia");
        return zona;
    }

}
