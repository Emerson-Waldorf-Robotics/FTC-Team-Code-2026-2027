package org.firstinspires.ftc.teamcode.teleop;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.devices.bases.BasicMotor;


@TeleOp(name="Intake Test", group="Prototyping")
public class IntakeTest extends LinearOpMode {
    @Override
    public void runOpMode() {
        ElapsedTime runtime = new ElapsedTime();

        telemetry.addData("Status", "Initialized");
        telemetry.update();

        BasicMotor intake = new BasicMotor(hardwareMap.get(DcMotorEx.class, "intake"));

        // Wait for the game to start (driver presses START)
        waitForStart();
        runtime.reset();

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
            double speed = gamepad1.left_stick_y;

            intake.run(speed);

            // Show the elapsed game time and wheel power.
            telemetry.addData("Elapsed", runtime);
            telemetry.addData("Speed", speed);
            telemetry.update();
        }
    }
}
