package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class DrivetrainSubsystem extends SubsystemBase {
    private static DrivetrainSubsystem instance = null;
    public static DrivetrainSubsystem getInstance() {
        if(instance == null){
            instance = new DrivetrainSubsystem();
        }
        return instance;
    }
}
