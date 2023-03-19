/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidad.Cine;
import interfacesDAO.SQLTools;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import motores.MotorMySQL;

/**
 *
 * @author S2-PC00
 */
public class CineDAO {
    private SQLTools miMotor = null;
    private static final String SELECT_ALL ="SELECT * FROM cine where 1=1";

    public CineDAO() {
        this.miMotor = new MotorMySQL();
    }
     public ArrayList<Cine> findAll(Cine bean) {
        String sql_filtro = "";
        String sql_final = "";
        ArrayList<Cine> lstCines = null;
        try {
            this.miMotor.connect();
           
            sql_final = SELECT_ALL + sql_filtro;
            
            ResultSet resultset = this.miMotor.executeQuery(sql_final);

            if (resultset != null) {
                lstCines = new ArrayList();

                while (resultset.next()) {
                    Cine entidad = new Cine();
                    entidad.setIdCine(resultset.getInt(1));
                    entidad.setNombre(resultset.getString(2));
                    entidad.setDireccion(resultset.getString(3));
                    entidad.setCapacidad(resultset.getInt(4));
                    lstCines.add(entidad);
                }
            }
            this.miMotor.disconnect();
        } catch (Exception ex) {
            Logger.getLogger(CineDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstCines;
    }
}
