**Student Progress Tracker Readme**

This Java program is designed to track and evaluate a student's study progress based on the grades and weights of various activities or assignments. It calculates the final grade and provides a message indicating whether the student has met the minimum passing criteria.

Usage
Compile the Code:

To compile the code, make sure you have Java installed on your system. Navigate to the directory containing the App.java file and run the following command in your terminal:

shell
Copy code
javac App.java
Run the Program:

After successfully compiling the code, you can run the program using the following command:

shell
Copy code
java App
Input:

The program will prompt you to enter the number of activities or assignments you want to evaluate. Enter an integer value when prompted.

For each activity, you will be asked to provide the following information:

Activity Name: Enter a descriptive name for the activity.
Activity Weight: Enter the weight or importance of the activity as an integer.
Activity Grade: Enter the grade obtained for the activity as an integer.
The program will calculate the final grade based on the weighted average of all activities.

Output:

If the total weight of activities is not zero, the program will display the final grade as a percentage.

It will then provide one of the following messages based on the final grade:

If the final grade is greater than or equal to 85%, it will display a congratulatory message indicating approval.
If the final grade is below 85%, it will display a message indicating that the student did not meet the minimum passing criteria.
Termination:

The program will automatically close once it has provided the output. There is no need to manually terminate it.

Example
Here is an example of how to use the program:

yaml
Copy code
Digite a quantidade de atividades para cadastrar: 3
Digite o nome da atividade 1: Homework 1
Digite o peso da atividade 1: 20
Digite a nota obtida para Homework 1: 90
Digite o nome da atividade 2: Midterm Exam
Digite o peso da atividade 2: 40
Digite a nota obtida para Midterm Exam: 75
Digite o nome da atividade 3: Final Exam
Digite o peso da atividade 3: 40
Digite a nota obtida para Final Exam: 88

Parabéns! Você alcançou 85.25%! E temos o prazer de informar que você obteve aprovação!
Contributing
If you would like to contribute to this project or report issues, please feel free to submit a pull request or open an issue on the GitHub repository.

License
This program is open-source and available under the MIT License. You are free to use, modify, and distribute it as per the terms of the license.
