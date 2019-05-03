/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.ToGrabOrNotToGrab;

/**
 * Add your docs here.
 */
public class GrabbyThing extends Subsystem {
  DoubleSolenoid onegrabbyboi = new DoubleSolenoid(1, 0, 1); // NUMBERS NEED ADJUSTING, ADJUST AT RICHARD'S BEHEST
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  public DoubleSolenoid getSolenoid(){
    return onegrabbyboi;
  }
  @Override
  public void initDefaultCommand() {
    setDefaultCommand(new ToGrabOrNotToGrab());
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
