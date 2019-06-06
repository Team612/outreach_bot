
package frc.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
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
    Robot.driver_pov.setPreference(true);
  }

  @Override
  protected void execute() {
    if ((Robot.driver_pov.get_direction()).toLowerCase().equals("south")) {
      //Robot.catapult.getSolenoid().set(Value.kForward);	
      Robot.arm.getTalon().set(-.3);
    } else if((Robot.driver_pov.get_direction()).toLowerCase().equals("north")) {
      //Robot.catapult.getSolenoid().set(Value.kReverse);	
      Robot.arm.getTalon().set(.3);
    }else {
      //Robot.catapult.getSolenoid().set(Value.kOff);	
      Robot.arm.getTalon().set(0.0);
    }
    if (OI.driver_button_B.get()) {
      Robot.arm.getSolenoid().set(Value.kForward);	
    } else{
      Robot.arm.getSolenoid().set(Value.kReverse);	
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
