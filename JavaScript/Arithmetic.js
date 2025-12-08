const prompt = require('prompt-sync')();

console.log("Solve this subtraction equation")    

let count = 0 

for(let counter = 1; counter <= 10; counter++){
let subtraction;
let firstDigit = parseInt(Math.random(81,180)*10)
let secondDigit = parseInt(Math.random(1,80)*10)

if (secondDigit > firstDigit){
subtraction = secondDigit - firstDigit
 console.log(secondDigit, "-", firstDigit)  
}else{
subtraction = firstDigit - secondDigit
 console.log(firstDigit, "-", secondDigit)
}


let answer = prompt("Enter answer: ")
if(answer == subtraction){
console.log("you are correct")
count += 1
}else{
console.log("incorrect")
answer = prompt("Enter answer: ")
}

}


if(count > 5){
console.log("Your final score is: ", count, "Superb!!!")
}else{
console.log("Your final score is: ", count, "poor!!!,you can do better")
}




