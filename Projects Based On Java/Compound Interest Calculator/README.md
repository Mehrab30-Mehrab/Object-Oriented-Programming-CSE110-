<!-- ===================== 💰 ANIMATED HEADER ===================== -->
<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=32&duration=3000&pause=900&color=00FFB7&center=true&vCenter=true&width=1000&lines=💰+Compound+Interest+Calculator;Java+Console+Application+☕;Finance+Math+with+Java;Beginner+Friendly+Project+🚀;Learn+•+Code+•+Grow+📈" />
</p>

<!-- ===================== 🌊 WAVE BANNER ===================== -->
<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=gradient&height=120&section=header"/>
</p>

---

## 💰 Compound Interest Calculator (Java) 📈

A **Java console-based application** that calculates the **final amount** using the  
**Compound Interest Formula** based on user input.

This project is ideal for **Java beginners** learning:
- 📥 User input with `Scanner`
- 🧮 Mathematical calculations using `Math.pow()`
- 🔢 Financial formulas
- 🧹 Clean and readable Java code

---

## ✨ Features
✅ Takes **principal amount**  
✅ Uses **interest rate (%)**  
✅ Supports **compound frequency per year**  
✅ Calculates total amount after given years  
✅ Displays formatted output 💵  

---

## 🧮 Formula Used

Compound Interest Formula:

A = P × (1 + r / n)^(n × t)

Where:  
- P = Principal amount  
- r = Annual interest rate  
- n = Number of times interest is compounded per year  
- t = Time (in years)  

---

## 🛠️ Technologies Used
☕ Java  
🧰 JDK 8+  
📥 Scanner Class  

---

## ▶️ How to Run 🏃‍♂️

1️⃣ Compile the program  
javac Compound_Interest_Calculator.java  

2️⃣ Run the program  
java Compound_Interest_Calculator  

---

## 📌 Sample Output 🧪

Enter principal amount : 1000  
Enter interest rate (in %) : 5  
Enter the # of years : 3  
Enter the # of times compounded per year : 4  
The amount after 3 years is $1160.75  

---

## 📂 Full Source Code 💻

import java.util.Scanner;

public class Compound_Interest_Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter principal amount : ");
        principal = scanner.nextDouble();

        System.out.print("Enter interest rate (in %) : ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of years : ");
        years = scanner.nextInt();

        System.out.print("Enter the # of times compounded per year : ");
        timesCompounded = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d years is $%.2f\n", years, amount);

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

⭐ If you found this project useful, don’t forget to **star ⭐ the repository**  
📈 Keep learning. Keep compounding your skills. 🚀

