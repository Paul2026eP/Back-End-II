import java.time.Year;
import java.util.Scanner;

public class DiasDeVida {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual a sua idade? ");
        int idade = teclado.nextInt();
        System.out.print("Em que ano você nasceu? ");
        int anoNascimento = teclado.nextInt();
        teclado.nextLine(); // consumir quebra de linha

        System.out.print("Você é de que cidade? ");
        String cidade = teclado.nextLine();
    
        System.out.print("Qual a cidade da sua família? ");
        String ciddfamilia = teclado.nextLine();

        System.out.print("Você tem filhos? (sim/não) ");
        String filhos = teclado.nextLine();

        System.out.print("Você trabalha? (sim/não) ");
        String trabalho = teclado.nextLine();

        System.out.print("Qual sua profissão? ");
        String profissao = teclado.nextLine();
        System.out.print("Qual seu estado civil? ");
        String estadoCivil = teclado.nextLine();

        System.out.print("Quais são seus hobbies? ");
        String hobbies = teclado.nextLine();

        System.out.print("Qual seu esporte favorito? ");
        String esporte = teclado.nextLine();

        System.out.print("Você tem animal de estimação? Qual? ");
        String animal = teclado.nextLine();

        System.out.print("Qual sua comida preferida? ");
        String comida = teclado.nextLine();

        System.out.print("Qual seu maior sonho ou objetivo? ");
        String sonho = teclado.nextLine();

        System.out.print("Qual sua música ou banda favorita? ");
        String musica = teclado.nextLine();

        System.out.print("Qual sua cor favorita? ");
        String cor = teclado.nextLine();


        int anoAtual = Year.now().getValue();
        int anosBissextos = calcularAnosBissextos(anoNascimento, anoAtual - 1);
        int dias = (idade * 365) + anosBissextos;

        System.out.println("Você já viveu aproximadamente " + dias + " dias.");
        System.out.println("Você viveu " + anosBissextos + " ano(s) bissexto(s).");
        System.out.println("Seu local é " + cidade + ".");
        System.out.println("Sua família é de " + ciddfamilia + ".");
        System.out.println("Filhos: " + filhos + ".");
        System.out.println("Trabalho: " + trabalho + ".");
        System.out.println("Minha profissão é " + profissao + ".");
        System.out.println("Estado civil: " + estadoCivil);
        System.out.println("Hobbies: " + hobbies);
        System.out.println("Esporte favorito: " + esporte);
        System.out.println("Animal de estimação: " + animal);
        System.out.println("Comida preferida: " + comida);
        System.out.println("Sonho/objetivo: " + sonho);
        System.out.println("Música/banda favorita: " + musica);
        System.out.println("Cor favorita: " + cor);


        teclado.close();
    }

    // Método auxiliar para o cálculo dos anos bissextos
    private static int calcularAnosBissextos(int anoInicio, int anoFim) {
        int contagem = 0;
        for (int i = anoInicio; i <= anoFim; i++) {
            if (Year.isLeap(i)) {
                contagem++;
            }
        }
        return contagem;
    }
}
