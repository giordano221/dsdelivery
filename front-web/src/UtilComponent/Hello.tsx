import { useEffect } from "react";

type Props = {
    msg: string;
}

function Hello({msg} : Props)
{

    useEffect(() => 
    {
        //console.log('componente iniciado...');
        //chamada para api para buscar produtos

    }, []);

    return(
        <h1>Hello {msg} </h1>
        
    )
}

export default Hello;