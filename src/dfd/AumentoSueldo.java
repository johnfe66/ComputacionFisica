/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dfd;

/**
 *
 * @author Johnfe Vargas
 */
public class AumentoSueldo {
    
    public int sueldo;
    float aumento;
    
    public void aumento(){
        
            if(sueldo>2000000){
            
                aumento=(float) (sueldo*0.10);
            }else{
                aumento=0;
            
            }
    
            System.out.println("Su aumento es:"+aumento);
    
    
    }
    
    
}
