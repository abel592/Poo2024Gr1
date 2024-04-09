package pe.edu.upeu.poo.enumators;

enum GENERO {
    femenino, masculino
}

enum ESTADO_CIVIL {
    Soltero, Casado, Divorciado, Viudo
}


public class Persona {

    String nombre;
    String dni;
    String genero = GENERO.femenino.name();
    String estadoc;
    public static void main(String[] args) {
        Persona p= new Persona();
         Persona g=new Persona ();
         for(GENERO ge:GENERO.values()){
         System.out.println("Genero "+ge);
         }
        
        for ( ESTADO_CIVIL ec:ESTADO_CIVIL.values()){
            System.out.println("EC: "+ec);
           
        }
      
    }
}

