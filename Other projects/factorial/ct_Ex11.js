
function factorial_A() {

    var outputObj = document.getElementById("output");
    var a = parseInt(prompt("Please enter a number: ", ""));
    outputObj.innerHTML = "number: " + a + "<br><br>" + a + "! = "; 
    var factorial = 1;
    for (i = 1; i <= a; i++) {
        factorial = factorial * i;
    }
    outputObj.innerHTML = outputObj.innerHTML + factorial + " (A)";
    factorial_B(a); 
    outputObj.innerHTML = outputObj.innerHTML + "<br><br>" + "program ended";
    document.getElementsByTagName("button")[0].setAttribute("disabled","true");
}

function factorial_B (num) {
    
    var outputObj = document.getElementById("output");
    var factorial = 1
    var i = 1;
    while (i<= num) {
        factorial = factorial * i;
        i = i + 1;
    }
    outputObj.innerHTML = "<br>" + num + "! = " + factorial + " (B)";
    
}
