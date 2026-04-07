// Function that returns a Promise
function fetchUserData() {

  return new Promise((resolve, reject) => {

    console.log("Fetching user data...");

    // simulate server delay
    setTimeout(() => {

      let success = true;

      if (success) {
        let user = {
          id: 1,
          name: "Jumana",
          role: "Junior Application Engineer"
        };

        resolve(user);   // promise fulfilled
      } 
      else {
        reject("Error: Unable to fetch data"); // promise rejected
      }

    }, 2000);

  });

}

// Calling the function
fetchUserData()

.then((user) => {
  console.log("User Data Received:");
  console.log("ID:", user.id);
  console.log("Name:", user.name);
  console.log("Role:", user.role);
})

.catch((error) => {
  console.log(error);
})

.finally(() => {
  console.log("Operation Finished");
});