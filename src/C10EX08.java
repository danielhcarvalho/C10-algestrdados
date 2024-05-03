import java.util.Scanner;

public class C10EX08 
{
    public static void main(String[] args) 
    {
        String nomeCidade, nomeMenorCidade = "";
        int qntCidades = 0;
        long populacao, populacaoEstado = 0, eleitores,  mulheres, homens, mediaHomens = 0, maisMulheres = 0, populacaoMenorCidade = Long.MAX_VALUE;
        double percentualEleitoresEstado = 0;

        Scanner cidades = new Scanner(C10EX08.class.getResourceAsStream("C10EX08.txt")); //fazer download do arquivo C10EX08.txt no mesmo diretório do github

        do
        {
            qntCidades++;

            nomeCidade = cidades.nextLine();
            populacao = cidades.nextLong();
            eleitores = cidades.nextLong();
            homens = cidades.nextLong();
            mulheres = cidades.nextLong();
            cidades.nextLine();

            populacaoEstado += populacao;
            percentualEleitoresEstado += (double) eleitores;
            mediaHomens += homens;

            System.out.printf("Nome da cidade: %s\nPopulação total da cidade: %d\nQuantidade total de eleitores: %d\nQuantidade total de mulheres: %d\nQuantidade total de homens: %d\n", nomeCidade, populacao, eleitores, mulheres, homens);

            if (mulheres + homens != populacao) 
            {
             System.out.println("A soma entre os homens e mulheres da cidade é maior que a população");
             System.err.println();
            }

            System.out.println();

            if (mulheres > homens) 
            {
                maisMulheres++;    
            }
            if (populacao < populacaoMenorCidade) 
            {
                populacaoMenorCidade = populacao;
                nomeMenorCidade = nomeCidade;
            }

        } while(!nomeCidade.equalsIgnoreCase("zimbabue de minas"));

        percentualEleitoresEstado /= (double) populacaoEstado;
        percentualEleitoresEstado *= 100;
        mediaHomens /= 5;


        System.out.printf("Quantidade total de cidades do estados: %d\nPopulação total do estado: %d\nPercentual de eleitores (em relação a população total do estado): %.2f%%\nQuantidade de cidades que possuem mais mulheres do que homens: %d\nMédia da quantidade total de homens do estado: %d\n", qntCidades, populacaoEstado, percentualEleitoresEstado, maisMulheres, mediaHomens);
        System.out.println();
        System.out.printf("Nome da cidade com menor população: %s\nPopulação total da cidade com menor população: %d", nomeMenorCidade, populacaoMenorCidade);
    }

    cidades.close();
}
