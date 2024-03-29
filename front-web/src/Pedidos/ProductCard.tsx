//import {ReactComponent as Pizza} from './pizza.svg';
//<Pizza className="order-card-image"/>

import { Produto } from './types';

type Props = {
    produto: Produto;
}
function formatPrice(preco: number)
{
    const formatter = new Intl.NumberFormat('pt-BR', {
        style: 'currency',
        currency: 'BRL',
        minimumFractionDigits: 2
    })

    return formatter.format(preco)
}


function ProductCard( { produto } : Props)
{
    return(
        <div className="order-card-container">
            <h3 className="order-card-title">
                {produto.nome}
            </h3>

            <img
                src={produto.imagemUri}
                className="order-card-image"
                alt={produto.nome}

            />

            <h3 className="order-card-price">
                { formatPrice(produto.preco) }
            </h3>

            <div className="order-card-description">
                <h3>Descrição</h3>

                <p>
                    {produto.descricao}
                </p>

            </div>

        </div>
    )
}

export default ProductCard;