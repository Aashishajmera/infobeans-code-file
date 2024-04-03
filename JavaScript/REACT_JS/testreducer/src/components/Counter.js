import { useReducer } from "react";

export const Counter = () => {
  const [counter, dispatch] = useReducer((state, action) => {
    if (action === "increment") {
      return (state = state + 1);
    } else if (action === "decrement") {
      return (state = state - 1);
    } else {
      return (state = 100);
    }

    // switch (action) {
    //   case "increment":
    //     state = state + 1;
    //     return state;
    //   case "decrement":
    //     state = state - 1;
    //     return state;
    //   case "reset":
    //     return 100;
    // }
  }, 100);

  return (
    <>
      <h1>Counter {counter}</h1>
      <button onClick={() => dispatch("increment")}>Increment</button>
      <button onClick={() => dispatch("decrement")}>Decrement</button>
      <button onClick={() => dispatch("reset")}>reset</button>
    </>
  );
};
