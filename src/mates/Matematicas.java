package mates;

public class Matematicas {
    public static double generarNumeroPiIterativo(long pasos) {
        int aciertos = 0;
        double areaCuadrado = 4.0;
        Random random = new Random();

        for (int i = 0; i < pasos; i++) {
            double x = random.nextDouble() * 2.0 - 1.0;
            double y = random.nextDouble() * 2.0 - 1.0;
            if (Math.sqrt(x * x + y * y) <= 1.0) {
                aciertos++;
            }
        }

        return areaCuadrado * ((double) aciertos / (double) pasos);
    }
}
