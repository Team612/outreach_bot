
package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.DefaultCatapult;

public class Catapult extends Subsystem {
  
  private DoubleSolenoid solenoid_C = new DoubleSolenoid(RobotMap.solenoid_C,RobotMap.solenoid_C_one,RobotMap.solenoid_C_two);

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new DefaultCatapult());
  }

  public DoubleSolenoid getSolenoid(){
    return solenoid_C;
  }

}
