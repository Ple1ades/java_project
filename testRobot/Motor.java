package testRobot;

public class Motor {
    public int speed = 0;
    public Motor(int initialSpeed){
        this.speed = initialSpeed;
        // yadda yadda yadda
    }
    public void setSpeed(int speed){
        if (speed <= 100 && speed >= -100){
            this.speed =speed;
        }
    }
    public int getSpeed(){
        return this.speed;
    }
    public void stop(){
        this.speed = 0;
    }
}
class servoMotor extends Motor{
    private double maxTurnAngle;
    servoMotor(int initialSpeed, double maxTurnAngle){
        super(initialSpeed);
        this.maxTurnAngle = maxTurnAngle;
    }
    @Override
    public void setSpeed(int speed){
        this.speed = speed/2;
    }
}