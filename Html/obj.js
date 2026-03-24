// 1. Create Object
let person = {
  name: "Jumana",
  age: 22,
  city: "Chennai"
};

console.log("Initial:", person);

// 2. Access
console.log("Name:", person.name);
console.log("Age:", person["age"]);

// 3. Add / Update
person.age = 21;          // update
person.country = "India"; // add
console.log("After Update:", person);

// 4. Delete
delete person.city;
console.log("After Delete:", person);

// 5. Object Method
person.greet = function() {
  console.log("Hello " + this.name);
};
person.greet();

// 6. Loop
console.log("Loop:");
for (let key in person) {
  console.log(key, person[key]);
}

// 7. Object Built-in Methods
console.log("Keys:", Object.keys(person));
console.log("Values:", Object.values(person));
console.log("Entries:", Object.entries(person));

// 8. Nested Object
let student = {
  name: "Jumana",
  marks: {
    math: 90,
    science: 85
  }
};

console.log("Math Mark:", student.marks.math);

// 9. Array of Objects
let users = [
  person,
  { name: "Haseen", age: 22 }
];

users.forEach(u => console.log("User:", u.name));

// 10. Destructuring
let { name, age } = person;
console.log("Destructured:", name, age);

// 11. Spread Operator
let newPerson = { ...person, gender: "female" };
console.log("New Object:", newPerson);