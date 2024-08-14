(function (){
    let str = 'abcdabaBcdef';
    let newStr = '';
    let temp = 0;

    for(let i = 0; i < str.length; i++){
        if(str.charCodeAt(i) >= 65 && str.charCodeAt(i) <= 90){
            newStr += String.fromCharCode(str.charCodeAt(i)+32);
        }else{
            newStr += str.charAt(i);
        }
    }

    console.log(newStr);

    for(let i = 0; i < newStr.length; i++){
        let count = 0, code = 97;
        for(let j = i; j < newStr.length; j++){
            if(newStr.charCodeAt(j) === code){
                count++;
                code++;
            }else{
                break;
            }
        }
        if(temp < count){
            temp = count;
        }
    }

    console.log('Highest occuracae of sequence is: ', temp);

})();