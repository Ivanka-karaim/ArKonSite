const openPopUp = document.querySelectorAll('.open_pop_up');
const popUp = document.getElementById('pop_up');
for(var i=0; i<openPopUp.length; i++) {
    openPopUp[i].addEventListener('click', function (e) {
        e.preventDefault();
        popUp.classList.add('active');

    });
}

function closePop(name){
    const popUp = document.getElementById(name);
    popUp.classList.remove('active');
}
