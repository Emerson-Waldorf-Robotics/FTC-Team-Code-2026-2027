package org.firstinspires.ftc.teamcode.devices.bases;

import com.qualcomm.robotcore.hardware.DcMotor.ZeroPowerBehavior;
import com.qualcomm.robotcore.hardware.DcMotorEx;


/// A basic, power-controlled (vs velocity), motor
public class BasicMotor {
    private final DcMotorEx motor;

    public BasicMotor(DcMotorEx motor) {
        this.motor = motor;
        this.motor.setZeroPowerBehavior(ZeroPowerBehavior.FLOAT);
    }

    public BasicMotor(DcMotorEx motor, ZeroPowerBehavior zeroPowerBehavior) {
        this.motor = motor;
        this.motor.setZeroPowerBehavior(zeroPowerBehavior);
    }

    public void run(double speed) {
        motor.setPower(speed);
    }

    public void stop() {
        motor.setPower(0);
    }
}
