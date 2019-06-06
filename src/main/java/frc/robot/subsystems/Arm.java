
package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.DefaultArm;


public class Arm extends Subsystem {
  private DoubleSolenoid solenoid_A = new DoubleSolenoid(RobotMap.solenoid_A,RobotMap.solenoid_A_one,RobotMap.solenoid_A_two);
  private  WPI_TalonSRX talon_Arm = new WPI_TalonSRX(RobotMap.talon_arm);

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new DefaultArm());
  }
  public DoubleSolenoid getSolenoid(){
    return solenoid_A;
  }
  public WPI_TalonSRX getTalon(){
    return talon_Arm;
  }
  
}
