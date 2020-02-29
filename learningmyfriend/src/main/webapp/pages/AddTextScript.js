function addText(name) {
    name = "textBox" + name;
    document.getElementById("slideedit").innerHTML +=
            "<div class='textbox'  id='" + name + "'>" +
                "<div class='textboxheader' id='" + name + "header'></div>" +
                 "<div contenteditable='true'>This is " + name + "</div></div>";
    document.makeDraggable(document.getElementById(name));
}