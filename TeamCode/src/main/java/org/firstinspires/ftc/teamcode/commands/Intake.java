package org.firstinspires.ftc.teamcode.commands;

import com.pedropathing.ivy.Command;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;

public class Intake {
    private final DcMotorEx intakeMotor;

    public final Command runIntake;

    public Intake(DcMotorEx intakeMotor) {
        this.intakeMotor = intakeMotor;
        //this.intakeMotor.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        this.intakeMotor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.FLOAT);
        //this.intakeMotor.setVelocityPIDFCoefficients();

        runIntake = Command.build()
                .setStart(() -> {})
                .setExecute(() -> {})
                .setDone(() -> false)
                .setEnd(condition -> {});
    }

    public void run(double speed) {
        //intakeMotor.setVelocity(speed);
        intakeMotor.setPower(speed);
    }

    public void stop() {
        intakeMotor.setPower(0);
    }
}
