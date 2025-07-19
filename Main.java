package main;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import models.*;
import services.*;

public class Main {

    Login loginService = new Login();
    LogWorkout logWorkoutService = new LogWorkout();
    Generatefile fileService = new Generatefile();

    JFrame frame;
    JTextField nameField, usernameField, passwordField, heightField, weightField, ageField;
    JTextField workoutNameField, durationField, dateField;

    String currentUser = "";

    public Main() {
        frame = new JFrame("FlipFit Fitness Tracker");
        frame.setSize(500, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(0, 1));

        // Registration Panel
        JPanel registerPanel = new JPanel(new GridLayout(7, 2));
        registerPanel.setBorder(BorderFactory.createTitledBorder("Register"));

        nameField = new JTextField();
        usernameField = new JTextField();
        passwordField = new JTextField();
        heightField = new JTextField();
        weightField = new JTextField();
        ageField = new JTextField();

        registerPanel.add(new JLabel("Name:"));
        registerPanel.add(nameField);
        registerPanel.add(new JLabel("Username:"));
        registerPanel.add(usernameField);
        registerPanel.add(new JLabel("Password:"));
        registerPanel.add(passwordField);
        registerPanel.add(new JLabel("Height:"));
        registerPanel.add(heightField);
        registerPanel.add(new JLabel("Weight:"));
        registerPanel.add(weightField);
        registerPanel.add(new JLabel("Age:"));
        registerPanel.add(ageField);

        JButton registerButton = new JButton("Register");
        registerPanel.add(registerButton);

        frame.add(registerPanel);

        // Workout Log Panel
        JPanel workoutPanel = new JPanel(new GridLayout(4, 2));
        workoutPanel.setBorder(BorderFactory.createTitledBorder("Log Workout"));

        workoutNameField = new JTextField();
        durationField = new JTextField();
        dateField = new JTextField();

        workoutPanel.add(new JLabel("Workout Name:"));
        workoutPanel.add(workoutNameField);
        workoutPanel.add(new JLabel("Duration (mins):"));
        workoutPanel.add(durationField);
        workoutPanel.add(new JLabel("Date (dd-mm-yyyy):"));
        workoutPanel.add(dateField);

        JButton logButton = new JButton("Log Workout");
        workoutPanel.add(logButton);

        frame.add(workoutPanel);

        // Buttons for progress and file
        JButton viewProgress = new JButton("View Weekly Progress");
        JButton generateFile = new JButton("Generate Report");

        frame.add(viewProgress);
        frame.add(generateFile);

        // Register Button Action
        registerButton.addActionListener(e -> {
            try {
                String name = nameField.getText();
                String uname = usernameField.getText();
                String pwd = passwordField.getText();
                int height = Integer.parseInt(heightField.getText());
                int weight = Integer.parseInt(weightField.getText());
                int age = Integer.parseInt(ageField.getText());

                loginService.registeruser(name, uname, pwd, height, weight, age);
                currentUser = uname;

                JOptionPane.showMessageDialog(frame, "User Registered Successfully!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Invalid Registration Details.");
            }
        });

        // Log Workout Button
        logButton.addActionListener(e -> {
            try {
                String wname = workoutNameField.getText();
                int duration = Integer.parseInt(durationField.getText());
                String date = dateField.getText();

                Workout workout = new Workout(wname, duration, date);
                logWorkoutService.addlog(currentUser, workout);

                JOptionPane.showMessageDialog(frame, "Workout Logged!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(frame, "Error logging workout.");
            }
        });

        // View Progress
        viewProgress.addActionListener(e -> {
            int total = logWorkoutService.calweeklycalories(currentUser);
            String message;
            if (total < 100)
                message = "Increase your activity!";
            else if (total < 300)
                message = "Good progress!";
            else
                message = "Excellent progress!";
            JOptionPane.showMessageDialog(frame, "Weekly Calories: " + total + "\n" + message);
        });

        // Generate File
        generateFile.addActionListener(e -> {
            for (User u : loginService.reguser) {
                if (u.username.equals(currentUser)) {
                    fileService.addtofile(u, logWorkoutService);
                    JOptionPane.showMessageDialog(frame, "Report written to file.");
                    break;
                }
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}
