package frc.robot.subsystems;

public class PivotSubsystem {
    private static PivotSubsystem instance = null;
    public static PivotSubsystem getInstance() {
        if(instance == null){
            instance = new PivotSubsystem();
        }
        return instance;
    }
}
