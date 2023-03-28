/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import entidad.Usuario;
import interfacesDAO.SQLTools;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import motores.MotorMySQL;

/**
 *
 * @author Alex
 */
public class UsuarioDAO {
        private SQLTools miMotor = null;
    private static final String SELECT_ALL ="SELECT * FROM usuario where 1=1";

    public UsuarioDAO() {
        this.miMotor = new MotorMySQL();
    }
     public ArrayList<Usuario> login(String correo, String contrasena) {
        String sql_filtro = " AND correo = '" + correo + "' AND contrasena = '" + contrasena + "'";
        String sql_final = "";
        ArrayList<Usuario> lstUsuarios = null;
        try {
            this.miMotor.connect();
           
            sql_final = SELECT_ALL + sql_filtro;
            
            ResultSet resultset = this.miMotor.executeQuery(sql_final);

            if (resultset != null) {
                lstUsuarios = new ArrayList();

                while (resultset.next()) {
                    Usuario entidad = new Usuario();
                    entidad.setIdUsuario(resultset.getInt(1));
                    entidad.setNombre(resultset.getString(2));
                    entidad.setApellido(resultset.getString(3));
                    entidad.setCorreo(resultset.getString(4));
                    entidad.setContrasena(resultset.getString(5));
                    lstUsuarios.add(entidad);
                }
            }
            this.miMotor.disconnect();
        } catch (Exception ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstUsuarios;
    }
}
