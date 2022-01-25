import React, {useState, useCallback,useMemo} from 'react';
import Child from '../Child';
function Parent() {
  const [parentNumber, setParentNumber] = useState(0);
  const [childNumber,setChildNumber] = useState(0);
  const [arr,setArr] = useState([1,2,3,4,5,6,7,8,9,10]);
  const memoizedMaxValue = useMemo(()=>getLargestNumber(),[arr]);
  const incrementParentNumber = () => {
    setParentNumber(parentNumber+1);
  }
  const changeChildNumber = (number) => {
    setChildNumber(number)
  }
  const memoizedCallBack = useCallback(number => changeChildNumber(number),[]);
  const changeArray = () => {
    setArr([12,58,32,65]);
  }
  function getLargestNumber() {
    // It is an expensive operation to perform.
    return Math.max(...arr);
  }
  console.log("in parent component (use memo)");
  return (
    <div className="Parent">
      <Child number = {childNumber} changeNumber = {memoizedCallBack}/>
      <button onClick = {incrementParentNumber}>Increment Parent Number</button>
      <h2>Parent Number: {parentNumber}</h2>
      <h4>Largest Number: {memoizedMaxValue}</h4>
      <button onClick = {changeArray}>Change Array</button>
    </div>
  );
}

export default Parent
