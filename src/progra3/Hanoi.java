/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package progra3;

import java.util.Scanner;

/**
 *
 * @author je_pa
 */
public class Hanoi {
    
    private int numDiscos;
    private int torreIni;
    private int torreFin;
    
    
    
    public void menu(){
        
        Scanner in = new Scanner(System.in);
        
        
    System.out.println("Introducir condiciones de la torre: ");
    System.out.println("Numero de Discos: ");
    this.setNumDiscos(in.nextInt());
    System.out.println("Torre Inicial: (Entre 1 y 3)");
    this.setTorreIni(in.nextInt());
    System.out.println("Torre Final: (Entre 1 y 3 distinto que la inicial)");
    this.setTorreFin(in.nextInt());
    calcular(getNumDiscos(),getTorreIni(),getTorreFin());
    }

    private void calcular(int Dis,int Ini, int fin){
    
        int torreInicio = Ini;
        int torreFinal = fin;
        int torreAyuda = 0;
        int discos = Dis;
        
        if ((torreInicio == 2 || torreInicio == 3) && (torreFinal == 2 || torreFinal == 3)) {
            torreAyuda = 1;
        } else if ((torreInicio == 1 || torreInicio == 3) && (torreFinal == 1 || torreFinal == 3)) {
            torreAyuda = 2;
        } else {
            torreAyuda = 3;
        }
        moverdiscos(discos,torreInicio, torreAyuda, torreFinal);
    }
    
    public static void moverdiscos(int n, int origen,  int auxiliar, int destino){
    if(n==1)
        System.out.println("mover disco de " + origen + " a " + destino);
    else{
         moverdiscos(n-1, origen, destino, auxiliar);
        System.out.println("mover disco de "+ origen + " a " + destino);
        moverdiscos(n-1, auxiliar, origen, destino);
   }
 }
    
    
    /**
     * @return the numDiscos
     */
    public int getNumDiscos() {
        return numDiscos;
    }

    /**
     * @param numDiscos the numDiscos to set
     */
    public void setNumDiscos(int numDiscos) {
        this.numDiscos = numDiscos;
    }

    /**
     * @return the torreIni
     */
    public int getTorreIni() {
        return torreIni;
    }

    /**
     * @param torreIni the torreIni to set
     */
    public void setTorreIni(int torreIni) {
        this.torreIni = torreIni;
    }

    /**
     * @return the torreFin
     */
    public int getTorreFin() {
        return torreFin;
    }

    /**
     * @param torreFin the torreFin to set
     */
    public void setTorreFin(int torreFin) {
        this.torreFin = torreFin;
    }
}
