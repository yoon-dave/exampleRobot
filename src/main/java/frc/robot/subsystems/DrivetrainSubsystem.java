package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.math.kinematics.ChassisSpeeds;
import frc.robot.subsystems.SwerveModule;
import edu.wpi.first.wpilibj.smartdashboard.Field2d;

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

    private ChassisSpeeds m_chassisSpeeds = new ChassisSpeeds(0.0, 0.0, 0.0);
    private Field2d m_field = new Field2d();
    private Field2d m_hub = new Field2d();

}
