/**
 * Program: Destructuring in JavaScript
 * This program demonstrates array and object destructuring,
 * default values, renaming, and nested destructuring.
 */

// 1. Array Destructuring
const numbers = [10, 20, 30];

// Extract values into variables
const [a, b, c] = numbers;

console.log("Array values:", a, b, c);

// 2. Object Destructuring
const person = {
  name: "Jumana",
  age: 20
};

// Extract properties
const { name, age } = person;

console.log("Object values:", name, age);

// 3. Renaming Variables
const { name: userName, age: userAge } = person;

console.log("Renamed:", userName, userAge);

// 4. Default Values
const student = { name: "Jumana" };

// If age not present, default is used
const { name: sName, age: sAge = 18 } = student;

console.log("Default value:", sName, sAge);

// 5. Nested Destructuring
const user = {
  name: "Jumana",
  address: {
    city: "Chennai"
  }
};

// Extract nested value
const { address: { city } } = user;

console.log("City:", city);

// 6. Destructuring in Function Parameters
const greet = ({ name }) => {
  console.log(`Hello ${name}`);
};
greet(person);