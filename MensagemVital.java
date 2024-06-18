import java.util.Random;
import java.util.Scanner;

public class MensagemVital {
     public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Random aleatorio = new Random();

        String jogarNovamente = "SIM";
        while(jogarNovamente.equalsIgnoreCase("SIM")) {

            System.out.println("Escolha um número de 4-10");
            int respUsuario = 0;

            while (respUsuario < 4 || respUsuario > 10) {
                respUsuario = leitor.nextInt();
                if (respUsuario < 4 || respUsuario > 10) {
                    System.out.println("Preencha com um valor de 4 - 10");
                }
            }
            int contador = 0;
            StringBuilder mensagem = new StringBuilder();

            while (respUsuario != contador) {
                char gerador = (char) (65 + aleatorio.nextInt(25));
                mensagem.append(gerador);
                System.out.printf("%s", gerador);
                contador++;
            }
            if (contador >= 4 && contador <= 10) {
                try {
                    Thread.sleep(contador * 1000);

                } catch (InterruptedException e) {
                }
            }
            for (int i = 0; i < 1000; i++) {
                System.out.println("");
            }
            System.out.println("Qual a mensagem que apareceu?");
            String respDesafio = leitor.next();

            if (respDesafio.equalsIgnoreCase(mensagem.toString())) {
                System.out.println("Você acertou a mensagem");
            } else {
                System.out.println("Você errou!");
                System.out.println("A mensagem era: " + mensagem);
            }
            System.out.println("Deseja jogar novamente? ");
            jogarNovamente = leitor.next();
            }
          }
        }


