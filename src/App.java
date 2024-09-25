
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        // VARIAVEIS
        String nomeEntrevistado;
        int otimo = 0, bom = 0, regular = 0, ruim = 0, pessimo = 0; // Contadores para as respostas
        int idade, numAssentos = 0, contEntrevistado = 1, totalRespostas = 0;
        int somaTotalruim = 0;
        double mediaNotas = 0;
        char op;

        JOptionPane.showMessageDialog(null, "cinema");

        // ESTRUTURA DE REPETIÇÃO WHILE
        while (numAssentos < 40git ) { //O loop while permite coletar dados de até 4 entrevistados.

            nomeEntrevistado = JOptionPane.showInputDialog("Entrevistado " + contEntrevistado + " Qual é seu nome?"); // coletar o nome do entrevistado.
            idade = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Entrevistado " + contEntrevistado + " Qual é sua idade")); // idade entrevistado.
 
            op = JOptionPane.showInputDialog("Qual sua opinião?\n" + // coleta a opnião do entrevistado.
                    "A-otimo\n" +
                    "B- bom\n" +
                    "C- regular\n" +
                    "D- ruim\n" +
                    "E- péssimo").charAt(0);

            JOptionPane.showMessageDialog(null, "Muito obrigado pela participação ! 😄 ");

            switch (op) { // switch para tratar dos dados coletados
                case 'A':
                    otimo++;
                    totalRespostas++;
                    break;

                case 'B':
                    bom++;
                    totalRespostas++;
                    break;

                case 'C':
                    regular++;
                    totalRespostas++;
                    break;

                case 'D':
                    ruim++;
                    somaTotalruim += idade;
                    totalRespostas++;
                    break;

                case 'E':
                    pessimo++;
                    totalRespostas++;
                    break;

                default:

                    JOptionPane.showMessageDialog(null, "Escolha uma opção correta.");

                    break;
            }

            contEntrevistado++; // incrementar
            numAssentos++; // incrementar
        }

        JOptionPane.showMessageDialog(null, "Resultado da Pesquisa:");
        
        //ESTRUTURA DE DECISÃO
        if (otimo > 0) {
            JOptionPane.showMessageDialog(null, "O total de respostas 'Otimas' foram: " + otimo);
        } else {
            JOptionPane.showMessageDialog(null, "Sem respostas 'Otimas'");
        }
        if (ruim > 0) {
            double mediaIdadeRuim = somaTotalruim / ruim;
            JOptionPane.showMessageDialog(null,
                    " A média da idade das pessoas que responderam 'Ruim' foram:\n " + mediaIdadeRuim);
        } else {
            JOptionPane.showMessageDialog(null, "Ninguem escolheu ruim.");

        }

        if (pessimo > 0) {

            JOptionPane.showMessageDialog(null,
                    "a porcentagem de respostas 'péssimo' é: " + ((pessimo * 100) / totalRespostas) + "%");

        } else {

        }

        int totalNotas = (otimo * 5) + (bom * 4) + (regular * 3) + (ruim * 2) + (pessimo * 1);
        mediaNotas = totalNotas / numAssentos;

        JOptionPane.showMessageDialog(null, "A média geral das notas é: " + mediaNotas);
    }
}
