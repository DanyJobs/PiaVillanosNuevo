/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;
    import javax.swing.JOptionPane;


public class Conexiones {
    
    static Connection contacto = null;
    
    public static Connection getConnexion(){
        String url= "jdbc:sqlserver://den1.mssql7.gear.host:1433;databaseName=basepokemon";
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"No se pudo establecer la conexión" + e.getMessage(),
            "Error de conexion", JOptionPane.ERROR_MESSAGE);  
        }
        try{
            contacto=DriverManager.getConnection(url, "basepokemon", "Rx464y9i??L7");           
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"No se pudo establecer la conexión" + e.getMessage(),
            "Error de conexion", JOptionPane.ERROR_MESSAGE);
        }
        return contacto;
    }
    public static ResultSet Consulta(String consulta){
        Connection con = getConnexion();
        Statement declara;
        try{
            declara = con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        }catch (SQLException e){
            JOptionPane.showMessageDialog(null,"No se pudo establecer la conexión" + e.getMessage(),
            "Error de conexion", JOptionPane.ERROR_MESSAGE);
        }
        return null;
        
    }
    
}
