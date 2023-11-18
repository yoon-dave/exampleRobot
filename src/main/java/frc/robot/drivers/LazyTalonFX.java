// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.drivers;
import com.ctre.phoenix.motorcontrol.can.TalonFX;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.TalonFXControlMode;

public class LazyTalonFX extends TalonFX {

    private TalonFXControlMode mControlMode = null;
    private String mName;
    private LazyTalonFX mMaster = null;

    public LazyTalonFX(String name, int deviceID) {
        super(deviceID);
        mName = name;
    }

    public String getName() {
        return mName;
    }

    public void setMaster(LazyTalonFX master){
        mMaster = master;
    }
    public LazyTalonFX getMaster(){
        return mMaster;
    }
    public void setControlMode(TalonFXControlMode mode){
        mControlMode = mode;
    }
    
}
