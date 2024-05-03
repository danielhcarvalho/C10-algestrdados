import javax.swing.JOptionPane;

public class C10EX04 
{
    public static void main(String[] args) 
    {
        String produto;
        int quantidade;
        double precoUnitario, custoParcial, custoTotal = 0, BDI, precoFinal = 0, taxaBDI;
    
        System.out.println("Digite 'fim' no nome do produto para interromper o programa");
        
        taxaBDI = Integer.parseInt(JOptionPane.showInputDialog(null, 
                  "Informe a taxa de BDI da empresa: ", 
                  "Exercício 04", 
                  JOptionPane.QUESTION_MESSAGE));
                
        System.out.printf("TAXA DE BDI = %.0f%%\n", taxaBDI);
        do 
        {           
                produto = JOptionPane.showInputDialog(null, 
                          "Informe o nome do produto", 
                          "Exercício 04", 
                          JOptionPane.QUESTION_MESSAGE);



                
            if (!produto.equalsIgnoreCase("fim"))            
            {
                quantidade = Integer.parseInt(JOptionPane.showInputDialog(null, 
                             "Informe a quantidade do produto:",
                             "Exercício 04",
                             JOptionPane.QUESTION_MESSAGE));
                precoUnitario = Double.parseDouble(JOptionPane.showInputDialog(null,
                                "Informe o preço unitário do produto: ",
                                "Exercício 04",
                                JOptionPane.QUESTION_MESSAGE));
       
                
                custoParcial = quantidade * precoUnitario;
                custoTotal += custoParcial;

                System.out.printf("%s -- %d unidade(s) -- R$ %.2f cada --> R$ %.2f\n", produto.toUpperCase(), quantidade, precoUnitario, custoParcial);


            }
         } while (!produto.equalsIgnoreCase("fim"));
                        
        BDI =  custoTotal * (taxaBDI / 100);
        precoFinal = custoTotal + BDI;
               
        System.out.printf("\nCUSTO TOTAL = R$ %.2f\nBDI (%.0f%% de R$ %.2f) = R$ %.2f\nPREÇO FINAL = R$ %.2f", custoTotal, taxaBDI, custoTotal, BDI, precoFinal);

    }
}
