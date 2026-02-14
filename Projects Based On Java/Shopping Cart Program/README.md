<!-- ===================== CUSTOM BANNER ===================== -->

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:00F5A0,100:00D9F5&height=200&section=header&text=Shopping%20Cart%20Program&fontSize=40&fontColor=ffffff&animation=fadeIn&fontAlignY=35" />
</p>

<h2 align="center">🛒 Java Console Shopping Cart</h2>

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Orbitron&size=24&duration=3000&color=00F5A0&center=true&vCenter=true&width=650&lines=Created+By+MEHRAB+MORSHED+MARJAN;CSE+Student+%7C+Java+Developer;Beginner+Friendly+Console+Project;Keep+Learning+Keep+Building+🚀" />
</p>

---

## 📌 Project Overview

💻 A simple **Java-based Shopping Cart Program** that allows users to input item details and calculate the total cost instantly.

Perfect for beginners practicing Java fundamentals.

---

## ✨ Features

- 📝 Accepts item name input  
- 💲 Takes item price  
- 🔢 Accepts quantity  
- 🧮 Calculates total automatically  
- 🖥️ Displays clean purchase summary  

---

## 🧠 Concepts Used

- `Scanner` class  
- Primitive Data Types  
- Arithmetic Operations  
- Console Output  
- Resource Management  

---

## 🖥️ Program Code

```java
import java.util.Scanner;

public class Shopping_Cart_Program {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        int quantity;
        char currency = '$';
        double total;

        System.out.print("Enter the item name: ");
        item = scanner.nextLine();

        System.out.print("Enter the item price: ");
        price = scanner.nextDouble();

        System.out.print("Enter the quantity: ");
        quantity = scanner.nextInt();

        total = price * quantity;

        System.out.println("\nYou've bought " + quantity + " " + item + "/s");
        System.out.println("Your total is " + currency + total);

        scanner.close();
    }
}
```

---

## ▶️ How To Run

```bash
javac Shopping_Cart_Program.java
java Shopping_Cart_Program
```

---

## 📷 Sample Output

```
Enter the item name: Apple
Enter the item price: 2.5
Enter the quantity: 4

You've bought 4 Apple/s
Your total is $10.0
```

---

## 🛠️ Built With

<p align="center">
  <img src="https://skillicons.dev/icons?i=java" />
</p>

---

## 📊 Repository Stats

<p align="center">
  <img src="https://github-readme-stats.vercel.app/api?username=YOUR_GITHUB_USERNAME&show_icons=true&theme=tokyonight&hide_border=true" height="150"/>
  <img src="https://github-readme-stats.vercel.app/api/top-langs/?username=YOUR_GITHUB_USERNAME&layout=compact&theme=tokyonight&hide_border=true" height="150"/>
</p>

⚠️ Replace `YOUR_GITHUB_USERNAME` with your actual GitHub username.

---

## 🌊 Animated Footer

<p align="center">
  <img src="https://capsule-render.vercel.app/api?type=waving&color=0:00F5A0,100:00D9F5&height=120&section=footer"/>
</p>

<p align="center">
  ⭐ If you like this project, give it a star!
</p>

---

