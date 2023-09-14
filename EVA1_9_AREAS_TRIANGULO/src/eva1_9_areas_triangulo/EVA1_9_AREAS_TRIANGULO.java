/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_areas_triangulo;

import java.util.Scanner;

/**
 *
 * @author Joshua
 */
public class EVA1_9_AREAS_TRIANGULO {

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
