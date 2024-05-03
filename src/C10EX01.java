import java.text.NumberFormat;
import javax.swing.JOptionPane;


public class C10EX01 
{
    public static void main(String[] args) 
    {
        int contador = 0;
        double valor, multa, media = 0;

        System.out.println("Digite -1 no valor para interromper o programa");

        do 
        {       
        valor = Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Qual o valor da multa?",
                "Exercício 01",
                JOptionPane.QUESTION_MESSAGE));
        
        if (valor != -1) 
        { 
            contador++;

            multa = valor * 10/100;
            media += multa;

            System.out.printf("O valor da multa que deve ser pago é de %s\n", NumberFormat.getCurrencyInstance().format(multa));

                
         }
        } while (valor != -1);

        media /= contador;
        System.out.printf("A média das multas calculadas é de %s",  NumberFormat.getCurrencyInstance().format(media));
    }
}
