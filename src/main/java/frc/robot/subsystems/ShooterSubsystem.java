package frc.robot.subsystems;

import frc.lib.drivers.TalonFXFactory;
import frc.lib.drivers.LazyTalonFX;

public class ShooterSubsystem {
    private static ShooterSubsystem instance = null;
    public static ShooterSubsystem getInstance() {
        if(instance == null){
            instance = new ShooterSubsystem();
        }
        return instance;
    }

    

}
