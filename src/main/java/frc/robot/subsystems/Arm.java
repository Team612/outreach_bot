
package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.DefaultArm;


public class Arm extends Subsystem {
  
  public  WPI_TalonSRX talon_Arm = new WPI_TalonSRX(RobotMap.talon_arm);

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new DefaultArm());
  }
  
}
