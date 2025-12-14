# MoodWell
## A Console-Based Mental Health and Wellness Tracker

---

## 1. Project Title
**MoodWell: A Console-Based Mental Health and Wellness Tracker**

---

## 2. Description / Overview
**MoodWell** is a Java console-based application designed to help users monitor their daily mental and emotional well-being. The system allows users to create an account, log in, record daily mood, sleep hours, and stress levels, and view or analyze their entries.

The main objectives of the MoodWell program are:
- To help users monitor their mood, sleep, and stress levels
- To encourage awareness of mental health patterns
- To demonstrate proper implementation of Object-Oriented Programming (OOP) concepts in Java
- To provide a simple and user-friendly console-based tracking system

---

## 3. OOP Concepts Applied

### a. Encapsulation
Encapsulation is used to protect user data and prevent unauthorized access. The `Account` class stores sensitive data such as usernames and passwords as private variables. Access is controlled using methods such as `checkPassword()`, `addEntry()`, and `getEntries()`.

### b. Inheritance
Inheritance is applied to avoid code repetition among different entry types. All entry types inherit common attributes such as `date` and `notes` from the abstract `Entry` class.

### c. Polymorphism
Polymorphism allows different entry objects to be treated as a single parent type. When `displayEntry()` is called, Java automatically executes the correct method depending on whether the object is a `MoodEntry`, `SleepEntry`, or `StressEntry`.

### d. Abstraction
Abstraction is implemented using an abstract class. The `Entry` class defines abstract methods such as `displayEntry()`, which must be implemented by all subclasses.

### e. Try-Catch
Try-catch blocks are used to handle invalid numeric input from users. This prevents runtime crashes and ensures smooth program execution.

---

## 4. Program Structure

### Main Classes and Their Roles
- **MoodWell.java** – Launches the program and displays the welcome screen and account menu
- **Account.java** – Manages account creation, login, and registered users
- **User.java** – Stores individual user information and daily entries
- **Entry.java (abstract)** – Base class for daily entries with date and notes
- **MoodEntry.java** – Stores mood ratings
- **SleepEntry.java** – Stores hours slept
- **StressEntry.java** – Stores stress levels
- **MainMenu.java** – Handles user operations after login (add entries, view/search entries, view statistics)

### Class Relationships
- A **User** has multiple **Entry** objects
- **MoodEntry**, **SleepEntry**, and **StressEntry** inherit from **Entry**
- **Account** manages multiple **User** objects
- **MainMenu** operates on a **User** object once logged in

---

## 5. How to Run the Program

1. Install **Java JDK (version 8 or above)**
2. Install **Git** and an IDE (e.g., VS Code)
3. Clone the repository:
   ```
   git clone https://github.com/C-hynneA/MoodWell.git
   ```
4. Open the project folder in your IDE
5. Run `MoodWell.java`
6. Follow the on-screen console prompts

---

## 6. Sample Output
When the program runs, the user is presented with an account menu where they can create an account, log in, and manage mood, sleep, and stress entries through console prompts.

---

## 7. Author and Acknowledgement

### Authors
- Flores, Riana Gabriele M.
- Hernandez, Kyla Mae D.
- Vargas, Chynne Andrea B.

### Acknowledgement
We would like to sincerely thank God, our instructor Sir Juriel Comia, our class adviser Ma’am Glydel Ann Reyes, our parents, and our friends for their guidance, support, and encouragement throughout the completion of this project.

---

## 8. Future Enhancements
- Persistent data storage using files or a database
- Graphical User Interface (GUI) using JavaFX or Swing
- Visual analytics using charts and graphs
- Notifications and reminders
- Export options (PDF/CSV)
- Multi-user support
- Mobile-friendly version
