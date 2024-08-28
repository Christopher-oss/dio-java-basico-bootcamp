import java.util.Scanner;

/**
 * <h1>Requisição de Dados<h1>
 * <p>Este formulario captura dados do usuario utilizando a classe Scanner.<p>
 * <B>Note:<b/> Leia atentamente a documentação desta classe
 * para desfrutar dos recursos oferecidos pelo autor.
 *
 @author Christopher Martins
 @version 1.0
 @since 27/08/2024
*/

public class AboutMeScanner {

        /** 
     * Este metodo é utilizado para capturar os dados do usuario
     * @param nome este é o primeiro parametro de metodo
     * @param sobreNome este é o segundo parametro de metodo
     * @param idade este é o terceiro parametro de metodo
     * @param altura este é o quarto parametro de metodo
     * @return o sistema irá printar os dados junto a mensagem definida na classe.
    */

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
