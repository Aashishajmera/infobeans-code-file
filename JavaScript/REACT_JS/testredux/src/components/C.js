import { useDispatch, useSelector } from "react-redux";
import { incrementCounter, incrementEvenCounter, incrementOddCounter } from "../redux-config/CounterSlice";

const C = () => {
    const {counter, evenCounter, oddCounter} = useSelector((store)=>{return store.Counter})
    const dispatch = useDispatch();
    return (
        <>
            <button onClick={()=>dispatch(incrementCounter())}>Increment: {counter}</button>
            <button onClick={()=>dispatch(incrementEvenCounter())}>EvenIncrement: {evenCounter}</button>
            <button onClick={()=>dispatch(incrementOddCounter())}>OddIncrement: {oddCounter}</button>

        </>
    )
}

export default C;
