/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Agente;

import jade.core.Agent;
/**
 *
 * @author Acer
 */
public class Agente extends Agent{
    public void setup(){
        this.addBehaviour(new Comportamiento());
    }
}
