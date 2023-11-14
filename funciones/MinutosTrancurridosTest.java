package funciones;

import org.junit.jupiter.api.Test;

public class MinutosTrancurridosTest {
    public static void main(String[] args) {
        testMinutosTranscurridos();
    }

    @Test
    static
    void testMinutosTranscurridos() {
        System.out.println(MinutosTrancurridos.minutosTranscurridos(13,20,10,10)); //== 190;
        System.out.println(MinutosTrancurridos.minutosTranscurridos(13,10,10,20)); //== 170;
        System.out.println(MinutosTrancurridos.minutosTranscurridos(10,10,13,20));//== 190;
        System.out.println(MinutosTrancurridos.minutosTranscurridos(10,20,13,10));//== 170;
        System.out.println(MinutosTrancurridos.minutosTranscurridos(11,20,10,10));//== 70;
        System.out.println(MinutosTrancurridos.minutosTranscurridos(11,10,10,20));//== 50;
        System.out.println(MinutosTrancurridos.minutosTranscurridos(10,10,11,20));//== 70;
        System.out.println(MinutosTrancurridos.minutosTranscurridos(10,20,11,10));//== 50;
        System.out.println(MinutosTrancurridos.minutosTranscurridos(10,10,10,10));//== 0;
        System.out.println(MinutosTrancurridos.minutosTranscurridos(10,20,10,10));//== 10;
        System.out.println(MinutosTrancurridos.minutosTranscurridos(10,10,10,20));//== 10;
        System.out.println(MinutosTrancurridos.minutosTranscurridos(24,10,10,20));//== -1;
        System.out.println(MinutosTrancurridos.minutosTranscurridos(10,60,10,20));//== -1;
        System.out.println(MinutosTrancurridos.minutosTranscurridos(10,10,60,20));//== -1;
        System.out.println( MinutosTrancurridos.minutosTranscurridos(10,10,10,60));//== -1;
    }
}
