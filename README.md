# MoodWell: A Console-Based Mental Health and Wellness Tracker

---

## 1. Project Title
**MoodWell: A Console-Based Mental Health and Wellness Tracker**

---

## 2. Description / Overview
MoodWell is a Java console-based application designed to help users monitor their daily mental and emotional well-being. It allows users to create an account, log in, record daily mood, sleep hours, and stress levels, and then view all entries or analyze mood statistics.

The main objectives of the MoodWell program are:
- To help the user monitor their mood, sleep, and stress levels  
- To encourage awareness of mental health patterns  
- To demonstrate proper implementation of OOP concepts in Java  
- To provide a simple, user-friendly console-based tracking system  

---

## 3. OOP Concepts Applied

### a. Encapsulation
Encapsulation protects user data and prevents unauthorized access. The `Account` class stores data such as username and password as private variables. Access is controlled using methods like `checkPassword()`, `addEntry()`, and `getEntries()`.

### b. Inheritance
Inheritance is used to avoid code repetition among different entry types. All entry types inherit common attributes such as `date` and `notes` from the abstract `Entry` class.

### c. Polymorphism
Polymorphism allows different entry objects to be treated as one parent type. When `displayEntry()` is called, Java automatically executes the correct method depending on whether the object is a `MoodEntry`, `SleepEntry`, or `StressEntry`.

### d. Abstraction
Abstraction is used through the abstract `Entry` class. Each subclass must implement its own version of `displayEntry()`.

### e. Try-Catch
Try-catch blocks are used to handle invalid numeric input from users. This prevents runtime crashes and ensures smooth program execution.

---

## 4. Program Structure

### Main Classes and Their Roles
- **MoodWell.java** – Launches the program and displays the welcome screen and account menu  
- **Account.java** – Manages account creation, login, and stores registered users  
- **User.java** – Stores individual user information and daily entries  
- **Entry.java (abstract)** – Base class for daily entries with date and notes  
- **MoodEntry.java** – Stores mood ratings  
- **SleepEntry.java** – Stores hours slept  
- **StressEntry.java** – Stores stress levels  
- **MainMenu.java** – Handles main user operations after login (add entries, view/search entries, view statistics)  

### Class Relationships
- A **User** has multiple **Entry** objects  
- **MoodEntry**, **SleepEntry**, and **StressEntry** inherit from **Entry**  
- **Account** manages multiple **User** objects  
- **MainMenu** operates on a **User** object once logged in  

---

## 5. How to Run the Program

1. Make sure you have **Java JDK (version 8 or above)** installed  
2. Install **Git** and an IDE (e.g., VS Code)  
3. Clone the repository from GitHub:
   ```
   git clone https://github.com/C-hynneA/MoodWell.git
   ```
4. Open the project folder in your IDE  
5. Open `MoodWell.java`  
6. Run the program  
7. Follow the on-screen prompts in the console  

---

## 6. Sample Output
When the program runs, the user is first shown an **Account Menu** in the console. After logging in, the **Main Menu** allows users to add entries, view entries, search records, and view statistics related to mood, sleep, and stress levels.
![Create Account](screenshots/1.png)

---

## 7. Author and Acknowledgement

### Authors
- Flores, Riana Gabriele M.  
- Hernandez, Kyla Mae D.  
- Vargas, Chynne Andrea B.  

### Acknowledgement
We would like to sincerely thank God for His guidance throughout this semester. We are grateful to our instructor, **Sir Juriel Comia**, for his patience, knowledge, and encouragement in teaching Java programming. We also thank our class adviser, **Ma’am Glydel Ann Reyes**, for her continuous support and guidance.

We extend our gratitude to our parents for their unwavering support and encouragement, and to our friends—Krizea Gabrielle, Kyla Marie, Leann Kirsten, Rhizel Kristine, Jouana Joy, and Joshua Vincent—for their motivation and companionship throughout the project.

---

## 8. Future Enhancements
- Persistent data storage using file handling or a lightweight database  
- Graphical User Interface (GUI) using JavaFX or Swing  
- Visual analytics using charts and graphs  
- Notifications and reminders for daily entries  
- Customizable motivational quotes and wellness tips  
- Export options for data (PDF or CSV)  
- Multi-user support with separate profiles  
- Mobile-friendly or web-based version  

