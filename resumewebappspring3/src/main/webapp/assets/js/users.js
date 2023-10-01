/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/JavaScript.js to edit this template
 */


function writeWhatIamWritting() {
    var input = document.getElementById("whatIamtyping");
    var text = document.getElementById("typing");

    var inputStr = input.value;
    text.innerHTML = inputStr;
}
function changeColor() {
    var btnsearch = document.getElementById("btnsearch");
    btnsearch.style = "background-color:red";
}
function showHide() {
    var btnsearch = document.getElementById("btnsearch");
    if (btnsearch.visible) {
        btnsearch.visible = false;
        btnsearch.style = "display:none";
    } else {
        btnsearch.visible = true;
        btnsearch.style = "display:inline";
    }
}
function setIdForDelete(id){
    var elem = document.getElementById("idForDelete");
    elem.value = id;
}