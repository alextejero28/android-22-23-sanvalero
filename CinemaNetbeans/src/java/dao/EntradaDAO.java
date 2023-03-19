/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Alex
 */

import entidad.Entrada;
import interfacesDAO.SQLTools;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import motores.MotorMySQL;


public class EntradaDAO {
    private SQLTools miMotor = null;
    private static final String SELECT_ALL ="SELECT * FROM entrada where 1=1";

    public EntradaDAO() {
        this.miMotor = new MotorMySQL();
    }
     public ArrayList<Entrada> findAll(Entrada bean) {
        String sql_filtro = "";
        String sql_final = "";
        ArrayList<Entrada> lstEntradas = null;
        try {
            this.miMotor.connect();
           
            sql_final = SELECT_ALL + sql_filtro;
            
            ResultSet resultset = this.miMotor.executeQuery(sql_final);

            if (resultset != null) {
                lstEntradas = new ArrayList();

                while (resultset.next()) {
                    Entrada entidad = new Entrada();
                    entidad.setIdEntrada(resultset.getInt(1));
                    entidad.setDescripcion(resultset.getString(2));
                    entidad.setHorario(resultset.getString(3));
                    entidad.setPrecio(resultset.getDouble(4));
                    entidad.setIdUsuario(resultset.getInt(5));
                    entidad.setIdPelicula(resultset.getInt(6));
                    
                    lstEntradas.add(entidad);
                }
            }
            this.miMotor.disconnect();
        } catch (Exception ex) {
            Logger.getLogger(EntradaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstEntradas;
    }
}
