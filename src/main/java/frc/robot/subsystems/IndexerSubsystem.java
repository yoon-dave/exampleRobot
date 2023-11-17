package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IndexerSubsystem extends SubsystemBase {
    private static IndexerSubsystem instance = null;
    public static IndexerSubsystem getInstance() {
        if(instance == null){
            instance = new IndexerSubsystem();
        }
        return instance;
    }
}
