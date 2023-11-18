package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class DrivetrainSubsystem extends SubsystemBase {
    private static DrivetrainSubsystem instance = null;

    public static DrivetrainSubsystem getInstance() {

        if (instance == null) {
            instance = new DrivetrainSubsystem();
        }
        return instance;
    }
    private static SwerveModule m_frontLeftModule;
    private static SwerveModule m_frontRightModule;
    private static SwerveModule m_backLeftModule;
    private static SwerveModule m_backRightModule;
}
