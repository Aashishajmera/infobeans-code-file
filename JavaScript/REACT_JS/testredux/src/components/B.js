import { useSelector } from "react-redux";

const B = () => {
  const { a, b } = useSelector((store) => store.Data);
  return (
    <>
      <h1>
        B component....{a}: {b}
      </h1>
    </>
  );
};

export default B;
