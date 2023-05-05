import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

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

            //criando objeto da classe RelatorioFinanceiro
            RelatorioFinanceiro newRelatorioFinanceiro = new RelatorioFinanceiro();


            if (opcao == 1){
                System.out.println("1 - Insira os dados do ganho");
                System.out.println("Tipo de ganho:");
                String tipoGanho = scanner.next();
                System.out.println("Mes:");
                int mesGanho = scanner.nextInt();
                System.out.println("Ano:");
                int anoGanho = scanner.nextInt();
                System.out.println("Valor Ganho:");
                double valorGanho = scanner.nextDouble();

                Ganho ganho = new Ganho();

                ganho.setTipoGanho(tipoGanho);
                ganho.setMes(mesGanho);
                ganho.setAno(anoGanho);
                ganho.setValorGanho(valorGanho);

                newRelatorioFinanceiro.adicionaGanho(ganho);
            }
            if (opcao == 2) {
                System.out.println("2 - Insira os dados do ganho");
                System.out.println("Tipo de gasto:");
                String tipoGasto = scanner.next();
                System.out.println("Mes:");
                int mesGanho = scanner.nextInt();
                System.out.println("Ano:");
                int anoGanho = scanner.nextInt();
                System.out.println("Valor gasto:");
                double valorGasto = scanner.nextDouble();
                System.out.println("Forma de pagamento:");
                String formaPagamento = scanner.next();

                Gasto gasto = new Gasto();

                gasto.setTipoGasto(tipoGasto);
                gasto.setMes(mesGanho);
                gasto.setAno(anoGanho);
                gasto.setValorGasto(valorGasto);
                gasto.setFormaPagamento(formaPagamento);

                newRelatorioFinanceiro.adicionaGasto(gasto);

            }
            if (opcao == 3) {
                System.out.println("Relatorio de gastos:");

                newRelatorioFinanceiro.relatorioGasto();
            }

            if (opcao == 4) {
                System.out.println("Relatório de gastos");

                newRelatorioFinanceiro.relatorioGanho();
            }

            if (opcao == 5) {
                System.out.println("Relatorio Mensal");
                System.out.println("Mes:");
                int mes = scanner.nextInt();
                System.out.println("Ano:");
                int ano = scanner.nextInt();

                newRelatorioFinanceiro.relatorioMensal(mes, ano);
            }

            if (opcao == 6) {
                System.out.println("Programa encerrado");

                break;
            }
        }
    }
}