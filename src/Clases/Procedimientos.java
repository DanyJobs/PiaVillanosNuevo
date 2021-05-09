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
import javax.swing.JOptionPane;
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

    public static String AgregarPokemon(String nombre, String preevolucion, String evolucion, float altura, int peso, int idtipo, int ps) throws SQLException {
        CallableStatement entrada = Conexiones.getConnexion().prepareCall("{call spAgregarPokemon(?,?,?,?,?,?,?,?)}");
        String pMensaje = "";
        entrada.setString(1, nombre);;
        entrada.setString(2, preevolucion);
        entrada.setString(3, evolucion);
        entrada.setFloat(4, altura);
        entrada.setInt(5, peso);
        entrada.setInt(6, idtipo);
        entrada.setInt(7, ps);
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
        String[] titulo = {"idPokemon", "Nombre", "Preevolucion", "Evolucion", "Altura","Peso","Ps","tipo"};
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

    public static DefaultTableModel consultarPokemonById(String idPoke) throws SQLException {
        Connection con = Conexiones.getConnexion();
        DefaultTableModel cargar;
        String[] titulo = {"idPokemon", "Nombre", "Preevolucion", "Evolucion"};
        String[] nombre = new String[5];
        cargar = new DefaultTableModel(null, titulo);
        try {
            CallableStatement consultar = con.prepareCall("{call spConsultaPokemon(?,?,?,?)}");
            consultar.setInt(1, 3);
            consultar.setString(2, null);
            consultar.setInt(3, 3);
            consultar.registerOutParameter(4, java.sql.Types.VARCHAR);
            ResultSet respuesta = consultar.executeQuery();
            while (respuesta.next()) {
                nombre[0] = respuesta.getString("idPokemon");
                nombre[1] = respuesta.getString("Nombre");
                nombre[2] = respuesta.getString("Preevolucion");
                nombre[3] = respuesta.getString("Evolucion");
                cargar.addRow(nombre);
            }
            return cargar;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage(), "Error de conexion", JOptionPane.ERROR_MESSAGE);
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

}
