public class cadenas2 {
    public static void main (String[] args){
        String frase ="Hoy es un buen día para aprender java";
        String subfrase = frase.substring(24) + " la bamba";
        System.out.println(subfrase);

        String alumno = "David", alumna ="david";
        System.out.println(alumno.equalsIgnoreCase(alumna));

    }
}
