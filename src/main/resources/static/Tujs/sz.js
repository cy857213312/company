function addOne()
{
    var showControl = document.getElementById("txtNumber");
    showControl.value = parseInt(showControl.value) + 1;
}
function removeOne()
{
    var showControl = document.getElementById("txtNumber");
    showControl.value = parseInt(showControl.value) - 1;
}