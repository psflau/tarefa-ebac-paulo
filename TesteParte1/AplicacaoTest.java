package cap23;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

public class AplicacaoTest {
	 @Test
	    void testFiltrarMulheres() {
	        List<String> input = List.of("MARCIO-MASCULINO", "LUARA-FEMININO", "LETICIA-FEMININO");
	        List<String> resultadoEsperado = List.of("LUARA-FEMININO", "LETICIA-FEMININO");

	        List<String> resultado = Aplicacao.filtrarMulheres(input);

	        assertEquals(resultadoEsperado, resultado);
	    }
}
