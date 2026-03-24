//  Create Array
let arr = [10, 20, 30, 40];
console.log("Initial:", arr);

//  Access
console.log("First:", arr[0]);
console.log("Third:", arr[2]);

//  Add Elements
arr.push(50);     // end
arr.unshift(5);   // beginning
console.log("After Add:", arr);

// Remove Elements
arr.pop();       // remove last
arr.shift();     // remove first
console.log("After Remove:", arr);

// Loop
console.log("For loop:");
for (let i = 0; i < arr.length; i++) {
  console.log(arr[i]);
}

console.log("forEach:");
arr.forEach(item => console.log(item));

// Map, Filter, Find
let nums = [1, 2, 3, 4];

let doubled = nums.map(n => n * 2);
let even = nums.filter(n => n % 2 === 0);
let found = nums.find(n => n > 2);

console.log("Doubled:", doubled);
console.log("Even:", even);
console.log("Found:", found);

//  Sort
let numbers = [5, 2, 9, 1];
numbers.sort((a, b) => a - b);
console.log("Sorted:", numbers);

//  Spread
let a = [1, 2];
let b = [3, 4];
let combined = [...a, ...b];
console.log("Combined:", combined);

//  Destructuring
let [first, second] = arr;
console.log("Destructured:", first, second);

//  Final Example
let fruits = ["apple", "banana"];
fruits.push("orange");

fruits.forEach(f => console.log("Fruit:", f));

let result = fruits.filter(f => f.includes("a"));
console.log("Filtered Fruits:", result);