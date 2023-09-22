import com.banco.santa.ContaSal;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ContaSalTest {

    @Test
    public void testDeposito() {

        ContaSal conta = new ContaSal("123");
        conta.depositar(100.0);
        assertEquals(100.0, conta.getSaldo());

    }

    @Test
    public void testPagamentoComSaldoSuficiente() {

        ContaSal conta = new ContaSal("123");
        conta.depositar(100.0);
        conta.pagar(50.0);
        assertEquals(50.0, conta.getSaldo());

    }

    @Test
    public void testPagamentoComSaldoInsuficiente() {

        ContaSal conta = new ContaSal("123");
        assertThrows(IllegalArgumentException.class, () -> conta.pagar(50.0));

    }
}
