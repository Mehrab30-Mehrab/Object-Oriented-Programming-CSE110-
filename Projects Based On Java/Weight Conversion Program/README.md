<!-- ===================== 🚀 ANIMATED HEADER ===================== -->
<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=32&duration=3000&pause=900&color=FF4FD8&center=true&vCenter=true&width=1000&lines=⚖️+Weight+Conversion+Program;Java+Console+Application+☕;lbs+↔+kgs+Converter;Beginner+Friendly+Project+🚀;Made+with+Love+💖" />
</p>

<!-- ===================== 🌊 WAVE BANNER ===================== -->
<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&height=120&section=header"/>
</p>

---

## ⚖️ Weight Conversion Program (Java) 🚀

A **menu-driven Java console application** that converts weight between  
**Pounds (lbs)** and **Kilograms (kgs)** using accurate formulas 🧮✨

This project is perfect for **Java beginners** who want to practice:
- 📥 User input handling
- 🔀 Conditional statements
- 🔢 Mathematical conversions
- 🧹 Clean and readable code

---

## ✨ Features
✅ Convert **lbs ➜ kgs**  
✅ Convert **kgs ➜ lbs**  
✅ Interactive menu 📋  
✅ Formatted output 🖥️  
✅ Error handling for invalid input ❌  

---

## 🛠️ Technologies Used
☕ Java  
🧰 JDK 8+  
📥 Scanner Class  

---

## ▶️ How to Run 🏃‍♂️

1️⃣ Compile the program  
javac Weight_Conversion_Program.java  

2️⃣ Run the program  
java Weight_Conversion_Program  

---

## 📌 Sample Output 🧪

Weight Conversion Program  
1 : Convert lbs to kgs  
2 : Convert kgs to lbs  
Choose an option : 1  
Enter the weight in lbs : 150  
The new weight in kgs is : 68.04  

---

## 📂 Full Source Code 💻

import java.util.Scanner;

public class Weight_Conversion_Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1 : Convert lbs to kgs");
        System.out.println("2 : Convert kgs to lbs");
        System.out.print("Choose an option : ");
        choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter the weight in lbs : ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.printf("The new weight in kgs is : %.2f", newWeight);
        } else if (choice == 2) {
            System.out.print("Enter the weight in kgs : ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.printf("The new weight in lbs is : %.2f", newWeight);
        } else {
            System.out.println("Invalid choice ❌");
        }

        scanner.close();
    }
}

---

<!-- ===================== 🌊 FOOTER ===================== -->
<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&height=120&section=footer"/>
</p>

---

## 👨‍💻 Author ✨
**Mehrab**  
🎓 CSE Student | ☕ Java Beginner  

---

⭐ If you like this project, don’t forget to **star ⭐ the repository**  
💙 Keep Coding. Keep Learning. 🚀

