function toPDF() {
    var slide = document.getElementById("slideedit");
    var slideContents = slide.innerHTML;

    var params = [
        'height=' + 850,
        'width=' + 1100
    ].join(',');

    var printWindow = window.open('', '', params);
    printWindow.document.write('<html><head><title>DIV Contents</title>');
    printWindow.document.write('<link rel="stylesheet" type="text/css" href="index.css" />');
    printWindow.document.write('</head><body >');
    printWindow.document.write('<div id="slideedit">');
    printWindow.document.write(slideContents);
    printWindow.document.write('</div>');
    printWindow.document.write('</body></html>');
    printWindow.document.close();
    printWindow.setTimeout(function(){printWindow.print(); printWindow.close();;}, 2000);
    
}