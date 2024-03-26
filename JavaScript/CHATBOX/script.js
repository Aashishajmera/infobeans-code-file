function sendMessage() {
    var userInput = document.getElementById("user-input").value;
    if (userInput.trim() === "") return;

    displayUserMessage(userInput);

    // Here you can add code to send the user message to a server for processing by a doctor.
    // For simplicity, we're just showing a predefined response from the doctor for each question.
    var doctorResponse = generateDoctorResponse(userInput);
    displayDoctorMessage(doctorResponse);

    document.getElementById("user-input").value = "";
}

function askQuestion(question) {
    displayUserMessage(question);
    var doctorResponse = generateDoctorResponse(question);
    displayDoctorMessage(doctorResponse);
}

function displayUserMessage(message) {
    var chatBox = document.getElementById("chat-box");
    var userMessage = document.createElement("p");
    userMessage.innerHTML = "<strong>You:</strong> " + message;
    chatBox.appendChild(userMessage);
}

function displayDoctorMessage(message) {
    var chatBox = document.getElementById("chat-box");
    var doctorMessage = document.createElement("p");
    doctorMessage.innerHTML = "<strong>Doctor:</strong> " + message;
    chatBox.appendChild(doctorMessage);
}

function generateDoctorResponse(question) {
    // Replace this with actual logic to generate responses based on user questions
    // For simplicity, let's just echo back the question for now.
    return "You asked: " + question;
}
