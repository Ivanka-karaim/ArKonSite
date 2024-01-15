function results(){
    let form = document.forms.my;
    let width = form.elements.width;
    let height = form.elements.height;
    let depth = form.elements.depth;
    let type=form.elements.type;
    let type_c=form.elements.type_construction;
    let type_door=form.elements.type_door;
    let thickness =form.elements.thickness;
    let furniture = form.elements.furniture;
    var result;

    result=type_construction(type_c.value, type_door.value, furniture.value)+((width.value/1000+depth.value/1000)*height.value/1000*type.value*thickness.value);
    result*=1.5;
    if(result) {
        document.getElementById('result').innerHTML = "Сума: від " + result + " грн";
    }
}
function type_construction(type_c, type_door, furniture){
    if(type_c=='tap' && type_door==3){
        document.getElementById('depth_1').innerHTML = "0 мм";
        document.getElementById('depth').value=0;
        console.log(1225*furniture);
        return 1225*furniture;
    }
    else if(type_c==='tap'){
        console.log(3550*furniture);
        return 3550*furniture;
    }
    else{
        console.log(3905*furniture);

        return 3905*furniture;
    }
}
