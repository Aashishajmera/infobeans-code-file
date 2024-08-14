export const increment = () =>{
    return {
        type: "Increment"
    }
}

export const decrement = () =>{
    return {
        type: 'Decrement'
    }
}

export const evenIncrement = () =>{
    return {
        type: 'EvenIncrement', 
        payload: 2
    }
}