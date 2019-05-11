/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.AutonomousCatapult;

import edu.wpi.first.wpilibj.command.CommandGroup;
import frc.robot.OI;
import frc.robot.commands.DefaultArm;
import frc.robot.commands.DefaultArmInReverse;
import frc.robot.commands.DefaultCatapult;
import frc.robot.commands.DefaultCatapultInReverse;

public class AutonomousCatapult extends CommandGroup {
  /**
   * Add your docs here.
   */
  public AutonomousCatapult() {
    if(OI.gunner.getAButton()){
      addSequential(new OpenGrabber());
      addSequential(new CloseGrabber());
      addSequential(new DefaultArm());
      addSequential(new OpenGrabber());
      addSequential(new DefaultArmInReverse());
      addSequential(new DefaultCatapult());
      addSequential(new DefaultCatapultInReverse());
      addParallel(new DisableGrabber(), 0.5);
    }
  }
}
