package pe.edu.upeu.poo.encapinterface;

public class Loro implements Animal {

    @Override
    public void emitirSonido() {
        System.out.println(" esto es la implementacion "
                + "... no te olvides");

    }

    @Override
    public void dormir() {
        System.out.println("Zzz...zzzzz");

    }

    @Override
    public void habla() {
        System.out.println("hola manito no seas flojo pues ");

    }

}
