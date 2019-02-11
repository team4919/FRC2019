// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
//TODO  ultrasonic import if needed

package org.usfirst.frc4919.frc2019NEW;

import org.usfirst.frc4919.frc2019NEW.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.*;
import org.usfirst.frc4919.frc2019NEW.subsystems.*;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

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

    // Start the command when the button is released and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton frontPistonsDownButton;
    public JoystickButton frontPistonsUpButton;
    public JoystickButton backPistonsDownButton;
    public JoystickButton backPistonsUpButton;
    public JoystickButton towerPistonForwardsButton;
    public JoystickButton towerPistonBackwardsButton;
    public JoystickButton keyPistonRotateLeftButton;
    public JoystickButton keyPistonRotateRightButton;
    public JoystickButton gearShifterLowSpeedButton;
    public JoystickButton gearShifterHighSpeedButton;
    public Joystick joystick;
    public Joystick joystick2;
    public static Ultrasonic ultrasonic;
    public static LiveWindow liveWindow;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS

        joystick = new Joystick(0);

        keyPistonRotateRightButton = new JoystickButton(joystick, 1);
        keyPistonRotateRightButton.whileHeld(new KeyPistonRotateRight());
        keyPistonRotateLeftButton = new JoystickButton(joystick, 2);
        keyPistonRotateLeftButton.whileHeld(new KeyPistonRotateLeft());
        towerPistonBackwardsButton = new JoystickButton(joystick, 3);
        towerPistonBackwardsButton.whileHeld(new TowerPistonBackwards());
        towerPistonForwardsButton = new JoystickButton(joystick, 4);
        towerPistonForwardsButton.whileHeld(new TowerPistonForwards());
        backPistonsUpButton = new JoystickButton(joystick, 5);
        backPistonsUpButton.whileHeld(new BackPistonsUp());
        backPistonsDownButton = new JoystickButton(joystick, 6);
        backPistonsDownButton.whileHeld(new BackPistonsDown());
        frontPistonsUpButton = new JoystickButton(joystick, 7);
        frontPistonsUpButton.whileHeld(new FrontPistonsUp());
        frontPistonsDownButton = new JoystickButton(joystick, 9);
        frontPistonsDownButton.whileHeld(new FrontPistonsDown());
        gearShifterHighSpeedButton = new JoystickButton(joystick, 10);
        gearShifterHighSpeedButton.whileHeld(new GearShifterHighSpeed());
        gearShifterLowSpeedButton = new JoystickButton(joystick, 11);
        gearShifterLowSpeedButton.whileHeld(new GearShifterLowSpeed());
        // liveWindow = LiveWindow::GetInstance();
        ultrasonic = new Ultrasonic(0);
        LiveWindow.addSensor("sensors", "ultrasonic", ultrasonic);

        // SmartDashboard Buttons
        SmartDashboard.putData("Autonomous Command", new AutonomousCommand());
        SmartDashboard.putData("Front Pistons Down", new FrontPistonsDown());
        SmartDashboard.putData("Front Pistons Up", new FrontPistonsUp());
        SmartDashboard.putData("Back Pistons Down", new BackPistonsDown());
        SmartDashboard.putData("Back Pistons Up", new BackPistonsUp());
        SmartDashboard.putData("Tower Piston Forwards", new TowerPistonForwards());
        SmartDashboard.putData("Tower Piston Backwards", new TowerPistonBackwards());
        SmartDashboard.putData("Key Piston RotateLeft", new KeyPistonRotateLeft());
        SmartDashboard.putData("Key Piston RotateRight", new KeyPistonRotateRight());
        // TODO fix ultrasonic display error "cannot convert 'Ultrasonic' to double"
        SmartDashboard.putNumber("Ultrasonic", ultrasonic.getVoltage());
        SmartDashboard.putData("Gear Shifter Low Speed", new GearShifterLowSpeed());
        SmartDashboard.putData("Gear Shifter High Speed", new GearShifterHighSpeed());

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getJoystick() {
        return joystick;
    }

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}
