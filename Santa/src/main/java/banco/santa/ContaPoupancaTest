import com.banco.santa.ContaPoupanca;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContaPoupancaTest {

    @Test
    public void testDeposito() {

        ContaPoupanca conta = new ContaPoupanca("123");
        conta.depositar(100.0);
        assertEquals(150.0, conta.getSaldo());

    }

    @Test
    public void testPagamentoComSaldoSuficiente() {

        ContaPoupanca conta = new ContaPoupanca("666");
        conta.depositar(100.0);
        conta.pagar(50.0);
        assertEquals(0.0, conta.getSaldo());

    }

    @Test
    public void testPagamentoComSaldoInsuficiente() {

        ContaPoupanca conta = new ContaPoupanca("666");
        assertThrows(IllegalArgumentException.class, () -> conta.pagar(50.0));

    }

}
