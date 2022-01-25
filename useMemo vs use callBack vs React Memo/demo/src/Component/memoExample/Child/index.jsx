import React, {memo,useState} from 'react'

function Child({number}) {
    const [newChildNumber,setNewChildNumber] = useState(number); 
    function changeNumber() {
        setNewChildNumber(newChildNumber+1);
    }
    console.log('in child component')
    return (
        <div>
            <h2>Child: {number}</h2>
            <button onClick = {changeNumber}>Click to change child number</button>
        </div>
    )
}
// 
export default memo(Child);
