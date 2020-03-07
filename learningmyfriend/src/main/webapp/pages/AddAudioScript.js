function addAudio(name) {
    // name is the path in this instance
    let soundtype = name.substring(name.lastIndexOf('.') + 1);
    if (soundtype=="mid") { soundtype = "midi"; }
    document.getElementById("slideedit").innerHTML +=
            "<audio controls>\n\
                <source src='"+name+"' type='audio/"+soundtype+"'>\n\
                Audio File\n\
            </audio>";
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