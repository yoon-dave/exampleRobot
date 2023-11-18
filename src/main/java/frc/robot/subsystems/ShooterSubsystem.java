package frc.robot.subsystems;

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
        mFollowerShooter = TalonFXFactory.createSlaveFalcon("Folllower Shooter", 1, 0);
    }
    
}
