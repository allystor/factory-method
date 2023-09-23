package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarroTest {

    @Test
    public void deveRetornarLigandoCarro() {
        Carro carro = new Carro();
        assertEquals("Ligando o carro", carro.ligar());
    }

    @Test
    public void deveRetornarDesligandoCarro() {
        Carro carro = new Carro();
        assertEquals("Desligando o carro", carro.desligar());
    }
}
