// Function to fetch data from API
async function getPosts() {
  try {
    console.log("Fetching data...");

    // Fetch data from API
    const response = await fetch("https://jsonplaceholder.typicode.com/posts");

    // Convert response to JSON
    const data = await response.json();

    // Display data
    console.log(data);

  } catch (error) {
    console.log("Error fetching data:", error);
  }
}

// Call the function
getPosts();