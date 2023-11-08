package calculadora;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IMCTest2 {
    @Test
    public void testImc() {
       double resultadoCaso1 = IMC.imc(70, 170);
        assertEquals(24.22, resultadoCaso1, 0.01);
    }
}
