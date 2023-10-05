package testRobot;
import java.util.function.DoubleSupplier;

public class Robot {
    
    Motor RMotor = new Motor(0);
    Motor LMotor = new Motor(0);
    Motor[] ArrayOfMotors = {RMotor,LMotor};
    
    public void move(int lSpeed, int rSpeed){
        RMotor.setSpeed(rSpeed);
        LMotor.setSpeed(-lSpeed);
    }
    public void stop(){
        RMotor.stop();
        LMotor.stop();
    }


    public static void call10Times(DoubleSupplier function) {
        for (int i = 0; i<10; i++) {
            System.out.println(function.getAsDouble());
        }
    }

    public static void main(String[] args) {
        Robot myRobot = new Robot();
        DoubleSupplier giveRandom = () -> {
            System.out.println("jadon is wrong");
            return Math.random();
        };  
        
        System.out.println(myRobot.RMotor.getSpeed());

        call10Times(giveRandom);

        System.out.println(myRobot.RMotor.getSpeed());
    }
}
