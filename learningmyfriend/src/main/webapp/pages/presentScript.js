function togglePresent() {
    var slide = document.getElementById("slideedit");
    var slideContents = slide.innerHTML;

    var params = [
        'height=' + 800,
        'width=' + 1100,
        'fullscreen=yes' // only works in IE, but here for completeness
    ].join(',');

    var printWindow = window.open('', '', params);
    printWindow.document.write('<html><head><title>PDF SAVE</title>');

    printWindow.document.write('<link rel="stylesheet" type="text/css" href="index.css" />');
    printWindow.document.write('</head><body >');
    printWindow.document.write('<div id="slideedit">');
    printWindow.document.write(slideContents);
    printWindow.document.write('</div>');
    printWindow.document.write('</body></html>');
    printWindow.document.close();
}
