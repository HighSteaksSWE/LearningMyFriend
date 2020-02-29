function addText(name) {
    name = "textBox" + name;
    document.getElementById("slideedit").innerHTML +=
            "<p class='textbox' contenteditable='true' id='" + name + "'>This is " + name + "</p>";
}