function addText(name) {
    name = "textBox" + name;
    document.getElementById("slideedit").innerHTML +=
            "<div class='textbox'  id='" + name + "'>" +
                "<div class='textboxheader' id='" + name + "header'></div>" +
                 "<div contenteditable='true'>This is " + name + "</div></div>";
    document.makeDraggable(document.getElementById(name));
}

/* List (Listener to thr add list button) 
document.getElementById('add').addEventListener("click", addList)

function addList(){
  var text = document.getElementById('idea').value;     
  var node = document.createElement("li");    
  var textNode = document.createTextNode(text);    
  node.appendChild(textNode);     
  document.getElementById('list').appendChild(node);
};
*/