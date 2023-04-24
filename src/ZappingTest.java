import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZappingTest {

    @Test
    void OrigenCeroDestinoCeroSalidaCero(){
        //ARRANGE
        Zapping salida = new Zapping();
        //ACT
        int resultado = salida.canales(0,0);
        //ASSERT
        assertEquals(0,resultado);
    }
}