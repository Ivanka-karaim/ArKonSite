var modal = document.getElementById("modal");
var img = document.getElementById("myImg");
var modalImg = document.getElementById("img01");
var close = document.getElementById("close");
img.onclick = function(){
    modal.style.display = "block";
    modalImg.src = this.src;
}
close.onclick=function(){
    modal.style.display="none";
}
