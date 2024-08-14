const object = {a: 10, b: 20};

for(const key in object) {
        const element = object[key];
        // console.log(element);
        // console.log(object.key);
        console.log(key);
}