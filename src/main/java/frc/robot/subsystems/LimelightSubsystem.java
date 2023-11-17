package frc.robot.subsystems;

public class LimelightSubsystem {
    private static LimelightSubsystem instance = null;
    public static LimelightSubsystem getInstance() {
        if(instance == null){
            instance = new LimelightSubsystem();
        }
        return instance;
    }
}
