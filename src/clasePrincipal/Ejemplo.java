/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasePrincipal;

import dfd.AreaTriangulo;
import dfd.AreaTriangulo;
import dfd.AumentoSueldo;
import javax.swing.JOptionPane;

/**
 *
 * @author Johnfe Vargas
 */
public class Ejemplo {

    
    public static void main(String[] args) {
         
            int area;
            AreaTriangulo areaTriangulo= new AreaTriangulo();
            
            areaTriangulo.altura=Float.parseFloat(JOptionPane.showInputDialog("Digite el valor de la altura"));
                    
                    //(float) 4.5;
            areaTriangulo.base=Float.parseFloat(JOptionPane.showInputDialog("Digite el valor de la Base"));
        
            
            areaTriangulo.calcularArea1();
            area=(int) areaTriangulo.calcularArea2();
            System.out.println("el area sin los decimales es :"+area);
            
            
            AumentoSueldo aumentoSueldo= new AumentoSueldo();
            
            aumentoSueldo.sueldo=Integer.parseInt(JOptionPane.showInputDialog("Digite el sueldo"));
            aumentoSueldo.aumento();
            
                    
    
    
    }
}




