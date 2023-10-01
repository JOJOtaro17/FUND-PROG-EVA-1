/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package circuito.electrico.pkg4;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class CircuitoElectrico4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double voltaje;
        double Rtotal;
        double Rtotal2;
        double Rtotal3;
        double Rtotal4;
        double Rtotal5;
        double Rcompleto;
        double corrientetotal;
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce la primera resistencia");
        Rtotal= captu.nextDouble();
        System.out.println("introduce la segunda resistencia");
        Rtotal2= captu.nextDouble();
        System.out.println("introduce la tercera resistenia");
        Rtotal3= captu.nextDouble();
        System.out.println("introduce la cuarta resistencia");
        Rtotal4= captu.nextDouble();
        System.out.println("introduce la quinta resistencia");
        Rtotal5= captu.nextDouble();
        System.out.println("introduce el valor del voltaje");
        voltaje= captu.nextDouble();
        Rtotal=1/Rtotal;
        Rtotal2=1/Rtotal2;
        Rtotal3=1/Rtotal3;
        Rtotal4=1/Rtotal4;
        Rtotal5=1/Rtotal5;
        Rcompleto=Rtotal+Rtotal2+Rtotal3+Rtotal4+Rtotal5;
        Rcompleto=1/Rcompleto;
        corrientetotal=voltaje/Rcompleto;
        System.out.println("la resistencia del circuito es:");
        System.out.println(Rcompleto);
        System.out.println("la corriente total es:");
        System.out.println(corrientetotal);
    }
    
}
