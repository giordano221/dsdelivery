import { useState } from "react"

function Counter()
{
    /* useState recebe uma variavel (counter) e uma funcao (setCounter) */
    const [counter, setCounter] = useState(0);

    const handleIncrease = () => {
        setCounter(counter + 1);
    }

    const handleDecrease = () => {
        setCounter(counter -1);
    }

    return (
        <div>
            <button onClick={handleIncrease}>INCREMENTAR</button>
            <button onClick={handleDecrease}>DECREMENTAR</button>
            <h1>Valor do Contador: {counter} </h1>
        </div>
    )

}

export default Counter;