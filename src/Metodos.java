/*
 * este programa es para crear las acciones de las motos
 *

/**
 *
 * @author Juan David Gomez Pico
 */
public class Metodos {

    /**
     * @param args linea de argumentos del metodo principal
     */
    public static void main(String[] args) {
        // aca crearemos nuestro objetos
        
        moto cuatrimoto = new moto();
        System.out.println("la cuatrimoto va a hacer lo siguiente : ");
        cuatrimoto.acelearmoto();
        System.out.println("------------------------------------------");
        //segundo objeto moto de carreras
        
        moto motocarreras = new moto(); 
        System.out.println("la moto de carreras va a hacer lo siguiente: ");
        motocarreras.encendermoto();
        System.out.println("------------------------------------------");
        //tercer objeto moto trial
         moto mototrial = new moto();
        System.out.println("la moto trial va a hacer lo siguiente: ");
        motocarreras.apagarmoto();
        System.out.println("------------------------------------------");
        //cuarto objeto moto acuatica
         moto motoacuatica = new moto();
       
        System.out.println("la moto acuatica va a hacer lo siguiente: ");
        motocarreras.frenarmoto();
         System.out.println("------------------------------------------");
          //quinto objeto moto de nieve
         moto motonieve = new moto();
     
        System.out.println("la moto de nieve va a hacer lo siguiente: ");
        motocarreras.girarmoto();
         System.out.println("------------------------------------------");
        
        
    }
    
}