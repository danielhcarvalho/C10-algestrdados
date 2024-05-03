import javax.swing.JOptionPane;

public class C10EX07 {
    public static void main(String[] args) {
        int dias = 0, anos = 0, meses = 0;
        double populacao, contaminada = 1;

        populacao = Long.parseLong(JOptionPane.showInputDialog(null,
                "Qual a população total da cidade?",
                "Exercício 07",
                JOptionPane.QUESTION_MESSAGE));

        do {

            contaminada += contaminada * (0.3 / 100);
            dias++;

        } while (contaminada <= populacao);
        
        anos = dias / 365;
        meses = (dias % 365) / 30;
        dias = dias % 365 % 30;

        System.out.printf("Anos = %d Meses = %d Dias = %d", anos, meses, dias);
    }
}
