package exercicio1e2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class TesteMocking {

    @Test
    public void testaContaCorrente(){

       ContaEspecial ce = mock(ContaEspecial.class);
       double valor = 10000;
       double esperado = ce.getSaldo();
       when(ce.sacar(valor)).thenReturn(esperado);

    }

}
