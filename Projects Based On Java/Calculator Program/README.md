<!-- ===================================== -->
<!-- 🖤 DARK AESTHETIC HEADER -->
<!-- ===================================== -->

<h1 align="center">
  <img src="https://readme-typing-svg.herokuapp.com?font=Fira+Code&size=30&duration=3000&pause=800&color=8A2BE2&center=true&vCenter=true&width=950&lines=JAVA+CALCULATOR+PROGRAM;Minimal+Dark+Console+Project;Clean+Logic+%7C+Modern+Switch+%7C+Error+Handling" />
</h1>

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-black?style=for-the-badge&logo=java&logoColor=8A2BE2"/>
  <img src="https://img.shields.io/badge/Console-App-black?style=for-the-badge&logo=windows-terminal&logoColor=00F7FF"/>
  <img src="https://img.shields.io/badge/Status-Complete-black?style=for-the-badge&logo=github&logoColor=8A2BE2"/>
</p>

<p align="center">
<b>🖤 Minimal • ⚡ Fast • 🎯 Precise • 🔮 Clean Architecture</b>
</p>

<img src="https://capsule-render.vercel.app/api?type=rect&color=0:111111,100:8A2BE2&height=4"/>

---

# 🖤 Overview

A dark-themed console calculator built using modern **Java switch expressions**.

Designed with:

- ⚡ Clean logic flow  
- 🛡️ Safe division handling  
- 🔮 Power operation support  
- 🎯 Precision output formatting  

---

# ⚙️ Supported Operations

| Symbol | Action |
|--------|--------|
| ➕ | Addition |
| ➖ | Subtraction |
| ✖ | Multiplication |
| ➗ | Division (Zero Protected) |
| ^ | Exponentiation |

---

# 🧠 Technical Highlights

✔ Modern arrow-based `switch` syntax  
✔ `Math.pow()` implementation  
✔ Boolean validation logic  
✔ Formatted output (`%.2f`)  
✔ Input handling using `Scanner`  

---

# 🖥️ Code

```java
import java.util.Scanner;

public class Calculator_Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperation = true;

        System.out.println("Enter number 1 :");
        num1 = scanner.nextDouble();

        System.out.println("Enter an operator (+,-,*,/,^) : ");
        operator = scanner.next().charAt(0);

        System.out.println("Enter number 2 :");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Can't divide by 0!");
                    validOperation = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invalid Operator!");
                validOperation = false;
            }
        }

        if (validOperation) {
            System.out.printf("The result is : %.2f", result);
        }

        scanner.close();
    }
}
```

---

# ▶ Run Locally

```bash
javac Calculator_Program.java
java Calculator_Program
```

---

# 🧪 Sample Execution

```
Enter number 1 :
9
Enter an operator (+,-,*,/,^) :
^
Enter number 2 :
2
The result is : 81.00
```

---

# 🖤 Future Upgrades

- 🔁 Continuous calculation loop  
- 🧮 Scientific functions  
- 🎨 JavaFX dark UI version  
- 📦 OOP structured calculator  

---

# 👤 Author

**Mehrab Morshed Marjan**  
CSE Student | Aspiring Software Engineer  

---

<p align="center">
<img src="https://capsule-render.vercel.app/api?type=waving&color=0:111111,100:8A2BE2&height=150&section=footer"/>
</p>
