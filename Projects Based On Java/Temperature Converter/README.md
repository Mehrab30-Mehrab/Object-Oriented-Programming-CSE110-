<!-- ===================== CUSTOM BANNER ===================== -->

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:FF512F,100:DD2476&height=200&section=header&text=Temperature%20Converter&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" />
</p>

<h2 align="center">🌡️ Java Temperature Converter</h2>

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Orbitron&size=24&duration=3000&color=FF512F&center=true&vCenter=true&width=650&lines=Created+By+MEHRAB+MORSHED+MARJAN;CSE+Student+%7C+Java+Developer;Celsius+%E2%86%94+Fahrenheit+Converter;Clean+Console+Application+🚀" />
</p>

---

## 📌 Project Overview

💻 A simple **Java console-based Temperature Converter** that converts:

- 🌡️ Fahrenheit ➝ Celsius  
- 🌡️ Celsius ➝ Fahrenheit  

This project demonstrates conditional logic using the **ternary operator** and formatted output in Java.

---

## ✨ Features

- 🔢 Accepts temperature input  
- 🔁 Converts between Celsius & Fahrenheit  
- 🧠 Uses Ternary Operator  
- 🎯 Formatted output using `printf()`  
- 🖥️ Clean and simple console interaction  

---

## 🧠 Concepts Used

- `Scanner` class  
- Ternary Operator (`? :`)  
- String methods (`toUpperCase()`, `equals()`)  
- Arithmetic formulas  
- `System.out.printf()` formatting  
- Resource management  

---

## 🖥️ Program Code

```java
import java.util.Scanner;

public class Temperature_Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double temp;
        double newTemp;
        String unit;

        System.out.print("Enter the temperature : ");
        temp = scanner.nextDouble();

        System.out.print("Convert to Celsius or Fahrenheit ? (C or F) : ");
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ?  
                  (temp - 32) * 5 / 9 : 
                  (temp * 9 / 5) + 32;

        System.out.printf("%.1f°%s\n", newTemp, unit);

        scanner.close();
    }
}
```

---

## ▶️ How To Run

```bash
javac Temperature_Converter.java
java Temperature_Converter
```

---

## 📷 Sample Output

```
Enter the temperature : 100
Convert to Celsius or Fahrenheit ? (C or F) : C
37.8°C
```

```
Enter the temperature : 0
Convert to Celsius or Fahrenheit ? (C or F) : F
32.0°F
```

---

## 📊 Repository Stats

<p align="center">
  <img src="https://github-readme-stats.vercel.app/api?username=YOUR_GITHUB_USERNAME&show_icons=true&theme=radical&hide_border=true" height="150"/>
  <img src="https://github-readme-stats.vercel.app/api/top-langs/?username=YOUR_GITHUB_USERNAME&layout=compact&theme=radical&hide_border=true" height="150"/>
</p>

⚠️ Replace `YOUR_GITHUB_USERNAME` with your actual GitHub username.

---

## 🛠️ Built With

<p align="center">
  <img src="https://skillicons.dev/icons?i=java" />
</p>

---

## 🌊 Animated Footer

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:FF512F,100:DD2476&height=120&section=footer"/>
</p>

<p align="center">
  ⭐ If you found this helpful, consider starring the repository!
</p>

---

