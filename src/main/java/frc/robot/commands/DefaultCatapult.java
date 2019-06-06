
package frc.robot.commands;

import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Command;
import frc.robot.OI;
import frc.robot.Robot;

public class DefaultCatapult extends Command {

  public DefaultCatapult() {
    requires(Robot.catapult);
  }

  @Override
  protected void initialize() {
  }

  @Override
  protected void execute() {
    if (OI.driver_button_A.get()) {
      Robot.catapult.getSolenoid().set(Value.kForward);	
    } else{
      Robot.catapult.getSolenoid().set(Value.kReverse);	
    } //else{
      //Robot.catapult.getSolenoid().set(Value.kOff);	
      //if(Robot.catapult.getSolenoid().get() == Value.kForward
    //}

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
