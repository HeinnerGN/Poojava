package calculadora;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        Scanner dato = new Scanner(System.in);
        Calculadora objCalcular = new Calculadora();
        
        while (true) {
            int num1 = Usuario.pedirnumero("Ingrese el primer numero:");
            int num2 = Usuario.pedirnumero("Ingrese el segundo numero:");

            System.out.println("Elige la operacion (sumar, restar, multiplicar, dividir):");
            String operacion = dato.next().toLowerCase();

            int resultado = 0;
            switch (operacion) {
                case "sumar":
                    resultado = objCalcular.Sumar(num1, num2);
                    break;
                case "restar":
                    resultado = objCalcular.Restar(num1, num2);
                    break;
                case "multiplicar":
                    resultado = objCalcular.Multiplicar(num1, num2);
                    break;
                case "dividir":
                    if (num2 != 0) {
                        resultado = objCalcular.Dividir(num1, num2);
                    } else {
                        System.out.println("Error. No se puede dividir entre cero.");
                        continue;
                    }
                    break;
                default:
                    System.out.println("Operacion no valida.");
                    continue;
            }

            System.out.println("El resultado de la operacion es: " + resultado);

            System.out.println("Quieres hacer otra operacion? (si/no): ");
            String respuesta = dato.next().toLowerCase();
            if (respuesta.equals("no")) {
                System.out.println("Saliendo del programa.");
                break;
            }
        }
        dato.close();
    }
}