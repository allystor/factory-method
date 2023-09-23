package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class MotocicletaTest {

        @Test
        public void deveRetornarLigandoMotocicleta() {
            Motocicleta motocicleta = new Motocicleta();
            assertEquals("Ligando a motocicleta", motocicleta.ligar());
        }

        @Test
        public void deveRetornarDesligandoMotocicleta() {
            Motocicleta motocicleta = new Motocicleta();
            assertEquals("Desligando a motocicleta", motocicleta.desligar());
        }
}
