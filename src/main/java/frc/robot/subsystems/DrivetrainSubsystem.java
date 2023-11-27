package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.math.kinematics.ChassisSpeeds;
import frc.robot.subsystems.SwerveModule;
import edu.wpi.first.wpilibj.smartdashboard.Field2d;
import edu.wpi.first.math.controller.SimpleMotorFeedforward;
import edu.wpi.first.math.kinematics.SwerveDriveOdometry;
import com.swervedrivespecialties.swervelib.Mk4ModuleConfiguration;
import com.swervedrivespecialties.swervelib.Mk4SwerveModuleHelper;

public class DrivetrainSubsystem extends SubsystemBase {
    private static DrivetrainSubsystem instance = null;

    public static DrivetrainSubsystem getInstance() {

        if (instance == null) {
            instance = new DrivetrainSubsystem();
        }
        return instance;
    }

    private final SwerveDriveOdometry m_swerveDriveOdometry;
    private final SimpleMotorFeedforward m_feedForward;

    private static SwerveModule m_frontLeftModule;
    private static SwerveModule m_frontRightModule;
    private static SwerveModule m_backLeftModule;
    private static SwerveModule m_backRightModule;

    private ChassisSpeeds m_chassisSpeeds = new ChassisSpeeds(0.0, 0.0, 0.0);
    private Field2d m_field = new Field2d();
    private Field2d m_hub = new Field2d();

    public interface SwerveModule {
        double getDriveVelocity();
    
        double getSteerAngle();
    
        void set(double driveVoltage, double steerAngle);
    }

    //add default command (teleop)
    //basically all parameters need to be added (fix all null and 0 values)
    //need to add parameters for swervemodules
    public DrivetrainSubsystem() {
        setDefaultCommand(null);

        Mk4ModuleConfiguration driveConfig = new Mk4ModuleConfiguration(null);
        m_swerveDriveOdometry = new SwerveDriveOdometry(null, null);
        m_feedforward = new SimpleMotorFeedforward(0, 0, 0);

        m_frontLeftModule = Mk4SwerveModuleHelper.createFalcon500(driveConfig, 0, 0, 0, 0); //parameters should be drive and steer motor ports, encoder port, steer offset
        m_frontRightModule = Mk4SwerveModuleHelper.createFalcon500(driveConfig, 0, 0, 0, 0);
        m_backLeftModule = Mk4SwerveModuleHelper.createFalcon500(driveConfig, 0, 0, 0, 0);
        m_backRightModule = Mk4SwerveModuleHelper.createFalcon500(driveConfig, 0, 0, 0, 0);
    }
    
}
