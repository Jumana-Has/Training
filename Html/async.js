// function that returns a Promise
function fetchData() {
  return new Promise((resolve, reject) => {
    setTimeout(() => {
      resolve("Data received successfully");
    }, 2000);
  });
}

// async function
async function getData() {
  try {
    console.log("Fetching data...");

    // wait for the promise to complete
    const result = await fetchData();

    console.log(result);
  } catch (error) {
    console.log("Error:", error);
  }
}

// calling the function
getData();