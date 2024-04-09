package pe.edu.upeu.poo.claseinterna;

public class Mama {

    String alimento = "Nutrientes";

    public void alimentar() {
        System.out.println(" Alimenta dando " + alimento);

    }

    class Bebe {

        double peso = 1;

        public void moverse() {
            System.out.println("Da pataditas");
            System.out.println("Su bebe da pataditas");
        }
    }

}
