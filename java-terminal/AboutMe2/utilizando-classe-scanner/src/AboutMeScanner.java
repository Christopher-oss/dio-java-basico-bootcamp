import java.util.Scanner;

public class AboutMeScanner {
    public static void main(String[] args) throws Exception {

        //Criando o objeto Scanner.
        Scanner scanner = new Scanner(System.in);

        //Metodos de captura de dados
        System.out.println("Digite seu 1° nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu 2° nome: ");
        String segundoNome = scanner.next();

        System.out.println("Digite sua Idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite sua Altura: ");
        double altura = scanner.nextDouble();

        //Imprimindo dados apresentados pelo usuario 
        
         System.out.println("Olá, me chamo" + " " + nome + " " + segundoNome + "!");
         System.out.println("Tenho" + " " + idade + " " + "Anos.");
         System.out.println("Minha altura é:" + " " + altura + "cm");
  
          
    

    }
}
