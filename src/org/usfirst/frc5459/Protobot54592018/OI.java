// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5459.Protobot54592018;

import org.usfirst.frc5459.Protobot54592018.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc5459.Protobot54592018.subsystems.*;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);

    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.

    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:

    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());

    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());

    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());


    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
	/*
    public JoystickButton jB2;
    public JoystickButton jB1;
    public JoystickButton jB3;
    public JoystickButton jB4;
    public JoystickButton xB1;
    public JoystickButton xB2;
    public JoystickButton xB3;
    public JoystickButton xB4;
    public JoystickButton xB5;
   
    
    
    
    public Joystick O1;
    public Joystick O2;
    public XboxController O3;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        O2 = new Joystick(1);
        
        O1 = new Joystick(0);
        
        O3 = new XboxController(2);
        
        //xB1 = new JoystickButton(O3,0);
        //xB1.whenPressed(new IntakeIn());
        
        //xB2 = new JoystickButton(O3,1);
        //xB2.whenPressed(new IntakeOut());
        
        //xB3 = new JoystickButton(O3,2);
        //xB3.whenPressed(new OutakeIn());
        
        //xB4 = new JoystickButton(O3,3);
        //xB4.whenPressed(new OutakeOut());
        
        jB1 = new JoystickButton(O1, 1);
        jB1.whenPressed(new ShiftUp());
        jB2 = new JoystickButton(O1, 2);
        jB2.whenPressed(new ShiftDown());
        
        jB3 = new JoystickButton(O1, 5);
        //jB3.whenPressed(new AutoShiftOn());
        jB4 = new JoystickButton(O1, 3);
        //jB4.whenPressed(new AutoShiftOff());
        xB4 = new JoystickButton(O3, 4);
        xB4.whenPressed(new FlipIn());
        xB5 = new JoystickButton(O3,5);
        xB5.whenPressed(new FlipOut());
       


        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousStandStill());
        SmartDashboard.putData("ShiftUp", new ShiftUp());
        SmartDashboard.putData("ShiftDown", new ShiftDown());
        SmartDashboard.putData("TurnTo", new TurnTo());
        SmartDashboard.putData("HelpfulPID", new HelpfulPID());
        SmartDashboard.putData("DrivePID", new DrivePID());
		*/
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
	/*
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick O1() {
        return O1;
    }

    public Joystick O2() {
        return O2;
    }
    public XboxController O3(){
    	return O3;
    }
	*/

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
//}
