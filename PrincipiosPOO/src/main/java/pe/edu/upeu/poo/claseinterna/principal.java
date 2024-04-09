package pe.edu.upeu.poo.claseinterna;

public class principal {
    public static void main(String[] args) {
        Mama objMa= new Mama();
        objMa.alimentar();
        Mama.Bebe bb=objMa.new Bebe();
        bb.moverse();
        
    }

}
