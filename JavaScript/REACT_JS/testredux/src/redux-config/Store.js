import { configureStore } from "@reduxjs/toolkit";
import PersonSlice from "./PersonSlice";
import DataSlice from "./DataSlice";
import CounterSlice from "./CounterSlice";

const store = configureStore({
    reducer: {
        Person: PersonSlice,
        Data: DataSlice,
        Counter: CounterSlice
    }
})

export default store;