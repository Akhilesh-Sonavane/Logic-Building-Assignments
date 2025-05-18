# Assignment 9 - C Programming Exercises

This folder contains a collection of C programs covering various numerical operations, pattern generation, and digit manipulation.

**Important Note:** There are multiple files with identical names (e.g., `program1.c`, `program2.c`, etc.). To avoid confusion and compilation errors due to overwriting, each file will be referred to with a descriptive suffix in this `readme.md`.  Please use these distinct names when compiling.

## Program Descriptions

**Part 1:  Basic Input/Output and Logic**

1.  **program1_number_range.c:**
    * Description: Accepts an integer and categorizes it as "Small" (less than 50), "Medium" (between 50 and 100, exclusive), or "Large" (greater than 100).
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `Number(int iNo)`: Determines and prints the range category.
        * `main()`:  Gets integer input and calls `Number()`.

2.  **program2_digit_to_word.c:**
    * Description:  Accepts a single-digit integer (0-9) and prints its English word representation.  Prints "Invalid input!" for other inputs.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `Display(int iNo)`: Prints the word corresponding to the digit.
        * `main()`:  Gets digit input and calls `Display()`.

3.  **program3_factorial.c:**
    * Description: Calculates the factorial of a given integer.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `Factorial(int iNo)`:  Calculates the factorial.
        * `main()`: Gets integer input and prints the factorial.

4.  **program4_multiplication_table.c:**
    * Description:  Prints the multiplication table (1 to 10) of a given integer.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `Table(int iNo)`: Prints the multiplication table.
        * `main()`: Gets integer input and calls `Table()`.

5.  **program5_reverse_multiplication_table.c:**
    * Description: Prints the multiplication table of a given integer in reverse order (10 to 1).
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `TableRev(int iNo)`: Prints the reverse multiplication table.
        * `main()`: Gets integer input and calls `TableRev()`.

**Part 2: Pattern and Number Conversions**

6.  **program1_pattern.c:**
    * Description: Accepts an integer and prints a pattern of asterisks (`*`) and hash symbols (`#`) based on the input value.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `Display(int iNo)`: Prints the asterisk and hash pattern.
        * `main()`: Gets integer input and calls `Display()`.
    * Time Complexity: O(2N)

7.  **program2_dollar_to_inr.c:**
    * Description: Converts a given amount from US dollars (USD) to Indian Rupees (INR), using a fixed conversion rate of 70 INR per 1 USD.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `DollarToINR(int iNo)`: Performs the USD to INR conversion.
        * `main()`:  Gets USD amount and prints the equivalent in INR.

8.  **program3_even_factorial.c:**
    * Description: Calculates the factorial of even numbers up to a given integer.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `EvenFactorial(int iNo)`: Calculates the product of even numbers.
        * `main()`: Gets integer input and prints the even factorial.
    * Time Complexity: O(N)

9.  **program4_odd_factorial.c:**
    * Description: Calculates the factorial of odd numbers up to a given integer.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `OddFactorial(int iNo)`: Calculates the product of odd numbers.
        * `main()`: Gets integer input and prints the odd factorial.
    * Time Complexity: O(N)

10. **program5_factorial_difference.c:**
    * Description: Calculates the difference between the factorial of even numbers and the factorial of odd numbers up to a given integer.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `FactorialDiff(int iNo)`: Calculates the difference between even and odd factorials.
        * `main()`: Gets integer input and prints the difference.

**Part 3:  Geometric Calculations and Conversions**

11. **program1_circle_area.c:**
    * Description: Calculates the area of a circle given its radius.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `CircleArea(float fRadius)`: Calculates the circle's area.
        * `main()`: Gets the radius and prints the area.

12. **program2_rectangle_area.c:**
    * Description: Calculates the area of a rectangle given its width and height.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `RectArea(float fWidth, float fHeight)`: Calculates the rectangle's area.
        * `main()`: Gets width and height and prints the area.

