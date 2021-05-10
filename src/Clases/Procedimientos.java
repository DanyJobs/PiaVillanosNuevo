/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.event.KeyEvent;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dany1
 */
public class Procedimientos {

    static Connection conexion = null;
    static Statement sentencia;
    static ResultSet resultado;

    public static void txtNumeroKeyTyped(java.awt.event.KeyEvent evt, JTextField texto) {
        int codigo = evt.getKeyCode();
        char[] letras = texto.getText().toCharArray();
        int contador = 0;
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '.' && contador != 2) {
            evt.consume();
        }
        if (evt.getKeyChar() == '.' && texto.getText().contains(".") && contador != 2) {
            evt.consume();
        }
    }

    public static void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt, JTextField texto) {
        int codigo = evt.getKeyCode();
        char[] letras = texto.getText().toCharArray();
        int contador = 0;
        if (texto.getText().length() >= 14) {
            evt.consume();
        }
        if (!Character.isDigit(evt.getKeyChar()) && evt.getKeyChar() != '+' && contador != 2) {
            evt.consume();
        }
        if (evt.getKeyChar() == '+' && texto.getText().contains("+") && contador != 2) {
            evt.consume();
        }
    }

    public static String AgregarPokemon(String nombre, String preevolucion, String evolucion, float altura, int peso, int ps, int idtipo) throws SQLException {
        CallableStatement entrada = Conexiones.getConnexion().prepareCall("{call spAgregarPokemon(?,?,?,?,?,?,?,?)}");
        String pMensaje = "";
        entrada.setString(1, nombre);;
        entrada.setString(2, preevolucion);
        entrada.setString(3, evolucion);
        entrada.setFloat(4, altura);
        entrada.setInt(5, peso);
        entrada.setInt(6, ps);
        entrada.setInt(7, idtipo);
        entrada.registerOutParameter(8, java.sql.Types.VARCHAR);
        entrada.execute();
        pMensaje = entrada.getString(8);
        return pMensaje;
    }

    public static String ModificarPokemon(int id, String nombre, String preevolucion, String evolucion, float altura, float peso, int idtipo, int ps) throws SQLException {
        CallableStatement entrada = Conexiones.getConnexion().prepareCall("{call spActualizarPokemon(?,?,?,?,?,?,?,?,?)}");
        String pMensaje = "";
        entrada.setInt(1, id);
        entrada.setString(2, nombre);
        entrada.setString(3, preevolucion);
        entrada.setString(4, evolucion);
        entrada.setFloat(5, altura);
        entrada.setFloat(6, peso);
        entrada.setInt(7, idtipo);
        entrada.setInt(8, ps);
        entrada.registerOutParameter(9, java.sql.Types.VARCHAR);
        entrada.execute();
        pMensaje = entrada.getString(9);
        return pMensaje;
    }

    public static DefaultTableModel consultarPokemon(String idPoke) throws SQLException {
        Connection con = Conexiones.getConnexion();
        DefaultTableModel cargar;
        String[] titulo = {"idPokemon", "Nombre", "Preevolucion", "Evolucion", "Altura", "Peso", "Ps", "tipo"};
        String[] nombre = new String[8];
        String respuestaSql = null;
        cargar = new DefaultTableModel(null, titulo);
        try {
            CallableStatement consultar = con.prepareCall("{call spConsultaPokemon(?,?,?,?)}");
            consultar.setInt(1, 1);
            consultar.setString(2, idPoke);
            consultar.setString(3, null);
            consultar.registerOutParameter(4, java.sql.Types.VARCHAR);
            ResultSet respuesta = consultar.executeQuery();

            while (respuesta != null && respuesta.next()) {
                nombre[0] = respuesta.getString("idPokemon");
                nombre[1] = respuesta.getString("Nombre");
                nombre[2] = respuesta.getString("Preevolucion");
                nombre[3] = respuesta.getString("Evolucion");
                nombre[4] = respuesta.getString("Altura");
                nombre[5] = respuesta.getString("Peso");
                nombre[6] = respuesta.getString("Ps");
                nombre[7] = respuesta.getString("tipo");
                cargar.addRow(nombre);
            }
            return cargar;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage(), "Error de conexion", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }

    public static DefaultTableModel consultarPokemonById(int idPoke) throws SQLException {
        Connection con = Conexiones.getConnexion();
        DefaultTableModel cargar;
        String[] titulo = {"idPokemon", "Nombre", "Preevolucion", "Evolucion", "Altura", "Peso", "Ps", "tipo"};
        String[] nombre = new String[8];
        String respuestaSql = null;
        cargar = new DefaultTableModel(null, titulo);
        try {
            CallableStatement consultar = con.prepareCall("{call spConsultaPokemon(?,?,?,?)}");
            consultar.setInt(1, 3);
            consultar.setString(2, null);
            consultar.setInt(3, idPoke);
            consultar.registerOutParameter(4, java.sql.Types.VARCHAR);
            ResultSet respuesta = consultar.executeQuery();

            while (respuesta != null && respuesta.next()) {
                nombre[0] = respuesta.getString("idPokemon");
                nombre[1] = respuesta.getString("Nombre");
                nombre[2] = respuesta.getString("Preevolucion");
                nombre[3] = respuesta.getString("Evolucion");
                nombre[4] = respuesta.getString("Altura");
                nombre[5] = respuesta.getString("Peso");
                nombre[6] = respuesta.getString("Ps");
                nombre[7] = respuesta.getString("tipo");
                cargar.addRow(nombre);
            }
            return cargar;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage(), "Error de conexion", JOptionPane.ERROR_MESSAGE);
            return null;
        }

    }

    public static ResultSet BuscarConsultas(String pConsulta) throws SQLException {
        Connection con = Conexiones.getConnexion();
        Statement declara;
        try {
            declara = con.createStatement();
            ResultSet respuesta = declara.executeQuery(pConsulta);
            return respuesta;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR " + e.getMessage(), "Error de conexion", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public static void limpiarTabla(JTable tabla) {
        try {
            DefaultTableModel tb = (DefaultTableModel) tabla.getModel();
            int a = tabla.getRowCount()-1 ;
            for (int i = a; i >= 0; i--) {
                tb.removeRow(tb.getRowCount()-1);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al limpiar la tabla.");
        }
    }

    public static String EliminarPokemon(int IdPokemon) throws SQLException {
        CallableStatement entrada = Conexiones.getConnexion().prepareCall("{call spEliminarPokemon(?,?)}");
        String pMensaje = "";
        entrada.setInt(1, IdPokemon);
        entrada.registerOutParameter(2, java.sql.Types.VARCHAR);
        entrada.execute();
        pMensaje = entrada.getString(2);
        return pMensaje;
    }
    public static String EliminarEntrenador(int IdEntrenador) throws SQLException {
        CallableStatement entrada = Conexiones.getConnexion().prepareCall("{call spEliminarEntrenador(?,?)}");
        String pMensaje = "";
        entrada.setInt(1, IdEntrenador);
        entrada.registerOutParameter(2, java.sql.Types.VARCHAR);
        entrada.execute();
        pMensaje = entrada.getString(2);
        return pMensaje;
    }
    public static String AgregarEntrenador(String nombre, String app, String apm, java.sql.Date fechaNac, String Tel, String direccion, int Ciudad) throws SQLException {
        CallableStatement entrada = Conexiones.getConnexion().prepareCall("{call spAgregarEntrenador(?,?,?,?,?,?,?,?)}");
        String pMensaje = "";
        entrada.setString(1, nombre);;
        entrada.setString(2, app);
        entrada.setString(3, apm);
        entrada.setDate(4, fechaNac);
        entrada.setString(5, Tel);
        entrada.setString(6, direccion);
        entrada.setInt(7, Ciudad);
        entrada.registerOutParameter(8, java.sql.Types.VARCHAR);
        entrada.execute();
        pMensaje = entrada.getString(8);
        return pMensaje;
    }
    
     public static DefaultTableModel consultarEntrenador(String Entrenador) throws SQLException {
        Connection con = Conexiones.getConnexion();
        DefaultTableModel cargar;
        String[] titulo = {"idEntrenador", "Nombre Completo", "Ciudad"};
        String[] nombre = new String[3];
        String respuestaSql = null;
        cargar = new DefaultTableModel(null, titulo);
        try {
            CallableStatement consultar = con.prepareCall("{call spConsultaEntrenador(?,?,?,?)}");
            consultar.setInt(1, 1);
            consultar.setString(2, Entrenador);
            consultar.setString(3, null);
            consultar.registerOutParameter(4, java.sql.Types.VARCHAR);
            ResultSet respuesta = consultar.executeQuery();

            while (respuesta != null && respuesta.next()) {
                nombre[0] = respuesta.getString("idEntrenador");
                nombre[1] = respuesta.getString("Nombre Completo");
                nombre[2] = respuesta.getString("Ciudad");               
                cargar.addRow(nombre);
            }
            return cargar;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage(), "Error de conexion", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
     
     
       public static DefaultTableModel consultarEntrenadorById(int id) throws SQLException {
        Connection con = Conexiones.getConnexion();
        DefaultTableModel cargar;        
        String[] titulo = {"idEntrenador", "Nombre", "ApellidoP", "ApellidoM", "FechaN", "NCelular", "Direccion", "idCiudad"};
        String[] nombre = new String[8];  
        cargar = new DefaultTableModel(null, titulo);
        try {
            CallableStatement consultar = con.prepareCall("{call spConsultaEntrenador(?,?,?,?)}");
            consultar.setInt(1, 3);
            consultar.setString(2, null);
            consultar.setInt(3, id);
            consultar.registerOutParameter(4, java.sql.Types.VARCHAR);
            ResultSet respuesta = consultar.executeQuery();

            while (respuesta != null && respuesta.next()) {
                nombre[0] = respuesta.getString("idEntrenador");
                nombre[1] = respuesta.getString("Nombre");
                nombre[2] = respuesta.getString("ApellidoP");
                nombre[3] = respuesta.getString("ApellidoM");
                nombre[4] = respuesta.getString("FechaN");
                nombre[5] = respuesta.getString("NCelular");
                nombre[6] = respuesta.getString("Direccion");
                nombre[7] = respuesta.getString("idCiudad");
                cargar.addRow(nombre);
            }
            return cargar;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage(), "Error de conexion", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
        public static String ModificarEntrenador(int id, String nombre, String app, String apm, java.sql.Date FecNac, String tel, String dir, int Ciudad) throws SQLException {
        CallableStatement entrada = Conexiones.getConnexion().prepareCall("{call spActualizarEntrenador(?,?,?,?,?,?,?,?,?)}");
        String pMensaje = "";
        entrada.setInt(1, id);
        entrada.setString(2, nombre);
        entrada.setString(3, app);
        entrada.setString(4, apm);
        entrada.setDate(5, FecNac);
        entrada.setString(6, tel);
        entrada.setString(7, dir);
        entrada.setInt(8, Ciudad);
        entrada.registerOutParameter(9, java.sql.Types.VARCHAR);
        entrada.execute();
        pMensaje = entrada.getString(9);
        return pMensaje;
    }  
        public static String AsignarPokemonEntrenador(int entrenador, int pokemon) throws SQLException {
        CallableStatement entrada = Conexiones.getConnexion().prepareCall("{call spAgregarPokeEntrena(?,?,?)}");
        String pMensaje = "";
        entrada.setInt(1, entrenador);
        entrada.setInt(2, pokemon);        
        entrada.registerOutParameter(3, java.sql.Types.VARCHAR);
        entrada.execute();
        pMensaje = entrada.getString(3);
        return pMensaje;
    }       
         public static DefaultTableModel consultarAsfignarEntrenador() throws SQLException {
        Connection con = Conexiones.getConnexion();
        DefaultTableModel cargar;        
        String[] titulo = {"Entrenador", "Pokemon"};
        String[] nombre = new String[3];  
        cargar = new DefaultTableModel(null, titulo);
        try {
            CallableStatement consultar = con.prepareCall("{call spConsultaEntrenadorPokemon()}");  
            ResultSet respuesta = consultar.executeQuery();
            while (respuesta != null && respuesta.next()) {
                nombre[0] = respuesta.getString("Entrenador");
                nombre[1] = respuesta.getString("Pokemon");               
                cargar.addRow(nombre);
            }
            return cargar;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e.getMessage(), "Error de conexion", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }      
}
