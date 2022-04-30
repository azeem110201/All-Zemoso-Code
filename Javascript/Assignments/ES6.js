// refactoring the below code
// const printName = (name) => {
//     return "Hi" + name;
// }

const printName = name => "Hi " + name;

console.log(printName("Azeem"));

// refactoring the below code 
// const printBill = (name, bill) => {
//     return Hi “ + name + “, please pay: “ + bill;
// }

const printBill = (name, bill) => `Hi ${name}, please pay you bill which is ${bill}`;

console.log(printBill("Azeem", 89.99));


// refactoring the below code 
// const person = {
//     name: "Noam Chomsky",
//     age: 92
// }

// let name = person.name;
// let age = person.age;
// console.log(name);
// console.log(age);

const destructure = ({name, age}) =>{
    console.log(name);
    console.log(age);
}

const person = {
    name: "Noam Chomsky",
    age: 92
}

destructure(person);