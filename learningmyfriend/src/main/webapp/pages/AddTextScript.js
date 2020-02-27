function addText(name) {
    console.log(name);
    document.getElementById("slideedit").innerHTML +=
            "<p contenteditable='true'>" + name + "</p>";
}