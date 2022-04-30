const { faker } = require('@faker-js/faker');

const fullName = (firstName, lastName) => {
    return firstName.charAt(0) + " " + lastName.charAt(0);
}

for(let i = 0; i < 5; i++){
    let firstName = faker.name.firstName();
    let lastName = faker.name.lastName();

    console.log(fullName(firstName, lastName));
}