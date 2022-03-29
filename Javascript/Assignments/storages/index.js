function attachEventListenerLocal(){
    document.getElementById("local").addEventListener("click", () => {
        localCount = Number(localStorage.getItem("local"));

        if(localCount === null){
            localCount = 0;
            localStorage.setItem('local', localCount);
            document.getElementById("localValue").innerHTML = `Local storage count is: ${localStorage.getItem("local")}`;
        }
        else{
            localCount += 1;
            localStorage.setItem('local', localCount);
            document.getElementById("localValue").innerHTML = `Local storage count is: ${localStorage.getItem("local")}`;
        }
    });
}

function attachEventListenerSession(){
    document.getElementById("session").addEventListener("click", () => {
        sessionCount = Number(sessionStorage.getItem("session"));

        if(sessionCount === null){
            sessionCount = 0;
            sessionStorage.setItem('session', sessionCount);
            document.getElementById("sessionValue").innerHTML = `Session storage count is: ${sessionStorage.getItem("session")}`;
        }
        else{
            sessionCount += 1;
            sessionStorage.setItem('session', sessionCount);
            document.getElementById("sessionValue").innerHTML = `Session storage count is: ${sessionStorage.getItem("session")}`;
        }
    });
}


attachEventListenerLocal();
attachEventListenerSession();