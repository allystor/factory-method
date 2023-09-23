package factorymethod;

public class MotorFactory {
    public static Motor getMotor(String motor) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("factorymethod." + motor);
            objeto = classe.newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Motor não encontrado");
        }
        if (!(objeto instanceof Motor)) {
            throw new RuntimeException("Motor não encontrado");
        }
        return (Motor) objeto;
    }
}
