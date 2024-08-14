export const evenCounterReducer = (state = 0, action)=>{
    switch(action.type){
        case 'EvenIncrement': return state + action.payload;
        default : return state;
    }
}