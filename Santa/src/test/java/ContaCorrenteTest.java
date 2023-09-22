import com.banco.santa.ContaCorrente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContaCorrenteTest {

    @Test
    public void testDeposito() {

        ContaCorrente conta = new ContaCorrente("666");
        conta.depositar(100.0);
        assertEquals(100.0, conta.getSaldo());

    }

    @Test
    public void testPagamentoComSaldoSuficiente() {

        ContaCorrente conta = new ContaCorrente("666");
        conta.depositar(100.0);
        conta.pagar(50.0);
        assertEquals(50.0, conta.getSaldo());

    }

    @Test
    public void testPagamentoComSaldoInsuficiente() {

        ContaCorrente conta = new ContaCorrente("666");
        assertThrows(IllegalArgumentException.class, () -> conta.pagar(50.0));

    }

}
