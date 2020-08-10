public class math {
    public static void main(String[] args) {
        double raiz = Math.sqrt(25);
        int redondeo = (int)Math.round(raiz);

        double base = 5;
        double exponente = 3;
        int potencia = (int)Math.pow(base, exponente);

        System.out.println("el resultado de " + (int)base + " a la  " + (int)exponente + " es " + potencia); System.out.println(redondeo);
        System.out.println(raiz);
    }
}

