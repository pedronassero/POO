import org.example.Venda;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VendaTest {
    @Test
    public void testVendaIniciadaComCliente() {
        Venda venda = new Venda("Cliente1");
        assertEquals("Cliente1", venda.getCliente());
        assertEquals(Venda.SITUACAO_NAO_INICIADA, venda.getSituacao());
    }

    @Test
    public void testVendaValorTotal() {
        Venda venda = new Venda("Cliente1");
        venda.vender("Produto1", 10.0, 2);
        venda.vender("Produto2", 20.0, 1);
        assertEquals(40.0, venda.getValor());
    }

    @Test
    public void testAplicarDescontoVendaEmAndamento() {
        Venda venda = new Venda("Cliente1");
        venda.vender("Produto1", 10.0, 2);
        assertTrue(venda.aplicarDesconto(10.0));
    }

    @Test
    public void testAplicarDescontoVendaNaoIniciada() {
        Venda venda = new Venda("Cliente1");
        assertFalse(venda.aplicarDesconto(10.0));
    }

    @Test
    public void testFinalizarVenda() {
        Venda venda = new Venda("Cliente1");
        venda.vender("Produto1", 10.0, 2);
        venda.finalizar();
        assertEquals(Venda.SITUACAO_ENCERRADA, venda.getSituacao());
    }

    @Test
    public void testVendaEncerradaNaoPermiteVender() {
        Venda venda = new Venda("Cliente1");
        venda.vender("Produto1", 10.0, 2);
        venda.finalizar();
        Exception exception = assertThrows(RuntimeException.class, () -> {
            venda.vender("Produto2", 20.0, 1);
        });
        assertEquals("venda encerrada", exception.getMessage());
    }
}
