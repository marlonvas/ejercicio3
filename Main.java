public class Main {

    public static void suma(int num1, int num2, int num3) {
        int resultado = num1 + num2 + num3;
        System.out.println(String.valueOf(resultado));
    }

    public static class Coche {
        static int puertas = 4;

        void addPuertas(int numPuertas) {
            puertas += numPuertas;
            System.out.println(String.valueOf(Coche.puertas));
        }
    }

    public static void main(String[] args) {
        suma(5, 10, 20);
        Coche deportivo = new Coche();
        deportivo.addPuertas(1);
    }
}