import { changeCount } from "./ChangeCounterReducer";

import {combineReducers} from 'redux';
import { evenCounterReducer } from "./EvenCounterReducer";


export const rootReducer = combineReducers({
        changeCount,
        evenCounterReducer
});


