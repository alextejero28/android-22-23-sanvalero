/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidad.Contener;
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
public class ContenerDAO {
    private SQLTools miMotor = null;
    private static final String SELECT_ALL ="SELECT * FROM contener where 1=1";

    public ContenerDAO() {
        this.miMotor = new MotorMySQL();
    }
     public ArrayList<Contener> findAll(Contener bean) {
        String sql_filtro = "";
        String sql_final = "";
        ArrayList<Contener> lstContener = null;
        try {
            this.miMotor.connect();
           
            sql_final = SELECT_ALL + sql_filtro;
            
            ResultSet resultset = this.miMotor.executeQuery(sql_final);

            if (resultset != null) {
                lstContener = new ArrayList();

                while (resultset.next()) {
                    Contener entidad = new Contener();
                    entidad.setIdCine(resultset.getInt(1));
                    entidad.setIdPelicula(resultset.getInt(2));
                    lstContener.add(entidad);
                }
            }
            this.miMotor.disconnect();
        } catch (Exception ex) {
            Logger.getLogger(ContenerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstContener;
    }
}
