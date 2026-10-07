
package prueba;


public class Prueba {

  
    public static void main(String[] args) {
    Tv tv1 = new Tv("Samsung", 55, false, 0);
    Tv tv2 = new Tv("LG", 32, false, 0);
    Tv tv3 = new Tv("TCL", 72, false, 0);
        
       
        System.out.println("TV 1: " + tv1.marca + " " + tv1.pulgada + " pulgadas");
        System.out.println("TV encendida: " + tv1.encender());
        System.out.println("Volumen: " + tv1. suvirVolumen());
        System.out.println("TV encendida: " + tv1.apagar());
        
        System.out.println("TV 2: " + tv2.marca + " " + tv2.pulgada + " pulgadas");
        System.out.println("TV encendida: " + tv2.encender());
        System.out.println("Volumen: " + tv2. suvirVolumen());
        System.out.println("TV encendida: " + tv2.apagar());
        
        System.out.println("TV 3: " + tv3.marca + " " + tv3.pulgada + " pulgadas");
        System.out.println("TV encendida: " + tv3.encender());
        System.out.println("Volumen: " + tv3. suvirVolumen());
        System.out.println("TV encendida: " + tv3.apagar());
        


    }
    
}
