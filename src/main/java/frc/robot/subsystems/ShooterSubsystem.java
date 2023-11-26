package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.ControlMode;
import frc.robot.drivers.TalonFXFactory;
import frc.robot.drivers.LazyTalonFX;

public class ShooterSubsystem {
    private static ShooterSubsystem instance = null;
    public static ShooterSubsystem getInstance() {
        if(instance == null){
            instance = new ShooterSubsystem();
        }
        return instance;
    }

    private final LazyTalonFX mLeaderShooter
    private final LazyTalonFX mFollowerShooter;

    public ShooterSubsystem() {
        mLeaderShooter = TalonFXFactory.createDefaultFalcon("Leader Shooter", 0);
        configureMotor(mLeaderShooter, false);
        mFollowerShooter = TalonFXFactory.createSlaveFalcon("Folllower Shooter", 1, 0);
        configureMotor(mFollowerShooter, false);
    }
    
    //need to finish this
    private void configureMotor(LazyTalonFX motor, boolean inverted) {
        motor.setInverted(inverted);
        motor.enableVoltageCompensation(true);
        motor.config_kF(0, 0, 0);
        motor.config_kP(0, 0, 0);
        motor.config_kI(0, 0, 0);
        motor.config_kD(0, 0, 0); 
    }

    public void stopShooter() {
        mLeaderShooter.set(ControlMode.PercentOutput, 0);
    }

    public void setShooterVelocity(int velocity) {
        mLeaderShooter.set(ControlMode.Velocity, velocity);
    }

    public int getShooterVelocity() {
    }  
    
}
