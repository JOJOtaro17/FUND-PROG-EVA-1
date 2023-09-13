/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication45;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class EVA1_9_AREA_TRIANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double base;
        double altura;
        double area;
        Scanner captu = new Scanner(System.in);
        System.out.println("introduce la base del triangulo");
        base= captu.nextDouble();
        System.out.println("introduce la altura del triangulo");
        altura= captu.nextDouble();
        area=(base * altura)/2;
        System.out.println("el area del triangulo es:");
        System.out.println(area);
        
    }
    
}
