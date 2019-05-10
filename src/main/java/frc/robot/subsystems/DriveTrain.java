/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.robot.Robot;
import frc.robot.RobotMap;
import frc.robot.commands.DefaultDrive;

/**
 * Add your docs here.
 */
public class DriveTrain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public static WPI_TalonSRX tankWheel_left = new WPI_TalonSRX(RobotMap.reee_1);
  public static WPI_TalonSRX tankWheel_right = new WPI_TalonSRX(RobotMap.reee_2);
  public static WPI_TalonSRX omni_left = new WPI_TalonSRX(RobotMap.omniwheel_left);
  public static WPI_TalonSRX omniwheel_right = new WPI_TalonSRX(RobotMap.omniwheel_right);
  public static SpeedControllerGroup twl = new SpeedControllerGroup(tankWheel_left, omni_left);
  public static SpeedControllerGroup twr = new SpeedControllerGroup(tankWheel_right, omniwheel_right);
  public static DifferentialDrive real_twl = new DifferentialDrive(twl, twr);
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new DefaultDrive());
  }
}
