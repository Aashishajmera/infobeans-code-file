(function (){
    let str = 'aashish';
    for(let i = 0; i < str.length; i++){
        let count = 0;
        for(let j = 0; j < str.length; j++){
            if(str.charAt(i) === str.charAt(j)){
                if(j >= i){
                    count++;
                }else{
                    count = 0;
                    break;
                }
            }
        }
        if(count !== 0){
            console.log(count, +' '+ str.charAt(i));
        }
    }
})();