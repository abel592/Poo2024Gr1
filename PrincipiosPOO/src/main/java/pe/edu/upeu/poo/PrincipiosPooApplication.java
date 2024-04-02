package pe.edu.upeu.poo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pe.edu.upeu.poo.cobjeto.Persona;

@SpringBootApplication
public class PrincipiosPooApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrincipiosPooApplication.class, args);
                Persona person = new Persona();//aplicanado objetos//para usar sus atributos//
                person.setNombre("abel");
                person.setEdad(18);
                person.edad=20;
                System.out.println("so soy "+person.getNombre()+
                " y tengo "+person.getEdad()+ " años");
                person.saludo();
	}

}
