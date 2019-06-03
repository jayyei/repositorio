import React, { Component } from 'react';

class FetchExample extends Component{
    state = { bpi: {}}
    componentDidMount(){
        fetch('https://api.coindesk.com/v1/bpi/currentprice.json')
        .then(res => res.json())
        .then(data => {
            const { bpi } = data
            this.setState({ bpi })
        })
    }

    _renderCurrencies(){
        const { bpi } = this.state
        return Object.keys(bpi)
                        .map(currency => {
                            return(
                                <div key={currency}>
                                    1 BTC is {bpi[currency].rate}
                                    <span>{currency}</span>
                                </div>
                            )
                        })
    }
    render(){
        console.log (this.state.bpi)
        return(
            <div>
                <h4>FetchExample</h4>
                {this._renderCurrencies()}
            </div>
        )
    }


}

export default FetchExample;
