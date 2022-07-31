public class Conta {
    private double valorAplicado;

    public double getValorAplicado() {
        return valorAplicado;
    }

    public void setValorAplicado(double valorAplicado) {
        this.valorAplicado = valorAplicado;
    }

    public double calcularRendimento(double tempo){
        return Banco.calcularRendimento(this.valorAplicado, tempo);
    }
}
