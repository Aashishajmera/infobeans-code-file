(function (){
    let str = 'Aashish1234567 A890jmera';
    let findNum = '', count = 0;

    for(let i = 0; i < str.length; i++){
        if(str.charCodeAt(i) >= 48 && str.charCodeAt(i) <= 57){
            findNum += str.charAt(i);
            count++;
        }
    }

    console.log('Total digit is: ', count ,' and digit is: ', findNum);
})();