/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

import dao.PeliculaDAO;
import entidad.Pelicula;
import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author S1-PC64
 */
@Path("comprarEntradas/{cine}")
public class ComprarEntradaResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of ComprarEntradaResource
     */
    public ComprarEntradaResource() {
    }

    /**
     * Retrieves representation of an instance of API.ComprarEntradaResource
     * @param cine
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson(@PathParam("cine") String cine) {
        PeliculaDAO peliDAO = new PeliculaDAO();
        ArrayList<Pelicula> lstPeliculas = peliDAO.findAllFiltros("c", cine, "-1", "0");
        return Pelicula.fromArrayListToJson(lstPeliculas);
    }

    /**
     * PUT method for updating or creating an instance of ComprarEntradaResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
    }
}
