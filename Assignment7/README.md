# Assignment 7 - C Programming Exercises

This folder contains five C programs designed to perform various numerical and pattern-based operations.

## Program Descriptions

1.  **program1_pattern.c:**
    * Description: Accepts an integer as input and displays a pattern of asterisks (`*`) and hash symbols (`#`). The number of asterisks and hash symbols printed is equal to the input integer.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `Display(int iNo)`: Prints the pattern of `*` and `#` based on the input integer `iNo`.
        * `main()`:  The main function prompts the user for an integer and calls the `Display` function.
    * Time Complexity: O(2N)

2.  **program2_currency.c:**
    * Description: Converts a given amount in US dollars (USD) to Indian Rupees (INR).  The conversion rate is assumed to be 70 INR per 1 USD.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `DollarToINR(int iNo)`: Converts USD to INR using the fixed conversion rate and returns the INR amount.
        * `main()`: Prompts the user for the amount in USD, calls `DollarToINR`, and prints the equivalent amount in INR.

3.  **program3_even_factorial.c:**
    * Description: Calculates the factorial of even numbers up to a given integer.  Handles negative input by taking the absolute value.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `EvenFactorial(int iNo)`: Calculates the product of even numbers from 1 up to `iNo`.
        * `main()`: Prompts the user for an integer, calls `EvenFactorial`, and prints the result.
    * Time Complexity: O(N)

4.  **program4_odd_factorial.c:**
    * Description: Calculates the factorial of odd numbers up to a given integer. Handles negative input by taking the absolute value.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `OddFactorial(int iNo)`: Calculates the product of odd numbers from 1 up to `iNo`.
        * `main()`: Prompts the user for an integer, calls `OddFactorial`, and prints the result.
    * Time Complexity: O(N)

5.  **program5_factorial_difference.c:**
    * Description: Calculates the difference between the factorial of even numbers and the factorial of odd numbers up to a given integer. Handles negative input by taking the absolute value.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `FactorialDiff(int iNo)`: Calculates the even factorial, the odd factorial, and returns their difference.
        * `main()`: Prompts the user for an integer, calls `FactorialDiff`, and prints the result.
    * Time Complexity: O(N)

6.  **program1_range.c:**
    * Description: Accepts an integer and determines its range, printing "Small" if the number is less than 50, "Medium" if it's between 50 and 100 (exclusive), and "Large" if it's greater than 100.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `Number(int iNo)`: Takes an integer `iNo` and prints its range category.
        * `main()`: The main function prompts the user for an integer and calls the `Number` function.

7.  **program2_digit_to_word.c:**
    * Description: Takes a single-digit integer (0-9) as input and prints the corresponding word for the digit. If the input is not a digit between 0 and 9, it prints "Invalid input!".
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `Display(int iNo)`: Takes an integer `iNo` and prints the word representation (e.g., 0 as "Zero"). Uses a `switch` statement for the digit-to-word mapping.
        * `main()`: Prompts the user to enter a digit and calls the `Display` function.

8.  **program3_factorial.c:**
    * Description: Calculates the factorial of a given integer. It handles negative inputs by calculating the factorial of the absolute value.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `Factorial(int iNo)`: Calculates the factorial of the integer `iNo`.
        * `main()`: Prompts the user for an integer, calls the `Factorial` function, and prints the result.

9.  **program4_multiplication_table.c:**
    * Description: Generates the multiplication table (up to 10) for a given integer. It handles negative inputs by generating the table for the absolute value.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `Table(int iNo)`: Prints the multiplication table of `iNo` from 1 to 10.
        * `main()`: Prompts the user for an integer and calls the `Table` function.

10. **program5_reverse_multiplication_table.c:**
    * Description: Generates the reverse multiplication table (from 10 down to 1) for a given integer. It handles negative inputs by generating the reverse table for the absolute value.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `TableRev(int iNo)`: Prints the reverse multiplication table of `iNo` from 10 down to 1.
        * `main()`: Prompts the user for an integer and calls the `TableRev` function.

## How to Compile and Run

To compile and run these programs, you'll need a C compiler (like GCC). Here's a general guide:

1.  **Save the files:** Ensure all the `.c` files are in the same directory.
2.  **Compile:** Open a terminal or command prompt and use the following commands to compile each program.  Note the slightly different filenames to avoid overwriting:

    ```bash
    gcc program1_pattern.c -o program1_pattern
    gcc program2_currency.c -o program2_currency
    gcc program3_even_factorial.c -o program3_even_factorial
    gcc program4_odd_factorial.c -o program4_odd_factorial
    gcc program5_factorial_difference.c -o program5_factorial_difference
    gcc program1_range.c -o program1_range
    gcc program2_digit_to_word.c -o program2_digit_to_word
    gcc program3_factorial.c -o program3_factorial
    gcc program4_multiplication_table.c -o program4_multiplication_table
    gcc program5_reverse_multiplication_table.c -o program5_reverse_multiplication_table
    ```

    * This will create executable files with corresponding names.

3.  **Run:** Execute the programs by typing (for example):

    ```bash
    ./program1_pattern
    ./program2_currency
    ./program3_even_factorial
    # ... and so on for the other executables
    ```

    The program will then prompt you for input as required.
   
## Under Guidance

**Sir Piyush Khairnar**  
Date: 17/05/2025
---
