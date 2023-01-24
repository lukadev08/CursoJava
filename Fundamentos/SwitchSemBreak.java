public class SwitchSemBreak {
    public static void main(String[] args) {
        
        String faixa = "marrom";
            //exemplo faixas carate
        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("sei o bassai-dai");
            case "marrom":
                System.out.println("sei o tekki shodan");
            case "roxa":
                System.out.println("sei o heian godan");
            case "verde":
                System.out.println("sei o heian yodan");
            case "laranja":
                System.out.println("sei o heian sandan");
            case "vermelha":
                System.out.println("sei o heian nidan");
            case "amarela":
                System.out.println("sei o heian shodan");
                // executa todas sentencas seguidas em ordem ate encontrar o fim
                // ou ponto de interrupcao

        int idade = 2;
        switch (idade) {
            case 3:
            System.out.println("Sabe tomar banho");
            case 2:
            System.out.println("Sabe falar");
            case 1:
            System.out.println("Sabe andar");
            case 0:
            System.out.println("Sabe comer");
            // ex: se sabe 1 sabe o 0, sabe o 2 sabe o 1 etc
        }
        }
    }
}
