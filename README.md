FlipFit - Java Swing Fitness Tracker
FlipFit is a simple desktop-based fitness tracking application built using Core Java and Java Swing for GUI. It allows users to:

1.Register and log user details

2.Log daily workout details

3.Track calories burnt

4.Rate daily and weekly progress

5.Export reports to a text file

🔧 Technologies Used

Java (Core Java)

Java Swing (for GUI)

File I/O (for saving logs)

OOPs Concepts (Encapsulation, Inheritance)

📁 Project Structure

FlipFit/
├── models/
│   └── User.java
├── services/
│   ├── LogWorkout.java
│   └── GenerateFile.java
├── ui/
│   └── FlipFitGUI.java
├── report.txt
└── README.md

🖥️ GUI Features (Java Swing)

Register Tab

Fields: Username, Age, Gender, Weight, Height

Button: Register

Saves user details to memory for the session

Workout Log Tab

Fields: Activity Name, Duration (minutes), Intensity

Button: Log Workout

Updates calorie data based on predefined logic

Report Tab

Button: Generate Report

Exports the weekly summary and calories to report.txt

🚀 How to Run

Clone the repository

git clone https://github.com/yourusername/flipfit.git
cd flipfit

Compile the files

javac models/*.java services/*.java ui/*.java

Run the GUI

java ui.FlipFitGUI

Make sure report.txt is in the root directory or it will be auto-generated.

📌 Future Enhancements

Add user authentication

Store user data in files or a database

Generate graphical reports

Integrate ML-based recommendations



👨‍💻 Author

Dharsana R - B.Tech CSE Student @ SASTRA University



