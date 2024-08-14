(function (){
    let str1 = 'Hii';
    let str2 = 'Hello'; 

    str1 = str1 + " " +str2;
    str1 = str1.split(' ');
    str2 = str1[0];
    str1 = str1[1];
    console.log(str1, str2);

})();