/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JComboBox;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author dany1
 */
public class Combo {
    private int codigo;
    private String nombre;

    public Combo(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Combo() {
        
    }
    
    public int getCodigo() {
        return codigo;
    }

    public  void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void llenar_combo(javax.swing.JComboBox<Combo>combo,String SSQL,String id,String nombre){
        try {
            String sql="";
         Connection Conectar = Conexiones.getConnexion();        
         PreparedStatement pst = Conectar.prepareStatement(SSQL);
         ResultSet resultado=pst.executeQuery();         
         combo.removeAllItems();        
         combo.addItem(new Combo(0,"Seleccionar"));      
                while (resultado.next()) {
                   combo.addItem(new Combo(
                   resultado.getInt(id),
                   resultado.getString(nombre)        
                   ));                 
               }             
                    
        } catch (Exception e) {
         Logger.getLogger(Combo.class.getName()).log(Level.SEVERE,null,e);
         }
    }
    
    @Override
    public String toString(){
    return nombre;   
    }

   
    
}
