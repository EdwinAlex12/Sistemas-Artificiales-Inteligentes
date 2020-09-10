/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgenteContador;
import jade.core.behaviours.Behaviour; 
/**
 *
 * @author Acer
 */
public class Comportamiento extends Behaviour {
    int contando=0;
    
   public void action(){
       System.out.println("Numero: "+contando);
       contando++;
   }
  
   public boolean done(){
       if (contando >= 100)
           return true;
       return false;
   }
}
