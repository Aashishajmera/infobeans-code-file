export const changeCount = (counter = 0, action) =>{
    switch(action.type){
        case 'Increment': return counter + 1;
        case "Decrement": return counter - 1;
        default: return counter;
    }
}