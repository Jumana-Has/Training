//  Basic Function
function greet() {
  console.log("Hello!");
}
greet();


//  Function with Parameters
function greetUser(name) {
  console.log("Hello " + name);
}
greetUser("Jumana");


//  Function with Return
function add(a, b) {
  return a + b;
}
let sum = add(10, 5);
console.log("Sum:", sum);


//  Function Expression
const multiply = function(a, b) {
  return a * b;
};
console.log("Multiply:", multiply(4, 5));


//  Arrow Function
const subtract = (a, b) => {
  return a - b;
};
console.log("Subtract:", subtract(10, 3));


// Short Arrow Function
const square = n => n * n;
console.log("Square:", square(6));


//  Default Parameter
function welcome(name = "Guest") {
  console.log("Welcome " + name);
}
welcome();
welcome("Jumana");


//  Function with Condition
function checkAge(age) {
  if (age >= 18) {
    return "Eligible";
  } else {
    return "Not Eligible";
  }
}
console.log("Age Check:", checkAge(22));



// Function Calling Another Function
function double(n) {
  return n * 2;
}
function printDouble(x) {
  console.log("Double:", double(x));
}
printDouble(5);


//  Anonymous Function
setTimeout(function() {
  console.log("This runs after 2 seconds");
}, 2000);


//  Real Example (Calculator)
function calculator(a, b, op) {
  if (op === "+") return a + b;
  if (op === "-") return a - b;
  if (op === "*") return a * b;
  if (op === "/") return a / b;
}
console.log("Calculator:", calculator(10, 5, "*"));