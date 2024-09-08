import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


/*Consumer representa uma interface funcional do java que aceita um unico argumento de entrada e nehuma de saida, frequentimente é usado em contextos onde voce precisa realizar uma operação de em um objeto passado como argumento, tipo um loop, streams e outras coisas. O consumer pode aceitar todo tipo.*/
public class App {
    public static void main(String[] args) throws Exception {
        /*Criando um array e preechendo com numeros de 1 a 10 */
       List<Integer> numeros= Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

       /*criando um consumer para imprimir apenas os numeros pares */
       /*arguementos*/                       /*variavel q vai percorrer*/
       Consumer<Integer> imprimirNumerosPar = numero -> {
        /*Condição a ser executada */
        if(numero % 2 ==0){
            System.out.println(numero);
        }
       };
       /*chamando a lista // chamando os metodos stream // chamando o forEach que vai percorrer o consumer */
       numeros.stream().forEach(imprimirNumerosPar);
    }
}
