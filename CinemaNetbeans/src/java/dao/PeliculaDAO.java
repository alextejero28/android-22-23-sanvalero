/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;


import entidad.Pelicula;
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
public class PeliculaDAO {
    private SQLTools miMotor = null;
    private static final String SELECT_TOP_PELICULAS ="SELECT * FROM pelicula where 1=1 ORDER BY rating DESC";
    private static final String SELECT_HISTORICO_PELICULAS ="SELECT * FROM pelicula where 1=1 ORDER BY historicoEntradas DESC";
    private static final String SELECT_FILTROS_PELICULAS = "SELECT * FROM pelicula where 1=1";

    public PeliculaDAO() {
        this.miMotor = new MotorMySQL();
    }
     public ArrayList<Pelicula> findAllTop(Pelicula bean) {
        String sql_filtro = "";
        String sql_final = "";
        ArrayList<Pelicula> lstPeliculas = null;
        try {
            this.miMotor.connect();
           
            sql_final = SELECT_TOP_PELICULAS + sql_filtro;
            
            ResultSet resultset = this.miMotor.executeQuery(sql_final);

            if (resultset != null) {
                lstPeliculas = new ArrayList();

                while (resultset.next()) {
                    Pelicula entidad = new Pelicula();
                    entidad.setIdPelicula(resultset.getInt(1));
                    entidad.setTitulo(resultset.getString(2));
                    entidad.setSinopsis(resultset.getString(3));
                    entidad.setCategoria(resultset.getString(4));
                    entidad.setCaracteristicas(resultset.getString(5));
                    entidad.setTrailer(resultset.getString(6));
                    entidad.setEdadRecomendada(resultset.getInt(7));
                    entidad.setHistoricoEntradas(resultset.getInt(8));
                    entidad.setButacasLibre(resultset.getInt(9));
                    entidad.setButacasOcupadas(resultset.getInt(10));
                    entidad.setDuracion(resultset.getInt(11));
                    entidad.setRating(resultset.getDouble(12));
                    lstPeliculas.add(entidad);
                }
            }
            this.miMotor.disconnect();
        } catch (Exception ex) {
            Logger.getLogger(PeliculaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstPeliculas;
    }
     
     public ArrayList<Pelicula> findAllFiltros(String categoria, String cine, String edad, String palabra) {
         String sql_filtro = "";
         if (!"c".equals(categoria)) {
             sql_filtro += " AND categoria = '" + categoria + "'";
         }
         if (!"-1".equals(edad)){
             int edadRecomendada = Integer.parseInt(edad);
             sql_filtro += " AND edadRecomendada >= " + edadRecomendada;
         }
         if (!"0".equals(palabra)){
             sql_filtro += " AND titulo LIKE '%" + palabra + "%'"; 
         }
         if (!"c".equals(cine)){
             sql_filtro += " AND idPelicula IN (SELECT idPelicula FROM contener WHERE idCine IN (SELECT idCine FROM cine WHERE nombre = '" + cine + "'))";
         }
        String sql_final = "";
        ArrayList<Pelicula> lstPeliculas = null;
        try {
            this.miMotor.connect();
           
            sql_final = SELECT_FILTROS_PELICULAS + sql_filtro;
            
            ResultSet resultset = this.miMotor.executeQuery(sql_final);

            if (resultset != null) {
                lstPeliculas = new ArrayList();

                while (resultset.next()) {
                    Pelicula entidad = new Pelicula();
                    entidad.setIdPelicula(resultset.getInt(1));
                    entidad.setTitulo(resultset.getString(2));
                    entidad.setSinopsis(resultset.getString(3));
                    entidad.setCategoria(resultset.getString(4));
                    entidad.setCaracteristicas(resultset.getString(5));
                    entidad.setTrailer(resultset.getString(6));
                    entidad.setEdadRecomendada(resultset.getInt(7));
                    entidad.setHistoricoEntradas(resultset.getInt(8));
                    entidad.setButacasLibre(resultset.getInt(9));
                    entidad.setButacasOcupadas(resultset.getInt(10));
                    entidad.setDuracion(resultset.getInt(11));
                    entidad.setRating(resultset.getDouble(12));
                    lstPeliculas.add(entidad);
                }
            }
            this.miMotor.disconnect();
        } catch (Exception ex) {
            Logger.getLogger(PeliculaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstPeliculas;
    }
     
     public ArrayList<Pelicula> findAllHistorico(Pelicula bean) {
        String sql_filtro = "";
        String sql_final = "";
        ArrayList<Pelicula> lstPeliculas = null;
        try {
            this.miMotor.connect();
           
            sql_final = SELECT_HISTORICO_PELICULAS + sql_filtro;
            
            ResultSet resultset = this.miMotor.executeQuery(sql_final);

            if (resultset != null) {
                lstPeliculas = new ArrayList();

                while (resultset.next()) {
                    Pelicula entidad = new Pelicula();
                    entidad.setIdPelicula(resultset.getInt(1));
                    entidad.setTitulo(resultset.getString(2));
                    entidad.setSinopsis(resultset.getString(3));
                    entidad.setCategoria(resultset.getString(4));
                    entidad.setCaracteristicas(resultset.getString(5));
                    entidad.setTrailer(resultset.getString(6));
                    entidad.setEdadRecomendada(resultset.getInt(7));
                    entidad.setHistoricoEntradas(resultset.getInt(8));
                    entidad.setButacasLibre(resultset.getInt(9));
                    entidad.setButacasOcupadas(resultset.getInt(10));
                    entidad.setDuracion(resultset.getInt(11));
                    entidad.setRating(resultset.getDouble(12));
                    lstPeliculas.add(entidad);
                }
            }
            this.miMotor.disconnect();
        } catch (Exception ex) {
            Logger.getLogger(PeliculaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lstPeliculas;
    }
}
