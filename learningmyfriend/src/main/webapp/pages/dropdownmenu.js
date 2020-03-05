function myFunction(id) {
    var e = document.getElementById(id);
    closeAll(e);
    document.getElementById(id).classList.toggle("show");
    console.log(document.getElementById(id));
}

// Close the dropdown menu if the user clicks outside of it
function closeAll(e) {
    var dropdowns = document.getElementsByClassName("show");
    var i;
    for (i = 0; i < dropdowns.length; i++) {
        var openDropdown = dropdowns[i];
        if (e !== openDropdown) {
            openDropdown.classList.remove('show');
        }
    }
}

