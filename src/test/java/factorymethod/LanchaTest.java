package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class LanchaTest {

    @Test
    public void deveRetornarLigandoLancha() {
        Lancha lancha = new Lancha();
        assertEquals("Ligando a lancha", lancha.ligar());
    }

    @Test
    public void deveRetornarDesligandoLancha() {
        Lancha lancha = new Lancha();
        assertEquals("Desligando a lancha", lancha.desligar());
    }
}
