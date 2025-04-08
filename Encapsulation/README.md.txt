# Encapsulation in Java – Restaurant Example

## 📌 Problem Statement

Design a `Restaurant` class in Java with private attributes `id`, `name`, `email`, `phone`, and `address`.  
Implement a constructor to initialize these attributes and provide getter methods to retrieve their values.  
Write a program that takes user input as a comma-separated string, initializes a `Restaurant` object using the constructor, and then displays the restaurant's details using the getter methods.

## 🔽 Input Format

The input consists of a single line:

A comma-separated string with the following values in this order:
- An integer representing the `id`
- A string representing the `name`
- A string representing the `email`
- A long integer representing the `phone`
- A string representing the `address`

## 🔼 Output Format

The output should display the restaurant's information in the following order:

id  
name  
email  
phone  
address

## 📝 Sample Input

1,Donne Biryani,donnebiryani@gmail.com,6677889955,Btm layout Bengaluru

## ✅ Sample Output

1  
Donne Biryani  
donnebiryani@gmail.com  
6677889955  
Btm layout Bengaluru

## ✅ Do's Checklist

- Create the class: Define a class named `Restaurant`.
- Declare private attributes: Inside the class, declare private attributes: `id`, `name`, `email`, `phone`, and `address`.
- Create a constructor: Implement a constructor that initializes the private attributes with the values provided by the user.
- Implement getter methods: Create public getter methods to retrieve the values of the private attributes.
- Take user input: Use a comma-separated string as input, split it, and initialize the attributes using the constructor.
- Display output: Use the getter methods to display the restaurant information in the specified format.

## 📂 Folder File Info

encapsulation/  
├── Encapsulation.java   # Java code using encapsulation  
├── README.md            # Problem statement and explanation  
└── output.txt           # Sample output based on sample input

Feel free to explore and modify the input to test different scenarios!
