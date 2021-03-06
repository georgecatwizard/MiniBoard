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

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

// END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import com.analog.adis16448.frc.ADIS16448_IMU;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	//Dont touch this stuff 
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static WPI_TalonSRX driveLeftFront;
    public static WPI_TalonSRX driveLeftBack;
    public static SpeedControllerGroup driveLeftGroup;
    public static WPI_TalonSRX driveRightFront;
    public static WPI_TalonSRX driveRightBack;
    public static SpeedControllerGroup driveRightGroup;
    public static WPI_TalonSRX rampTalon5;
    public static WPI_TalonSRX rampTalon6;
    public static WPI_TalonSRX manipulatorTalonLeft7;
    public static WPI_TalonSRX manipulatorTalonRight8;
    public static DoubleSolenoid shiftersShifterSolenoid;
    public static Encoder sensorsRightQEncoder;
    public static Encoder sensorsLeftQEncoder;
    public static DoubleSolenoid manipulatorSolenoid;
    public static Spark barMotor;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    
    //public static BuiltInAccelerometer imu;
    public static ADIS16448_IMU imu ;
    
    public static void init() {
    	
    	imu = new ADIS16448_IMU () ;
    	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    	/*
        driveLeftFront = new WPI_TalonSRX(1);
        
        
        driveLeftBack = new WPI_TalonSRX(2);
        
      
        driveLeftGroup = new SpeedControllerGroup(driveLeftFront, driveLeftBack  );
        LiveWindow.addActuator("Drive", "LeftGroup", driveLeftGroup);
        
        driveRightFront = new WPI_TalonSRX(3);
        
        
        driveRightBack = new WPI_TalonSRX(4);
        
        
        driveRightGroup = new SpeedControllerGroup(driveRightFront, driveRightBack  );
        LiveWindow.addActuator("Drive", "RightGroup", driveRightGroup);
        
        
        
     

        rampTalon5 = new WPI_TalonSRX(5);
        
        
        rampTalon6 = new WPI_TalonSRX(6);
        
        
        
        
        
        manipulatorTalonLeft7 = new WPI_TalonSRX(7);
        
        
        manipulatorTalonRight8 = new WPI_TalonSRX(8);
        */
        barMotor = new Spark(0);
        /*
        
        
        shiftersShifterSolenoid = new DoubleSolenoid(0, 1);
        LiveWindow.addActuator("Shifters", "ShifterSolenoid", shiftersShifterSolenoid);
        
        
        //not sure about these numbers
        //manipulatorSolenoid = new DoubleSolenoid(2, 3);
        //LiveWindow.addActuator("Manipulator", "manipulatorSolenoid", manipulatorSolenoid);
        
        sensorsRightQEncoder = new Encoder(0, 1, false, EncodingType.k4X);
        LiveWindow.addSensor("Sensors", "RightQEncoder", sensorsRightQEncoder);
        sensorsRightQEncoder.setDistancePerPulse(1.0);
        sensorsRightQEncoder.setPIDSourceType(PIDSourceType.kRate);
        sensorsLeftQEncoder = new Encoder(2, 3, false, EncodingType.k4X);
        LiveWindow.addSensor("Sensors", "LeftQEncoder", sensorsLeftQEncoder);
        sensorsLeftQEncoder.setDistancePerPulse(1.0);
        sensorsLeftQEncoder.setPIDSourceType(PIDSourceType.kRate);
	    */
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    	/*
        imu = new ADIS16448_IMU();
        
        driveLeftBack.follow(driveLeftBack);
        driveRightBack.follow(driveRightFront);
        
        //Sets Encoders to Talon's
        driveLeftFront.configSelectedFeedbackSensor(com.ctre.phoenix.motorcontrol.FeedbackDevice.QuadEncoder, 0, 0);
        driveLeftFront.setSensorPhase(false);
        driveRightFront.configSelectedFeedbackSensor(com.ctre.phoenix.motorcontrol.FeedbackDevice.QuadEncoder, 0, 0);
        driveRightFront.setSensorPhase(false);
        
        //Sets Encoder Pos = 0, timeoutMs
        driveLeftFront.getSensorCollection().setQuadraturePosition(0, 0);
        driveRightFront.getSensorCollection().setQuadraturePosition(0, 0);
        */
    }
}
