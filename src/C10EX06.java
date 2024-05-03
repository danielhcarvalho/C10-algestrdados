import javax.swing.JOptionPane;

public class C10EX06 
{
    public static void main(String[] args) 
    {
        double a, b, c, x,  y, r, distancia;

        a = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Informe o valor A:",
            "Exercício 06",
            JOptionPane.QUESTION_MESSAGE));
    
        b = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Informe o valor B:",
            "Exercício 06",
            JOptionPane.QUESTION_MESSAGE));
        
        c = Double.parseDouble(JOptionPane.showInputDialog(null,
            "Informe o valor C:",
            "Exercício 06",
            JOptionPane.QUESTION_MESSAGE));

        System.out.printf("A = %.2f\nB = %.2f\nC = %.2f\n", a, b, c);

        do 
        {
            x = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Informe o valor X:",
                "Exercício 06",
                JOptionPane.QUESTION_MESSAGE));
            
            y = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Informe o valor Y :",
                "Exercício 06",
                JOptionPane.QUESTION_MESSAGE));

            r = a * x + b * y + c;
            distancia = r / Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
                    
            System.out.println();
            System.out.printf("X = %.2f\nY = %.2f\nD = %.2f\n", x, y, distancia);

            
        } while (r != 0);



    }
}
