(function (){
    let str = 'aashish ajmera';
    let reverseStr = '';

    for(let i = str.length; i >= 0; i--){
        reverseStr += str.charAt(i);
    }

    console.log('Reverse string is: ');
})()