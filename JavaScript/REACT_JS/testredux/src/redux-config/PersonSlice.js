import {createSlice} from '@reduxjs/toolkit'
const PersonSlice = createSlice({
    name: 'PersonSlice',
    initialState: {
        name: 'Aashish',
        age: 18, 
        contact: 7489896419
    }
}); 

export default PersonSlice.reducer;