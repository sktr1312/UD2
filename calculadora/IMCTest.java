package calculadora;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
   
public class IMCTest {
    @Test
    public static void testImc() {
        // Caso 1: Peso 70 kg, Altura 170 cm
        double resultadoCaso1 = IMC.imc(70, 170);
        assertEquals(24.22, resultadoCaso1, 0.01);
        // Caso 2: Peso 90 kg, Altura 185 cm
        double resultadoCaso2 = IMC.imc(90, 185);
        assertEquals(26.30, resultadoCaso2, 0.01);
        // Caso 3: Peso 60 kg, Altura 160 cm
        double resultadoCaso3 = IMC.imc(60, 160);
        assertEquals(23.44, resultadoCaso3, 0.01);
        double resultadoCaso4 = IMC.imc(45, 160);
        assertEquals(17.578, resultadoCaso4, 0.01);
        double resultadoCaso5 = IMC.imc(65, 165);
        assertEquals(23.875, resultadoCaso5, 0.01);
        double resultadoCaso6 = IMC.imc(100, 175);
        assertEquals(32.653, resultadoCaso6, 0.01);
        double resultadoCaso7 = IMC.imc(99.98, 200);
        assertEquals(24.995, resultadoCaso7, 0.01);
        }
        
    }
