async function getData(uId) {
    let myPromise = new Promise((resolve)=> {
        setTimeout(() => {
            console.log("Fetched the data!");
            resolve("skc@gmail.com");
        }, 4000);
    })
    return myPromise;
}

async function myFunction(uid){
    let myPromise = await getData(uid);
    console.log("Email id of the user id is: " + myPromise);
}


console.log("start");
myFunction("skc");
console.log("end");