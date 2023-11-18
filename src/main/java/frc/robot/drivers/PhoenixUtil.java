/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/
package frc.robot.drivers;

import com.ctre.phoenix.ErrorCode;

import frc.robot.util.TelemetryUtil;
import frc.robot.util.TelemetryUtil.PrintStyle;

public class PhoenixUtil {
    public static void checkError(ErrorCode errorCode, String message, boolean log) {
        if (errorCode != ErrorCode.OK) {
            TelemetryUtil.print(message + " " + errorCode, PrintStyle.ERROR, log);
        }
    }
}