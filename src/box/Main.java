
package box;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        //crear un objeto a partir de una clase.(Instanciar)
        Box box = new Box();
        
        System.out.println("Dame el alto de Box");
        Scanner sc = new Scanner(System.in);
        box.alto = sc.nextInt();
        
        System.out.println("Dame el largo de Box");
        Scanner sc2 = new Scanner(System.in);
        box.ancho = sc2.nextInt();
        
        System.out.println("Dame el ancho de Box");
        Scanner sc3 = new Scanner(System.in);
        box.largo = sc3.nextInt();
        
        int volumen = box.calcularVolumen();
        
        System.out.println("volumen = " + volumen);
    }
    
    
}
