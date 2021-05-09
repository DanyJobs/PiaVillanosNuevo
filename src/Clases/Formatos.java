/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author dany1
 */
public class Formatos {
     public static void eBoton (JButton btn){
        btn.setOpaque(false);
        btn.setContentAreaFilled(false);
        btn.setBorderPainted(false); 
    }
    
    public static void eLbl12(JLabel lbl){
         lbl.setFont(new Font("Berlin Sans FB",1,30));
         lbl.setHorizontalAlignment(JLabel.RIGHT);
         lbl.setForeground(new Color(0,0,0));
        //lbl.setForeground(new Color(17,162,65));
    }
    
    public static void eLbl14(JLabel lbl){
        lbl.setFont(new Font("Berlin Sans FB",1,25));
        lbl.setHorizontalAlignment(JLabel.RIGHT);
        lbl.setForeground(new Color(0,0,0));
    }
    public static void eLbl15(JLabel lbl){
        lbl.setFont(new Font("Berlin Sans FB",1,20));
        lbl.setHorizontalAlignment(JLabel.RIGHT);
        lbl.setForeground(new Color(0,0,0));
    }
    
    public static void eLbl16(JLabel lbl){
        lbl.setFont(new Font("Roboto",1,14));
        lbl.setHorizontalAlignment(JLabel.RIGHT);
        lbl.setForeground(new Color(255,255,255));
    }
    
    public static void eLbl18(JLabel lbl){
        lbl.setFont(new Font("Roboto",1,14));
        lbl.setHorizontalAlignment(JLabel.RIGHT);
        lbl.setForeground(new Color(255,255,255));
    }
    
    public static void eNota(JLabel lbl){
        lbl.setFont(new Font("Roboto",1,10));
        lbl.setHorizontalAlignment(JLabel.CENTER);
        lbl.setForeground(new Color(255,255,255));
    }
    
    public static void eTitulo(JLabel lbl){
        lbl.setFont(new Font("Roboto",1,18));
        lbl.setHorizontalAlignment(JLabel.CENTER);
        lbl.setForeground(new Color(255,255,255));
    }
    
    public static void eTitulo2(JLabel lbl){
        lbl.setFont(new Font("Roboto",1,32));
        lbl.setHorizontalAlignment(JLabel.CENTER);
        lbl.setForeground(new Color(255,255,255));
    }
    
    public static void eText(JTextField txt){
        txt.setFont(new Font("Roboto",1,14));
        txt.setHorizontalAlignment(JLabel.LEFT);
        txt.setBackground(new Color(245,245,245));
        txt.setForeground(new Color(255,0,0));
    }
    
    public static void eTextNum(JTextField txt){
        txt.setFont(new Font("Roboto",1,14));
        txt.setHorizontalAlignment(JLabel.RIGHT);
        txt.setBackground(new Color(245,245,245));
        txt.setForeground(new Color(255,0,0));
    }
    
    public static void eChk(JCheckBox chk){
        chk.setFont(new Font("Roboto",1,14));
        chk.setHorizontalAlignment(JLabel.LEFT);
        chk.setForeground(new Color(255,255,255));
        chk.setBackground(new Color(255,0,0,140));
    }
    
    public static void eCmb(JComboBox cmb){
        cmb.setFont(new Font("Roboto",1,14));
        cmb.setForeground(new Color(255,0,0));
    }
     public static void eFormularioCarga(JFrame formulario){
        formulario.setSize(new Dimension(300, 300));
        formulario.setMinimumSize(new Dimension(200, 200));
      
    }
    
        
    
    
    
}


