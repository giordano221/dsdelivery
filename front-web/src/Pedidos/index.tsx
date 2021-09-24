
import { useEffect, useState } from 'react';
import { fetchProdutos } from '../api';
import ProductList from './ProductsList';
import StepsHeader from './StepsHeader';
import './styles.css';
import { Produto } from './types';

function Pedidos(){

    const [produtos, setProdutos] = useState<Produto[]>([]);
    console.log(produtos);

    useEffect(() => {
        fetchProdutos()
        .then(response => setProdutos(response.data))
        .catch(error => console.log(error))
    }, [])

    return(
        <div>
            <StepsHeader />
            <ProductList produtos={produtos} />
            
        </div>
    )
}

export default Pedidos;