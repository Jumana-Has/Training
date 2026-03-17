
var name = "Jumana";
var name = "Haseen"; // re-declare allowed
console.log("var name:", name);


let age = 22;
age = 23; // update allowed
console.log("let age:", age);

// let age = 25;  not allowed (re-declare)

const country = "India";
console.log("const country:", country);

// update not allowed 


// Different Data Types
let text = "Hello";     // string
let num = 100;          // number
let isStudent = true;   // boolean
let empty = null;       // null
let notDefined;         // undefined

console.log("\nData Types:");
console.log(text, num, isStudent, empty, notDefined);


//  Block Scope (let & const)
{
  let a = 10;
  const b = 20;
  console.log("\nInside block:", a, b);
}

// console.log(a); error (block scope)


// var Scope Example
{
  var x = 50;
}
console.log("\nvar scope (outside block):", x); // works


// Real Example
let username = "Jumana";
let password = "786";

console.log("\nLogin Data:");
console.log("Username:", username);
console.log("Password:", password);

