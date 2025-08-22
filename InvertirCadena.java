
 import java.util.Scanner;

public class InvertirCadena {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una cadena de texto: ");
        String texto = sc.nextLine();

        StringBuilder textoInvertido = new StringBuilder();

        // Recorremos la cadena desde el final hasta el inicio
        for (int i = texto.length() - 1; i >= 0; i--) {
            textoInvertido.append(texto.charAt(i));
        }

        System.out.println("Cadena invertida: " + textoInvertido);

        sc.close();
    }
}
    

