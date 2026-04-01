import { add } from "./math.js";
import greet from "./greet.js";

let result =
  add(5,3) + "<br>" +
  greet("Jumana") + "<br>" +
  greet("Haseen");

document.getElementById("output").innerHTML = result;