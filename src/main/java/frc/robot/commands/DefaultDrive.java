
package frc.robot.commands;


import edu.wpi.first.wpilibj.GenericHID.Hand;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;

public class DefaultDrive extends Command {

  int left_servo_value = 72, right_servo_value = 114;

  public DefaultDrive() {
    requires(Robot.drivetrain);
  }

  @Override
  protected void initialize() {

  }

  @Override
  protected void execute() {

    if (Math.abs(OI.driver.getY(Hand.kLeft)) < .1) {
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

  @Override
  protected boolean isFinished() {
    return false;
  }

  @Override
  protected void end() {
  }

  @Override
  protected void interrupted() {
  }

}