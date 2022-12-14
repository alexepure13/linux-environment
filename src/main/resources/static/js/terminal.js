let input = document.querySelector("input");
let terminalBody = document.querySelector("#terminalBody");

let commandList = [
  "help",
  "ls",
  "ps",
  "name",
  "echo",
  "date",
  "pwd",
  "hostname",
  "about",
];

functionCalls();

function functionCalls() {
  checkWindowClick();
  checkPressedEnter();
}

function checkWindowClick() {
  terminalBody.addEventListener("click", function (event) {
    input.focus();
  });
}

function checkPressedEnter() {
  input.addEventListener("keydown", function (e) {
    if (e.key === "Enter") {
      execute(input.value);
    }
  });
}

function execute(inputValue) {
  let temp = input.value;
  input.remove();
  terminalBody.innerHTML += temp;
  checkCommand(temp);
  addInput();
}

function executeCommand(command) {
  terminalBody.innerHTML += "<br>";

  for (let i = 0; i < data[command].length; ++i) {
    if (data[command][i].value.includes("http")) {
      terminalBody.innerHTML += `<a href="${data[command][i].value}" target="_blank">${data[command][i].value}</a><br>`;
    } else {
      terminalBody.innerHTML += `${data[command][i].value}<br>`;
    }
  }
}

function checkCommand(inputCommand) {
  let command = inputCommand.split(" ")[0];

  if (command) {
    if (command === "clear") {
      commandClear();
    } else if (command === "echo") {
      commandEcho(inputCommand);
    } else if (command === "help") {
      commandHelp();
    } else if (command === "date") {
      commandDate();
    } else if (commandList.includes(command)) {
      executeCommand(command);
    } else {
      terminalBody.innerHTML +=
        "<br>" +
        inputCommand +
        ' nu este o comandă cunoscută, tasteză "help"<br>';
    }
  } else {
    terminalBody.innerHTML += "<br>";
  }
}

function addInput() {
  terminalBody.innerHTML += ' $ <input type="text" autofocus />';
  input = document.querySelector("input");
  input.focus();
  functionCalls();
}

function commandClear() {
  terminalBody.innerHTML = ``;
}

function commandHelp() {
  terminalBody.innerHTML += "<br>";
  for (let i = 0; i < commandList.length; i++) {
    terminalBody.innerHTML += `${commandList[i]}<br>`;
  }
}

function commandEcho(inputCommand) {
  terminalBody.innerHTML += "<br>";
  for (let i = 1; i < inputCommand.split(" ").length; i++) {
    terminalBody.innerHTML += inputCommand.split(" ")[i] + " ";
  }
  terminalBody.innerHTML += "<br>";
}

function commandDate(inputCommand) {
  var today = new Date();
  var date =
    today.getFullYear() + "-" + (today.getMonth() + 1) + "-" + today.getDate();
  var time =
    today.getHours() + ":" + today.getMinutes() + ":" + today.getSeconds();
  var dateTime = date + " " + time;

  terminalBody.innerHTML += "<br>";
  terminalBody.innerHTML += dateTime;
  terminalBody.innerHTML += "<br>";

}

function commandLS(inputCommand) {
  terminalBody.innerHTML += "<br>";
}

function loadAtStart(){
  var options = { weekday: 'long', year: 'numeric', month: 'long', day: 'numeric' };
  var today = new Date();
  var date = today.toLocaleDateString("ro-RO", options);
  document.getElementById("data-t").innerHTML = date;
}