package tema_3;

public class Hipodromo {
    public static void main(String[] args) {
        Animal ani;
        ani = new Caballo("Afortunado", 57, "Diego Vera");
        ani.alimentar();
        Caballo caballo = (Caballo)ani;
        caballo.correr();
    }
}
