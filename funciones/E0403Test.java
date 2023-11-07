package funciones;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class E0403Test {

    @Test
    public void testAreaCilindro() {

        for (int i = 0; i < 100; i++) {
            double radio = 13.0 + i ;
            double altura = 5.0 + i;
            double expectedArea = 2 * Math.PI * (radio) * ((altura) + radio);
            double actualArea = E0403.areaCilindro(radio, altura);
            assertEquals(expectedArea, actualArea,  0.0001); // Tolerancia delta: 0.0001
        }
    }
}
