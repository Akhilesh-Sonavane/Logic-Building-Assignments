# Assignment 6 - C Programming Exercises

This folder contains five C programs designed to perform various numerical operations.

## Program Descriptions

1.  **program1.c:**
    * Description: Accepts an integer as input and determines its range, printing "Small" if the number is less than 50, "Medium" if it's between 50 and 100 (exclusive), and "Large" if it's greater than 100.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `Number(int iNo)`:  Takes an integer `iNo` and prints its range category.
        * `main()`:  The main function prompts the user for an integer and calls the `Number` function.

2.  **program2.c:**
    * Description:  Takes a single digit integer (0-9) as input and prints the corresponding word for the digit.  If the input is not a digit between 0 and 9, it prints "Invalid input!".
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `Display(int iNo)`:  Takes an integer `iNo` and prints the word representation (e.g., 0 as "Zero").  Uses a `switch` statement for the digit-to-word mapping.
        * `main()`: Prompts the user to enter a digit and calls the `Display` function.

3.  **program3.c:**
    * Description: Calculates the factorial of a given integer.  It handles negative inputs by calculating the factorial of the absolute value.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `Factorial(int iNo)`:  Calculates the factorial of the integer `iNo`.
        * `main()`:  Prompts the user for an integer, calls the `Factorial` function, and prints the result.

4.  **program4.c:**
    * Description:  Generates the multiplication table (up to 10) for a given integer.  It handles negative inputs by generating the table for the absolute value.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `Table(int iNo)`:  Prints the multiplication table of `iNo` from 1 to 10.
        * `main()`: Prompts the user for an integer and calls the `Table` function.

5.  **program5.c:**
    * Description: Generates the reverse multiplication table (from 10 down to 1) for a given integer.  It handles negative inputs by generating the reverse table for the absolute value.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `TableRev(int iNo)`: Prints the reverse multiplication table of `iNo` from 10 down to 1.
        * `main()`: Prompts the user for an integer and calls the `TableRev` function.

## How to Compile and Run

To compile and run these programs, you'll need a C compiler (like GCC).  Here's a general guide:

1.  **Save the files:** Ensure all the `.c` files are in the same directory.
2.  **Compile:** Open a terminal or command prompt and use the following commands to compile each program:

    ```bash
    gcc program1.c -o program1
    gcc program2.c -o program2
    gcc program3.c -o program3
    gcc program4.c -o program4
    gcc program5.c -o program5
    ```

    * This will create executable files named `program1`, `program2`, `program3`, `program4`, and `program5`.

3.  **Run:** Execute the programs by typing:

    ```bash
    ./program1   # For program1
    ./program2   # For program2
    ./program3   # For program3
    ./program4   # For program4
    ./program5   # For program5
    ```

    The program will then prompt you for input as required.


## Under Guidance

**Sir Piyush Khairnar**  
Date: 17/05/2025
---