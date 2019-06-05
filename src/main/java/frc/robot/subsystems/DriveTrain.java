
package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.DefaultDrive;


public class DriveTrain extends Subsystem {

  public  WPI_TalonSRX Talon_FR = new WPI_TalonSRX(RobotMap.talon_FR);
  public  WPI_TalonSRX Talon_FL = new WPI_TalonSRX(RobotMap.talon_FL);
  public  WPI_TalonSRX Talon_RR = new WPI_TalonSRX(RobotMap.talon_RR);
  public  WPI_TalonSRX Talon_RL = new WPI_TalonSRX(RobotMap.talon_RL);

  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new DefaultDrive());
  } 

}
