import React, {memo,useState} from 'react'

function Child({number, changeNumber}) {
    function incrementNumber() {
        changeNumber(number+1)
    }
    console.log('in child component (use call back)')
    return (
        <div>
            <h2>Child: {number}</h2>
            <button onClick = {incrementNumber}>Click to change child number</button>
        </div>
    )
}
export default memo(Child);
