(function (){
    let str = 'Aashish AjmeraAamla';
    let newStr = '';

    for(let i = 0; i < str.length; i++){
        if(str.charCodeAt(i) >= 65 && str.charCodeAt(i) <= 90){
            newStr += str.charAt(i);
        }
    }
    console.log(newStr);
})();