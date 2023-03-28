/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package API;

import dao.UsuarioDAO;
import entidad.Usuario;
import java.util.ArrayList;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PUT;
import javax.ws.rs.core.MediaType;

/**
 * REST Web Service
 *
 * @author Alex
 */
@Path("lstUsuarios")
public class LstUsuariosResource {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of LstUsuariosResource
     */
    public LstUsuariosResource() {
    }

    /**
     * Retrieves representation of an instance of API.LstUsuariosResource
     * @return an instance of java.lang.String
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        ArrayList<Usuario> lstUsuarios = usuarioDAO.findAll(null);
        return Usuario.fromArrayListToJson(lstUsuarios);
    }

    /**
     * PUT method for updating or creating an instance of LstUsuariosResource
     * @param content representation for the resource
     */
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putJson(String content) {
        
    }
}
