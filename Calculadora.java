import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CALCULADORA BÁSICA ===");

        System.out.print("Ingrese el primer número:  ");
        double num1 = sc.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.println("\nSeleccione la operación:");
        System.out.println("1. Suma (+)");
        System.out.println("2. Resta (-)");
        System.out.println("3. Multiplicación (*)");
        System.out.println("4. División (/)");
        System.out.print("Opcion (1-4): ");
        int opcion = sc.nextInt();

        double resultado;
        switch (opcion) {
            case 1:
            resultado = sumar(num1, num2);
            System.out.println("Resultado: " + resultado);
            break;

            case 2:
            resultado = restar(num1, num2);
            System.out.println("Resultado: " + resultado);
            break;

            case 3: 
            resultado = multiplicar(num1, num2);
            System.out.println("Resultado: " + resultado);
            break;
            
            case 4:
            if (num2 != 0) {
                resultado = dividir(num1, num2);
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println ("Error: No se puede dividir entre cero.");
            }
            break;
        default:
        System.out.println("Opcion inválida. Debe ser entre 1 y 4.");    
        }
        
        sc.close();
    }
        // Metodos para operaciones

        public static double sumar(double a, double b) {
        return a + b;
    }

    public static double restar(double a, double b) {
        return a - b;
    }

    public static double multiplicar(double a, double b) {
        return a * b;
    }

    public static double dividir(double a, double b) {
        return a / b;







    }

}