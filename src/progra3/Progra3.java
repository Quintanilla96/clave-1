/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra3;

import java.util.Scanner;
import model.Simulation;

/**
 *
 * @author je_pa
 */
public class Progra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opc;
        boolean rep = true;
        
        while(rep){
        Scanner in = new Scanner(System.in);
        Hanoi han = new Hanoi();
        
        System.out.println("Elija una opción: ");
        System.out.println("1-) Torre de Hanoi");
        System.out.println("2-) Simulacion Montecarlo");
        System.out.println("3-) Salir");
        
        opc = in.nextInt();
        
        switch(opc){
            case 1:
                han.menu();
                rep = true;
                break;
            case 2:
                Simulation sim = new Simulation(6, (int) 1e7); //3 seconds using 6 threads
        System.out.println(sim.pi());  
                rep = true;
                break;
                
            default:
                rep = false;
                break;
        }
        }
    }
    
}
