import java.text.NumberFormat;
import javax.swing.JOptionPane;

public class C10EX02 
{
    public static void main(String[] args) 
    {
        int maior1000 = 0, contador = 0;
        double valor, total = 0, media;
    
        System.out.println("Digite 0 no valor para interromper o programa");

        do 
        {
            valor = Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Qual o valor recebido?",
                "Exercício 02",
                JOptionPane.QUESTION_MESSAGE));

            if (valor != 0)
            {
                contador++;
                total += valor;
            }
            if (valor > 1000) 
            {
                maior1000++;
            }
        } while (valor != 0);

        media = total / contador;

        System.out.printf("O valor total recebido foi de %s\nA média dos valores é de %s\nForam recebidos %d valores acima de R$1000,00", NumberFormat.getCurrencyInstance().format(total), NumberFormat.getCurrencyInstance().format(media), maior1000);
    }    
}
