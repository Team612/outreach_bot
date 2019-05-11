/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.DefaultArm;

/**
 * Add your docs here.
 */
public class ArmForGrabber extends Subsystem {
  double kF = 0;
  double kP = 0.001; // SUBJECT TO CHANGE
  double kI = 0;
  double kD = 0;
  private static WPI_TalonSRX armboi = new WPI_TalonSRX(00000); // 00000 is temporary

  public WPI_TalonSRX get_fricking_talon(){
    return armboi;
  }

  public void configArm(){
    //armboi.setInverted(true); //subject to change
    //armboi.setNeutralMode(NeutralMode.Brake); //subject to change
    armboi.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 100);
    armboi.selectProfileSlot(0, 0); // Find out what THIS does
    /*
      Some Ideas for selectProfileSlot
        1) It gives the port for the encoder
            a) Second int gives options for which type of closed-loop control
    */
    armboi.config_kF(0, kF, 100);
    armboi.config_kP(0, kP, 100);
    armboi.config_kI(0, kI, 100);
    armboi.config_kD(0, kD, 100);

  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    configArm();
  }
}
