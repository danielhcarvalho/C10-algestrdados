import javax.swing.JOptionPane;

public class C10EX05 
{
    public static void main(String[] args) 
    {
        String[] opcoesGenero = {"M", "F"};
        double altura, peso, alturaMediaHomens = 0; 
        int genero, quantidadePesquisada = 0, mulheres = 0, mulheresPesoMenor60 = 0, homens = 0;


        System.out.println("ALTURA (em m)..............Peso (em kg)..............Sexo (M ou F)");
        do 
        {
            altura = Double.parseDouble(JOptionPane.showInputDialog(null, 
            "Altura: ",
            "Exercício 05",
            JOptionPane.QUESTION_MESSAGE));  
            
            if (altura != 0) 
            {
                quantidadePesquisada++;

                genero = JOptionPane.showOptionDialog(null, 
                         "Gênero:",
                         "Exercício 05", 
                         0,
                         JOptionPane.QUESTION_MESSAGE, 
                         null, 
                         opcoesGenero,
                         "");

                peso = Double.parseDouble(JOptionPane.showInputDialog(null, 
                       "Peso: ",
                       "Exercício 05",
                       JOptionPane.QUESTION_MESSAGE));

                if (genero == 0) 
                {
                    homens++;
                    alturaMediaHomens += altura;
                }
                else
                {
                    mulheres++;
                }

                if (genero == 1 && peso < 60)
                {
                    mulheresPesoMenor60++;
                }

                System.out.printf("%.2f..............%.2f..............%s\n", altura, peso, opcoesGenero[genero]);

            }
        } while (altura != 0);

        alturaMediaHomens /= homens;

        System.out.println();
        System.out.printf("Quantidade de pessoas pesquisadas: %d\nQuantidade de mulheres: %d\nAltura média dos homens: %.2f m\nQuantidade de mulheres com peso inferior a 60: %d", quantidadePesquisada, mulheres, alturaMediaHomens, mulheresPesoMenor60);
    }    
}
