public class Gasto {

    private String tipoGasto;

    private int mes;

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    private int ano;

    private double valorGasto;

    private String formaPagamento;

    public String getTipoGasto() {
        return tipoGasto;
    }

    public void setTipoGasto(String tipoGasto) {
        this.tipoGasto = tipoGasto;
    }

    public double getValorGasto() {
        return valorGasto;
    }

    public void setValorGasto(double valorGasto) {
        this.valorGasto = valorGasto;
    }

    public String getFormaPagamento() { return formaPagamento; }

    public void setFormaPagamento(String formaPagamento) { this.formaPagamento = formaPagamento; }
}
