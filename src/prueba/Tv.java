
package prueba;


class  Tv{
String marca;
int pulgada;
boolean encendido;
int volumen;

    
   public Tv(String marca, int pulgada, boolean encendido, int volumen) {

    this.marca = marca;
    this.pulgada = pulgada;
    this.encendido = encendido;
    this.volumen = volumen;
}
    



public boolean encender(){
   // System.out.println("La TV  esta encendida");
    
    return this.encendido =  true;
    
}


public boolean apagar(){

   // System.out.println("La TV se esta apagando");
        return this.encendido =  false;


}

public int suvirVolumen(){
   //System.out.println(" Subiendo el volumen");
  
   return this.volumen +=5;

}

public int bajarVolumen(){
    //System.out.println("Bajando el bolumen");

   return this.volumen  -=5;


}
}