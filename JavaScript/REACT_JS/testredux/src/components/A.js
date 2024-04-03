import {useSelector} from 'react-redux';

const A = () => {
   const {name, age, contact} = useSelector((store)=>{return store.Person})
  return (
    <>
      <h1>A component....{name}:  {age}: {contact}: </h1>
    </>
  );
};

export default A;