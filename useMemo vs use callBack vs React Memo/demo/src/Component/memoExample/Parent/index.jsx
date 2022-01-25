import React, {useState} from 'react';
import Child from '../Child';
function Parent() {
    const [parentNumber, setParentNumber] = useState(0);
    const [childNumber,setChildNumber] = useState(0);

  const incrementParentNumber = () => {
    setParentNumber(parentNumber+1);
  }

  console.log("in parent component")
  return (
    <div className="Parent">
      <Child number = {childNumber}/>
      <button onClick = {incrementParentNumber}>Increment Parent Number</button>
      <h2>Parent Number: {parentNumber}</h2>
    </div>
  );
}

export default Parent
