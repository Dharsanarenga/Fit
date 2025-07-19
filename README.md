
# FlipFit 🏋️‍♂️

FlipFit is a Java-based fitness tracking system built for the **Flipkart GRiD 7.0 Case Study Round**.  
It allows users to register, log workouts, track calories burned, and monitor fitness progress through ratings.

---

## 🚀 Features

- ✅ User Registration  
- 📝 Workout Logging  
- 🔥 Calorie Burn Tracking  
- 📈 Progress Rating System  
- 🗂️ Data Persistence via File Writing  
- 🧠 Smart Input Validation and Error Handling  
- 🎯 Designed with modular services (Login, Workout Logging, File Handling)

---

## 🧩 Project Structure

```
FlipFit/
│
├── models/
│   ├── User.java          # Stores user profile information
│   └── Workout.java       # Holds workout and calories data
│
├── services/
│   ├── Login.java         # Handles user login & registration
│   ├── LogWorkout.java    # Records workout details
│   └── Generatefile.java  # Writes report to file
│
├── report.txt             # Output report (generated)
├── Main.java              # Entry point (if applicable)
└── README.md              # Project overview
```

---

## 💡 How It Works

1. **Register or Log in**: Users can register using their name and email ID.  
2. **Log Workouts**: Each session logs the type of workout and calories burned.  
3. **Track Progress**: Based on calorie goals, FlipFit rates the user’s performance.  
4. **Generate Report**: Data is written to a text file (`report.txt`) for reference.

---

## 🛠️ Technologies Used

- Java (Core Java, OOP)  
- File Handling (`BufferedWriter`)  
- Collections (`HashMap`, `ArrayList`)  
- Exception Handling

---

## 🧪 Example Usage

```
Enter name: John
Enter email: john@example.com

How many days did you work out? 3
Day 1: Pushups - 120 calories
Day 2: Running - 300 calories
Day 3: Cycling - 250 calories

Total Calories Burned: 670
Progress Rating: ⭐⭐⭐⭐ (Good)
```

---

## 📂 Output

- All user data and performance stats are stored in `report.txt`.  
- Can be extended to use a database or GUI in future.

---

## 📝 Notes

 
- Can be extended with **Java Swing GUI**, **Spring Boot**, or **REST API** support.

---

## 🙋 Author

Made with by Dharsana R

---

## 📜 License

This project is open-source and free to use.
