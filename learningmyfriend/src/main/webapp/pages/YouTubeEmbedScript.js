function youtubeEmbed(name) {
    // name is the path in this instance
    document.getElementById("slideedit").innerHTML +=
            "<div class='youtube'> <iframe src='https://www.youtube.com/embed/"+name+"' frameborder='0' allow='accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture' allowfullscreen></iframe></div>";
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