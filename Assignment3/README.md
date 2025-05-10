# Assignment3

## Description
This repository contains five C programs developed as part of Assignment 3. Each program performs a specific task, such as processing integers, characters, or checking conditions,  following all Inddustrial Coding Conventions as described below.

## Programs

1. **program1.c**  
   - **Description**: Accepts an integer input and prints the first `n` even numbers, where `n` is the input number.  
   - **Example**: Input `5` outputs `2 4 6 8 10`.

2. **program2.c**  
   - **Description**: Accepts an integer and prints its even factors (numbers that divide the input evenly and are even themselves).  
   - **Example**: Input `12` outputs `2 4 6 12`.

3. **program3.c**  
   - **Description**: Similar to `program2.c`, it accepts an integer and prints its even factors.  
   - **Note**: This program is functionally similar to `program2.c` but starts the factor check from 2.  
   - **Example**: Input `12` outputs `2 4 6 12`.

4. **program4.c**  
   - **Description**: Accepts a single character and converts it to the opposite case (lowercase to uppercase or vice versa).  
   - **Example**: Input `a` outputs `A`; input `Z` outputs `z`.

5. **program5.c**  
   - **Description**: Accepts a single character and checks if it is a vowel (a, e, i, o, u, or their uppercase equivalents). Returns `TRUE` or `FALSE` and prints the result.  
   - **Example**: Input `e` outputs `The Entered character e is a Vowel(TRUE)`.

## Installation
To run these programs, you need a C compiler (e.g., GCC) installed on your system. Follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/Assignment3.git
   ```
2. Navigate to the project directory:
   ```bash
   cd Assignment3
   ```
3. Compile a program (e.g., `program1.c`):
   ```bash
   gcc program1.c -o program1
   ```
4. Run the compiled program:
   ```bash
   ./program1
   ```

Repeat the compilation and execution steps for each program (`program2.c`, `program3.c`, `program4.c`, `program5.c`).

## Usage
Each program prompts the user for input via the console:
- For `program1.c`, `program2.c`, and `program3.c`, enter an integer.
- For `program4.c` and `program5.c`, enter a single character.
- The output is displayed on the console based on the program's logic.

Example:
```bash
$ gcc program1.c -o program1
$ ./program1
Enter Number
5
2       4       6       8       10
```

## Requirements
- A C compiler (e.g., GCC, Clang).
- Standard C libraries (`stdio.h`).

## Under Guidance

- **Name**: Sir Piyush Khairnar
- **Date**: 10/05/2025
