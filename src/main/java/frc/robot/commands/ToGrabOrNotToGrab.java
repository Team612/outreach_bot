/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;

public class ToGrabOrNotToGrab extends Command {
  public ToGrabOrNotToGrab() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.onegrabbyboi);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    Robot.onegrabbyboi.getSolenoid().set(Value.kOff);
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    if(OI.gunner.getBumper(Hand.kLeft)){
      Robot.onegrabbyboi.getSolenoid().set(Value.kForward);
    } else if(OI.gunner.getBumper(Hand.kRight)){
      Robot.onegrabbyboi.getSolenoid().set(Value.kReverse);
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