13. **program3_km_to_meter.c:**
    * Description: Converts a distance from kilometers (km) to meters.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `KMtoMeter(int iNo)`: Performs the kilometer to meter conversion.
        * `main()`: Gets distance in km and prints the equivalent in meters.

14. **program4_fahrenheit_to_celsius.c:**
    * Description: Converts a temperature from Fahrenheit to Celsius.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `FhtoCs(float fTemp)`: Performs the Fahrenheit to Celsius conversion.
        * `main()`: Gets temperature in Fahrenheit and prints the Celsius equivalent.

15. **program5_sqfeet_to_sqmeter.c:**
    * Description: Converts an area from square feet to square meters.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `SquareMeter(int iValue)`: Performs the square feet to square meters conversion.
        * `main()`: Gets area in square feet and prints the equivalent in square meters.

**Part 4:  Digit Manipulation**

16. **program1_reverse_digits.c:**
    * Description: Accepts an integer and prints its digits in reverse order.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `DisplayDigit(int iNo)`: Prints the digits in reverse.
        * `main()`: Gets integer input and calls `DisplayDigit()`.

17. **program2_check_zero.c:**
    * Description: Checks whether a given integer contains the digit 0.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `ChkZero(int iNo)`: Checks for the presence of 0.
        * `main()`: Gets integer input and prints whether it contains 0 or not.

18. **program3_count_twos.c:**
    * Description: Counts the number of times the digit 2 appears in a given integer.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `CountTwo(int iNo)`: Counts the occurrences of the digit 2.
        * `main()`: Gets integer input and prints the count of 2s.

19. **program4_count_fours.c:**
    * Description: Counts the number of times the digit 4 appears in a given integer.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `CountFour(int iNo)`: Counts the occurrences of the digit 4.
        * `main()`: Gets integer input and prints the count of 4s.

20. **program5_count_less_than_six.c:**
    * Description: Counts the number of digits in a given integer that are less than 6.
    * Author: Akhilesh.P.Sonavane
    * Date: 17/05/2025
    * Functions:
        * `Count(int iNo)`: Counts digits less than 6.
        * `main()`: Gets integer input and prints the count.

## How to Compile and Run

To compile and run these programs, you'll need a C compiler (like GCC).

1.  **Save the files:** Ensure all the `.c` files are in the same directory.
2.  **Compile:** Open a terminal or command prompt and compile each program using the descriptive filenames from the "Program Descriptions" section:

    ```bash
    gcc program1_number_range.c -o program1_number_range
    gcc program2_digit_to_word.c -o program2_digit_to_word
    gcc program3_factorial.c -o program3_factorial
    gcc program4_multiplication_table.c -o program4_multiplication_table
    gcc program5_reverse_multiplication_table.c -o program5_reverse_multiplication_table
    gcc program1_pattern.c -o program1_pattern
    gcc program2_dollar_to_inr.c -o program2_dollar_to_inr
    gcc program3_even_factorial.c -o program3_even_factorial
    gcc program4_odd_factorial.c -o program4_odd_factorial
    gcc program5_factorial_difference.c -o program5_factorial_difference
    gcc program1_circle_area.c -o program1_circle_area
    gcc program2_rectangle_area.c -o program2_rectangle_area
    gcc program3_km_to_meter.c -o program3_km_to_meter
    gcc program4_fahrenheit_to_celsius.c -o program4_fahrenheit_to_celsius
    gcc program5_sqfeet_to_sqmeter.c -o program5_sqfeet_to_sqmeter
    gcc program1_reverse_digits.c -o program1_reverse_digits
    gcc program2_check_zero.c -o program2_check_zero
    gcc program3_count_twos.c -o program3_count_twos
    gcc program4_count_fours.c -o program4_count_fours
    gcc program5_count_less_than_six.c -o program5_count_less_than_six
    ```

3.  **Run:** Execute the compiled programs using the corresponding executable names:

    ```bash
    ./program1_number_range
    ./program2_digit_to_word
    ./program3_factorial
    # ... and so on for all the compiled executables
    ```
## Under Guidance

**Sir Piyush Khairnar**  
Date: 17/05/2025
---

