import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        ArrayList<Ganho> ganho = new ArrayList<>();
        ArrayList<Gasto> gasto = new ArrayList<>();

        int opcao = 0;

        while (opcao != 6){
            System.out.println("Sistema de gestão financeira");
            System.out.println("Selecione a opção desejada: ");
            System.out.println("1 - Adicionar ganho");
            System.out.println("2 - Adicionar gasto");
            System.out.println("3 - Relatório de ganho");
            System.out.println("4 - Relatório de gasto");
            System.out.println("5 - Relatório mensal");
            System.out.println("6 - Sair");


            System.out.println("Digite a opção desejada: ");
            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();

            if (opcao == 1){

                //criar os objetos das classes gasto e ganho
                //utilizar a classe relatório para criação dos relatórios
                //lista e atributos ??
            }


        }
    }
}