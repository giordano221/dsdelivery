import { BrowserRouter, Switch, Route } from "react-router-dom";
import Home from "./Home";
import Navbar from "./Navbar";

import Pedidos from "./Pedidos";

function Routes()
{
    return (
        <BrowserRouter>
            <Navbar />
            <Switch>
                <Route path="/pedidos">
                    <Pedidos/>
                </Route>

                <Route path="/">
                    <Home/>
                </Route>


            </Switch>
        </BrowserRouter>
    )

}

export default Routes;