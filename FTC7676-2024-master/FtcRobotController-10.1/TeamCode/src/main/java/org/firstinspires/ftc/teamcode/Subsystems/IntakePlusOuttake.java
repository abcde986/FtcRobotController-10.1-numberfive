package org.firstinspires.ftc.teamcode.Subsystems;

import com.arcrobotics.ftclib.command.SubsystemBase;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class IntakePlusOuttake extends SubsystemBase {

    public Servo loadShooter5000 = null;

    public loadShooter5000 (HardwareMap ahwMap) {

        loadShooter5000 = ahwMap.get(Servo.class, "loadShooter5000");

        loadShooter5000.setDirection(Servo.Direction.FORWARD);

        loadShooter5000.setZeroPowerBehavior(Servo.ZeroPowerBehavior.BRAKE);
    }

    public void setClaw(double power) {
        loadShooter5000.setPower(power);
    }
}

