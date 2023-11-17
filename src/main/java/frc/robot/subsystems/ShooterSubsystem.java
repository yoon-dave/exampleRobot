package frc.robot.subsystems;

public class ShooterSubsystem {
    private static ShooterSubsystem instance = null;
    public static ShooterSubsystem getInstance() {
        if(instance == null){
            instance = new ShooterSubsystem();
        }
        return instance;
    }
}
