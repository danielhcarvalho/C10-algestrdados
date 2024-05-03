
import javax.swing.JOptionPane;

public class C10EX03 
{
    public static void main(String[] args) 
    {
        double angulo, pi, raio, area;


        angulo = Double.parseDouble(JOptionPane.showInputDialog(null, 
            "Qual a medida do ângulo?",
            "Exercício 03",
            JOptionPane.QUESTION_MESSAGE));
        pi = 3.1416;
        
        System.out.println("Digite -1 no raio para interromper o programa");

        do 
        { 

            raio = Double.parseDouble(JOptionPane.showInputDialog(null, 
                "Qual o comprimento do raio da circunferência?",
                "Exercício 03",
                JOptionPane.QUESTION_MESSAGE)); 

            if (raio != -1) 
            {
                area = (angulo * pi * Math.pow(raio, 2)) / 360;
                System.out.printf("O valor da área do setor circular é %.4f\n", area);
            }
        } while (raio != -1);
    }
}
