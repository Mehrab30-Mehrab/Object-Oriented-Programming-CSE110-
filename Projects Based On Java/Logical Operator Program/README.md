<!-- ===================================== -->
<!-- 🚀 ANIMATED HEADER -->
<!-- ===================================== -->

<p align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=30&duration=3000&pause=1000&color=00F7FF&center=true&vCenter=true&width=900&lines=Mehrab's+Java+Projects;Logical+Operator+Username+Validator;Learning+Java+Step+by+Step+🚀" />
</p>

<p align="center">
  <img src="https://img.shields.io/badge/Language-Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>
  <img src="https://img.shields.io/badge/Focus-Input%20Validation-blue?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Concept-Logical%20Operators-purple?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Level-Beginner-brightgreen?style=for-the-badge"/>
</p>

---

# 🔐 Logical Operator Username Validator

## 📌 Project Description

This Java mini project validates a username using logical operators.

### ✅ Validation Rules:
- Username must be between **4 – 12 characters**
- Username must NOT contain **spaces (" ")**
- Username must NOT contain **underscores ("_")**

If all conditions are satisfied → the user is welcomed 🎉

---

## 🧠 Concepts Used

- `||` → OR operator  
- `&&` → AND operator  
- `!` → NOT operator  
- `String.length()`  
- `String.contains()`  
- `Scanner` class  

---

## 💻 Full Java Code

```java
import java.util.Scanner;

public class Logical_Operator_Project {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your new username: ");
        String username = scanner.nextLine();

        boolean validLength = username.length() >= 4 && username.length() <= 12;
        boolean hasInvalidChar = username.contains(" ") || username.contains("_");

        if (!validLength) {
            System.out.println("Username must be between 4-12 characters");
        }
        else if (hasInvalidChar) {
            System.out.println("Username cannot contain spaces or underscores");
        }
        else {
            System.out.println("Welcome " + username);
        }

        scanner.close();
    }
}
```

---

## 🧪 Example Output

### ❌ Invalid Length

```
Enter your new username: abc
Username must be between 4-12 characters
```

### ❌ Contains Underscore

```
Enter your new username: mehrab_123
Username cannot contain spaces or underscores
```

### ✅ Valid Username

```
Enter your new username: mehrab123
Welcome mehrab123
```

---

## 🎯 What I Learned

✨ How logical operators control program flow  
✨ How to validate user input  
✨ Writing clean boolean conditions  
✨ Structuring beginner-friendly Java programs  

---

## 📚 Part of My Java Learning Journey

This project is one of many in my Java repository where I am uploading:

- 🧮 Compound Interest Calculator  
- 🛒 Shopping Cart Program  
- ⚖ Weight Conversion Program  
- 🎭 Mad Libs Game  
- 🔐 Username Validator  

More projects coming soon 🚀

---

<p align="center">
  Made with ☕ and Java by <b>Mehrab</b>
</p>
