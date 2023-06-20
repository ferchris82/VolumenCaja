package box;

import java.util.Scanner;

public class Box {
    
    //Atributos
    int largo;
    int ancho;
    int alto;
    
    //Constructor vacío
    public Box(){
        System.out.println("Constructor sin parametros");
    }
    
    //Metodo
    public int calcularVolumen(){
        return largo * alto * ancho;
    }
}
