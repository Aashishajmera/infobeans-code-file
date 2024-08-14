(function (){
    let s = 'abc123jkl229xyz999';
     
    let word = '';

    for(let i = 0; i < s.length; i++){
        if(s.charAt(i) >= 47 && s.charAt(i) < 58){
            word += s.charAt(i);
            console.log('kk');
        }
    }
    console.log(word);
})();