import { createSlice } from "@reduxjs/toolkit";

const Data = createSlice({
    name: "dataSlice",
    initialState: {
        a: 10,
        b: 20
    }
})

export default Data.reducer;