import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZappingTest {

    @Test
    void Origen0Destino0Salida0(){
        //ARRANGE
        Zapping salida = new Zapping();
        //ACT
        int resultado = salida.canales(0,0);
        //ASSERT
        assertEquals(0,resultado);
    }
    @Test
    void Origen1Destino2Salida1(){
        //ARRANGE
        Zapping salida = new Zapping();
        //ACT
        int resultado = salida.canales(1,2);
        //ASSERT
        assertEquals(1,resultado);
    }
    @Test
    void Origen10Destino20Salida10 (){
        //ARRANGE
        Zapping salida = new Zapping();
        //ACT
        int resultado = salida.canales(10,20);
        //ASSERT
        assertEquals(10,resultado);
    }
    @Test
    void Origen2Destino99Salida2 (){
        //ARRANGE
        Zapping salida = new Zapping();
        //ACT
        int resultado = salida.canales(2,99);
        //ASSERT
        assertEquals(2,resultado);
    }
    @Test
    void Origen5Destino63Salida41 (){
        //ARRANGE
        Zapping salida = new Zapping();
        //ACT
        int resultado = salida.canales(5,63);
        //ASSERT
        assertEquals(41,resultado);
    }

}