import React, { PropTypes } from 'react';

const CREDITCARD = 'Creditcard';
const BTC = 'Bitcoin';
const upi = "Gpay";

class Switch extends React.Component {
  state = {
    payMethod: BTC,
  };

  render() {
    return (
      <div className='switch'>
        <div className='choice'>Creditcard</div>
        <div className='choice'>Bitcoin</div>
	<div className='choice'>UPI</div>
        Pay with: {this.state.payMethod}
      </div>
    );
  }
}

module.exports = Switch;
