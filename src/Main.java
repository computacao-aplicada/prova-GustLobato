import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite um CPF para validar:");
            String cpf = scanner.nextLine();

            if (Validador.validarCPF(cpf)) {
                System.out.println("CPF Válido!");
            } else {
                System.out.println("CPF Inválido!");
            }

            scanner.close();
        }
    }


