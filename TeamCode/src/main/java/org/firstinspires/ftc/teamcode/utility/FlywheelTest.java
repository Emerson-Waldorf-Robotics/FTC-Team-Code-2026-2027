package org.firstinspires.ftc.teamcode.utility;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Utility;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.util.ElapsedTime;

import org.firstinspires.ftc.teamcode.devices.bases.BasicMotor;


@Utility(name="Flywheel Test", description = "Directly control flywheel power with the left stick.")
public class FlywheelTest extends LinearOpMode {
    @Override
    public void runOpMode() {
        ElapsedTime runtime = new ElapsedTime();

        telemetry.addData("Status", "Initialized");
        telemetry.update();

        BasicMotor flywheel = new BasicMotor(hardwareMap.get(DcMotorEx.class, "flywheel"));

        // Wait for the game to start (driver presses START)
        waitForStart();
        runtime.reset();

        // run until the end of the match (driver presses STOP)
        while (opModeIsActive()) {
            double speed = gamepad1.left_stick_y;

            flywheel.run(speed);

            // Show the elapsed game time and wheel power.
            telemetry.addData("Elapsed", runtime);
            telemetry.addData("Speed", speed);
            telemetry.update();
        }
    }
}
