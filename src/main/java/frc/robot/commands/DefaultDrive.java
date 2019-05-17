/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;


import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;

public class DefaultDrive extends Command {
  int left_servo_value = 72, right_servo_value = 114;
  public DefaultDrive() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.drivetrain);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {

  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {

    if (Math.abs(OI.driver.getY(Hand.kLeft)) < .1){
      Robot.drivetrain.Talon_RL.set(0);
      Robot.drivetrain.Talon_FL.set(0);
    } else {
    Robot.drivetrain.Talon_FL.set(OI.driver.getY(Hand.kLeft));
    Robot.drivetrain.Talon_RL.set(OI.driver.getY(Hand.kLeft));
    }
     if (Math.abs(OI.driver.getY(Hand.kRight)) < .1){ 
    Robot.drivetrain.Talon_FR.set(0);
    Robot.drivetrain.Talon_RR.set(0);
    } else{
    Robot.drivetrain.Talon_FR.set(OI.driver.getY(Hand.kRight));
    Robot.drivetrain.Talon_FL.set(OI.driver.getY(Hand.kRight));
    }
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}