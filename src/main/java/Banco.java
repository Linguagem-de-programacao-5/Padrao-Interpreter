public class Banco {
    public static String formula = "valorAplicado * 0.10 * tempo";

    public static double calcularRendimento(double valorAplicado, double tempo) {
        String expressao;
        expressao = formula.replace("valorAplicado", Double.toString(valorAplicado));
        expressao = expressao.replace("tempo", Double.toString(tempo));
        InterpretadorExpressao interpretador = new InterpretadorExpressoesAritmeticas(expressao);
        return interpretador.interpretar();
    }
}
