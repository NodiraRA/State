/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package state;

/**
 *
 * @author nodira
 */
public class Sleeping implements Activity{

    @Override
    public void justDoIt() {
        System.out.println("Sleeping...");
    }
    
}
