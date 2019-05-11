/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import com.ctre.phoenix.motorcontrol.ControlMode;


import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;

public class DefaultArm extends Command {
  int taret, ARM_UP_SPEED = 1500, ARM_DOWN_SPEED = 1500;
  boolean is_pid_enabled_question_mark = true, up_limit_switch, down_limit_switch, is_finished = false;
  public DefaultArm() {
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    requires(Robot.onearmboi); 
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    taret = Robot.onearmboi.get_fricking_talon().getSelectedSensorPosition(0);
    up_limit_switch = Robot.onearmboi.get_fricking_talon().getSensorCollection().isFwdLimitSwitchClosed();
    down_limit_switch = Robot.onearmboi.get_fricking_talon().getSensorCollection().isRevLimitSwitchClosed();
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    up_limit_switch = Robot.onearmboi.get_fricking_talon().getSensorCollection().isFwdLimitSwitchClosed();
    down_limit_switch = Robot.onearmboi.get_fricking_talon().getSensorCollection().isRevLimitSwitchClosed();
    if (is_pid_enabled_question_mark){      
      while(!up_limit_switch){
        taret ++; // Subject to change, only incrementing by 1 here so that when we test, we have a safety
        Robot.onearmboi.get_fricking_talon().set(ControlMode.Position, taret);
        // Or down_limit_switch
      }   
    } else {
      /*if (Math.abs(OI.gunner.getY(Hand.kLeft)) < 0.1){
        Robot.onearmboi.get_fricking_talon().set(0);
      } else {
        Robot.onearmboi.get_fricking_talon().set(OI.gunner.getY(Hand.kLeft));
      }*/
      while(!up_limit_switch)
        Robot.onearmboi.get_fricking_talon().set(-1);
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
