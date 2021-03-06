// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc5459.Protobot54592018.subsystems;

import org.usfirst.frc5459.Protobot54592018.Robot;
import org.usfirst.frc5459.Protobot54592018.RobotMap;
import org.usfirst.frc5459.Protobot54592018.commands.*;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class ManipulatorIntake extends Subsystem {  
	

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
/*    private final WPI_TalonSRX manipulatorTalon1 = RobotMap.manipulatorTalonLeft7;
    private final WPI_TalonSRX manipulatorTalon2 = RobotMap.manipulatorTalonRight8;
    private final Spark barMotor = RobotMap.barMotor;
    private final DoubleSolenoid flipSolenoid = RobotMap.manipulatorSolenoid;
*/
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    //motor one and two are for intake 
    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
 //   	setDefaultCommand(new DriveCommand());
    	
    	
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    /*
    public void flipOut(){
    	//true or on?
    	
    	RobotMap.shiftersShifterSolenoid.set(DoubleSolenoid.Value.kForward);
    } 
    public void flipIn(){
    	//true or on?
    	
    	RobotMap.shiftersShifterSolenoid.set(DoubleSolenoid.Value.kReverse);
    } 
    
    public void intakeIn (){
    	manipulatorTalon1.set(0.5);
    	manipulatorTalon2.set(-0.5);
    	//not sure if its this way or the other way
    	
    	
    }
    public void intakeOut (){
    	manipulatorTalon1.set(-0.5);
    	manipulatorTalon2.set(0.5);
    	//not sure if its this way or the other way
    	
    	
    }
    public void intakeOff (){
    	manipulatorTalon1.set(0.0);
    	manipulatorTalon2.set(0.0);
    	//not sure if its this way or the other way
    	
    	
    }
    public void intakeSet (double power){
    	manipulatorTalon1.set(power);
    	manipulatorTalon2.set(power);
    	
    	if (power <= 0){
    		Robot.manipulatorIntake.barOn();
    	}
    	else {
    		Robot.manipulatorIntake.barBack();
    	}
    	
    }
    
    public void barOn () {
    	barMotor.set(1.0);
    }
    public void barBack (){
    	barMotor.set(-1.0);
    }
    public void barOff () {
    	barMotor.set(0.0);
    }
    */
}

