var swiper= new Swiper(".swiper", {
    spaceBetween: 20,

    navigation: {
        nextEl: '.swiper-button-next',
        prevEl: '.swiper-button-prev',
    },
    slidesPerView: 2,
    loop:true,
    breakpoints: {
        768:{
            slidesPerView: 4.05,
            spaceBetween: 20,
        },
        576:{
            slidesPerView: 3.05,
            spaceBetween: 15,
        },
        992:{
            slidesPerView: 5.05,
            spaceBetween: 30,
        }

    }
});
lightGallery(document.getElementById("my-gallery"));
