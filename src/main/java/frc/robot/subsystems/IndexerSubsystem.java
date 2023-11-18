package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.Ports;
import frc.robot.drivers.LazyTalonFX;
import frc.robot.drivers.TalonFXFactory;

public class IndexerSubsystem extends SubsystemBase {
    //initializing the motors required
    // private final LazyTalonFX indexerMotor;
    // private final LazyTalonFX intakeMotor;


    private static IndexerSubsystem instance = null;
    public static IndexerSubsystem getInstance() {
        if(instance == null){
            instance = new IndexerSubsystem();
        }
        return instance;
    }

    // public IndexerSubsystem() {
    //     indexerMotor = TalonFXFactory.createDefaultFalcon("Indexer Motor", Ports.INDEXER_MOTOR);
    // }
}
