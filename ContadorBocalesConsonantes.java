
    import java.util.Scanner;

public class ContadorBocalesConsonantes {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una palabra (solo letras minúsculas): ");
        String palabra = sc.nextLine();

        int vocales = 0;
        int consonantes = 0;

        // Recorremos la palabra letra por letra
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            if (esLetra(letra)) {
                if (esVocal(letra)) {
                    vocales++;
                } else {
                    consonantes++;
                }
            }
        }

        System.out.println("\nCantidad de vocales: " + vocales);
        System.out.println("Cantidad de consonantes: " + consonantes);

        sc.close();
    }

    // Verifica si el carácter es una letra entre a-z
    public static boolean esLetra(char c) {
        return c >= 'a' && c <= 'z';
    }

    // Verifica si el carácter es una vocal
    public static boolean esVocal(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
    

