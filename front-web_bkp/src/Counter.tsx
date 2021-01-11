import { useState } from "react";

function Counter(){
    const [count, setCounter] = useState(0);

    const handleIncrease = ()=>{
        setCounter(count + 1);      
    }
    
    const handleDecrease = ()=>{
        setCounter(count - 1);      
    }
    return (
        <div>
            <button onClick={handleIncrease}>Incrementar</button>
            <button onClick={handleDecrease}>Decrementar</button>
            <br/>
    <h2>Valor do contador = {count}</h2>
        </div>
    )
    
}

export default Counter;