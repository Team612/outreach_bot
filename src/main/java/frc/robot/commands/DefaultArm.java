
package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;

public class DefaultArm extends Command {

  private double LAUNCH_SPEED = 0.5;

  public DefaultArm() {
    requires(Robot.arm);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    if (OI.gunner_button_B.get()) {
      Robot.arm.talon_Arm.set(LAUNCH_SPEED);
    }
    else{
      Robot.arm.talon_Arm.set(0);
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
