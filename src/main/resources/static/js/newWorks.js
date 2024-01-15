var classes = document.getElementsByClassName("general_photo");
for(i=0; i<classes.length; i++) {
    lightGallery(classes[i]);

}

$(document).ready(function(){
    var inProcess = false;
    var num = 4;
    const more = document.getElementById('more');
    more.addEventListener('click', function (e) {
        $.ajax({
            url: './our_works/'+num,
            method: 'GET',
            beforeSend: function () {

            },
            success: function (response) {
                if(!response && !inProcess){
                    $('#logar').append("<p style='text-align:center; font-size: 20px; color: #1E7DB2; '><b>Немає більше товарів</p>");

                    inProcess = true;
                }
                else {
                    $('#logar').append(response);

                }
            }
        }).done(function (data) {
            num += 4;
            classe=document.getElementsByClassName("general_photo");
            for(i=0; i<classe.length; i++) {
                lightGallery(classe[i]);
            }
        });

    })

});
