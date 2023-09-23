package factorymethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MotorFactoryTest {
    @Test
    public void deveRetornarMotorCarro() {
        try {
            MotorFactory motorFactory = new MotorFactory();
            Motor motor = motorFactory.getMotor("Carro");
            assertEquals("Carro", motor.ligar());
        } catch (Exception e) {
            fail("Não deveria ter lançado exceção");
        }
    }
    @Test
    public void deveDesligarMotorCarro() {
        try {
            MotorFactory motorFactory = new MotorFactory();
            Motor motor = motorFactory.getMotor("Carro");
            assertEquals("Carro", motor.desligar());
        } catch (Exception e) {
            fail("Não deveria ter lançado exceção");
        }
    }
}
