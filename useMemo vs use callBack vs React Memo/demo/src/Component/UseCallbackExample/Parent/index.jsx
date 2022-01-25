import React, {useState, useCallback} from 'react';
import Child from '../Child';
function Parent() {
  const [parentNumber, setParentNumber] = useState(0);
  const [childNumber,setChildNumber] = useState(0);

  const incrementParentNumber = () => {
    setParentNumber(parentNumber+1);
  }
  const changeChildNumber = (number) => {
    setChildNumber(number)
  }
  const memoizedCallBack = useCallback(number => changeChildNumber(number),[]);
  
  console.log("in parent component (use call back)")
  return (
    <div className="Parent">
      {/* Before Memoization of callback */}
      {/* <Child number = {childNumber} changeNumber = {changeChildNumber}/> */}
      {/* After memoization of callback*/}
      <Child number = {childNumber} changeNumber = {memoizedCallBack}/>
      <button onClick = {incrementParentNumber}>Increment Parent Number</button>
      <h2>Parent Number: {parentNumber}</h2>
    </div>
  );
}

export default Parent
