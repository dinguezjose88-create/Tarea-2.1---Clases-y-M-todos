
package prueba;


public class Prueba {

  
    public static void main(String[] args) {
        Tv tv1 = new Tv();
        
        Tv tv2 = new Tv();
                 
        Tv tv3 = new Tv();
        
        tv1.marca = "Samsung";
        tv1.pulgada = 55;
        tv1.volumen = 20;
        
        tv1.encender();
        tv1.bajandovolumen();
        tv1.bajandovolumen();
        tv1.apagar();
        
        
        tv2.marca = "LG";
        tv2.pulgada = 32;
        tv2.volumen = 50;
        
        tv2.encender();
        tv2.bajandovolumen();
        tv2.bajandovolumen();
        tv2.apagar();
        
        
        tv3.marca = "TCL";
        tv3.pulgada = 72;
        tv3.volumen = 80;
        
        tv3.encender();
        tv3.bajandovolumen();
        tv3.bajandovolumen();
        tv3.apagar();


    }
    
}
