import fs from 'fs';

(function(){
    // const w = fs.createWriteStream('xyz.txt');
    // w.write("hello ");
    // w.end();

    // w.on('finish', ()=>{
    //     console.log("finish...");
    // })

    // w.on('err', (err)=>{
    //     console.log(err);
    // })


    const r = fs.createReadStream('xyz.txt', 'utf-8');

    r.on('data', (chunk)=>{
        console.log(chunk);
    })

    r.on('end', ()=>{
        console.log('data end');
    })

    r.on('error', (err)=>{
        console.log(err);
    })
})();