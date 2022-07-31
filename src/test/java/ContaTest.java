import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaTest {
    @Test
    void deveCalcularExpressaoComFormula() {
        Conta conta = new Conta();
        conta.setValorAplicado(100);

        assertEquals(120.0, conta.calcularRendimento(12));
    }
}