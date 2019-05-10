/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST0. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.DefaultCatapult;
/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class Catapult extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public DoubleSolenoid catapultboi = new DoubleSolenoid(0, 0, 1); // 0 is temporary, so are forward and reverse channel port #'s
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new DefaultCatapult());
  }
}