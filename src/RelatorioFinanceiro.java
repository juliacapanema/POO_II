import java.util.ArrayList;

public class RelatorioFinanceiro {

    //criando uma lista (classe)
    private ArrayList<Ganho> listaGanho;
    private ArrayList<Gasto> listaGasto;

    private ArrayList<Gasto> pegarGasto;


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
    public void relatorioGasto(Gasto gasto) {
        //this.pegarGasto= new ArrayList<>();

        for (Gasto gasto: listaGasto) {
            if ()
        }
    }

    public void relatorioGanho() {

    }

    public void relatorioMensal() {

    }
}
