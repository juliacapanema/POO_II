import java.util.ArrayList;

public class RelatorioFinanceiro {

    //criando uma lista (classe)
    private ArrayList<Ganho> listaGanho;
    private ArrayList<Gasto> listaGasto;



    //construtor que ira iniciar as listas
    public RelatorioFinanceiro() {
        this.listaGanho = new ArrayList<Ganho>();
        this.listaGasto = new ArrayList<Gasto>();
    }

    public void adicionaGanho(Ganho ganho) {

        listaGanho.add(ganho);
    }

    public void adicionaGasto(Gasto gasto) {

        listaGasto.add(gasto);
    }
    public void relatorioGasto() {
        double gastoTotal = 0;
        for (Gasto gastoItem : listaGasto) {
            gastoTotal += gastoItem.getValorGasto();
        }
        System.out.println("O valor total de gastos é: " + gastoTotal);
    }

    public void relatorioGanho() {
        double ganhoTotal = 0;

        for (Ganho ganhoItem : listaGanho) {
            ganhoTotal += ganhoItem.getValorGanho();
        }
        System.out.println("O valor total de ganhos é: " + ganhoTotal);
    }

    public void relatorioMensal(int mes, int ano) {
        double gastoTotal = 0;
        double ganhoTotal = 0;
        for (Gasto gastoItem : listaGasto) {
            if (mes == gastoItem.getMes() && ano == gastoItem.getAno()) {
                gastoTotal += gastoItem.getValorGasto();
            }
        }
        for (Ganho ganhoItem : listaGanho) {
            if (mes == ganhoItem.getMes() && ano == ganhoItem.getAno()) {
                ganhoTotal += ganhoItem.getValorGanho();
            }
        }

        System.out.println("O saldo mensal é de: " + (ganhoTotal - gastoTotal));

    }
}
