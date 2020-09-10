/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgenteContador;
import jade.core.Agent;
/**
 *
 * @author Acer
 */
public class Contador extends Agent{
    
    public void setup(){   
        this.addBehaviour(new Comportamiento());
    }
}
