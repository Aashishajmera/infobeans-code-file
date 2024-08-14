(function (){
    let str = 'aash3ish901';
    let count = 0;
    let digit = ''
    for(let i = 0; i < str.length; i++){
        if(str.charAt(i) >= 48 || str.charAt(i) <= 57){
                digit += str.charAt(i);
        }
    }
    console.log('Total digit is: '+digit);
})();