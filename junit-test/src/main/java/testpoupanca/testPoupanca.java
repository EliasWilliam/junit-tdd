package testpoupanca;
import org.junit.Test;
import sisinvest.Poupanca;

import static org.junit.Assert.*;

public class testPoupanca {

    public testPoupanca() {

    }
     @Test
    public void testInvest() {
        Double valor = 1000.00;
        int tempo = 1;
        Double retorno = 1005.00;
        Poupanca poupanca = new Poupanca(valor, tempo);
        assertEquals(retorno, poupanca.simulador());
     }
}
