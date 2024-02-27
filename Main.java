import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // El camino al archivo puede necesitar ser ajustado según tu estructura de directorios
        String filePath = "datos.txt";
        File file = new File(filePath);
        
        try (Scanner scanner = new Scanner(file)) {
            if (scanner.hasNextLine()) {
                String infixExpression = scanner.nextLine();
                System.out.println("Infix: " + infixExpression);
                
                String postfixExpression = InfixToPostfix.convert(infixExpression);
                System.out.println("Postfix: " + postfixExpression);
                
                int result = PostfixEvaluator.evaluate(postfixExpression);
                System.out.println("Result: " + result);
            } else {
                System.out.println("El archivo está vacío o no se pudo leer la expresión.");
            }
        } catch (FileNotFoundException e) {
            System.err.println("Archivo no encontrado: " + filePath);
        } catch (Exception e) {
            System.err.println("Ocurrió un error al leer o procesar el archivo: " + e.getMessage());
        }
    }
}
