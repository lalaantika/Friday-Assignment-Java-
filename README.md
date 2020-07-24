# Friday-Assignment-Java-
All Answers are under src/com/company


Ans 1:- Main.java 
Ans 2: Date.java 
Ans 3: SavingsAccount.java
Ans 4: Book.java 


Questiona

1. Create a class called Employee that includes three pieces of information as instance variables—a first name (typeString), 
a last name (typeString) and a monthly salary (double). Your class should have a constructor that initializes the three instance variables.
Provide a set and a get method for each instance variable. If the monthly salary is not positive, set it to 0.0. 
Write a test application named EmployeeTest that demonstrates class Employee’s capabilities. 
Create two Employee objects and display each object’s yearly salary. 
Then give each Employee a 10% raise and display each Employee’s yearly salary again.

2. 
Create a class called Date that includes three pieces of information as instance variables—a month (typeint), a day (typeint) and a year (typeint).
Your class should have a constructor that initializes the three instance variables and assumes that the values provided are correct. 
Provide a set and a get method for each instance variable. 
Provide a method displayDate that displays the month, day and year separated by forward slashes(/). 
Write a test application named DateTest that demonstrates classDate’s capabilities.

3.
Create class SavingsAccount. Usea static variable annualInterestRate to store the annual interest rate for all account holders. 
Each object of the class contains a private instance variable savingsBalance indicating the amount the saver currently has ondeposit. 
Provide method calculateMonthlyInterest to calculate the monthly interest by multiplying the savingsBalance by annualInterestRate divided 
by 12 this interest should be added to savingsBalance. Provide a static method modifyInterestRate that sets the annualInterestRate to a new value. 
Write a program to test class SavingsAccount. 
Instantiate two savingsAccount objects, saver1 and saver2, with balances of $2000.00 and $3000.00, respectively.
Set annualInterestRate to 4%, then calculate the monthly interest and print the new balances for both savers.
Then set the annualInterestRate to 5%, calculate the next month’s interest and print the new balances for both savers.

4. 
Create a class called Book to represent a book. A Book should include four pieces of information as instance variables‐a book name, 
an ISBN number, an author name and a publisher. Your class should have a constructor that initializes the four instance variables. 
Provide a getter and a setter for each instance variable. Inaddition, provide a method named getBookInfo that returns the description 
of the book as a String (the description should include all the information about the book). You should use this keyword in member 
methods and constructor. Write a test application named BookTest to create an array of object for 30 elements for class 
Book to demonstrate the class Book's capabilities.