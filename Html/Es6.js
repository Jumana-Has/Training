// ES6+ Combined Example Program

// 1. let & const
const appName = "ES6 Demo";
let version = 1;

// 2. Class
class Person {
  constructor(name, age) {
    this.name = name;
    this.age = age;
  }

  // Method using template literal
  greet() {
    console.log(`Hello, my name is ${this.name}`);
  }
}

// 3. Arrow Function + Default Parameter
const add = (a = 0, b = 0) => a + b;

// 4. Rest Operator
const sumAll = (...nums) => nums.reduce((total, n) => total + n, 0);


// 5. Spread Operator
const arr1 = [1, 2];
const arr2 = [...arr1, 3, 4];

// 6. Destructuring
const personObj = { name: "Jumana", age: 20 };
const { name, age } = personObj;

// 7. Arrow Function with Array Methods
const numbers = [1, 2, 3];
const doubled = numbers.map(n => n * 2);

// 8. Promise
const fetchData = () => {
  return new Promise((resolve) => {
    setTimeout(() => resolve("Data received"), 1000);
  });
};

// 9. Async / Await
const getData = async () => {
  const data = await fetchData();
  console.log(data);
};

// 10. Using everything
console.log(appName, version);

const p1 = new Person(name, age);
p1.greet();

console.log("Add:", add(5, 3));
console.log("Sum All:", sumAll(1, 2, 3, 4));
console.log("Array:", arr2);
console.log("Doubled:", doubled);

// Call async function
getData();