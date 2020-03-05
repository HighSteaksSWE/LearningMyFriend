function togglePresent() {
    var buttonbars = document.getElementsByClassName("buttonbar");
    var i;
    for( i = 0; i < buttonbars.length; i++) {
        buttonbars[i].classList.toggle("hide");
    }
    var textedit = document.getElementsByClassName("textedit");
    var i;
    for( i = 0; i < textedit.length; i++) {
        textedit[i].classList.toggle("hide");
    }
    var slidepanel = document.getElementsByClassName("slidepanel");
    var i;
    for( i = 0; i < slidepanel.length; i++) {
        slidepanel[i].classList.toggle("hide");
    }
    var footer = document.getElementsByClassName("footer");
    var i;
    for( i = 0; i < slidepanel.length; i++) {
        footer[i].classList.toggle("hide");
    }
}
