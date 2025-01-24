import React, { PropTypes } from 'react';
import styles from '../Switch.css';

const CREDITCARD = 'Creditcard';
const BTC = 'Bitcoin';
const UPI = 'UPI'

const Choice = function (props) {
  const cssClasses = [];

  if (props.active) {
    // <-- check props, not state
    cssClasses.push(styles.active);
  }

  return (
    <div
      className='choice'
      onClick={props.onClick}
      className={cssClasses}
    >
      {props.label} {/* <-- allow any label */}
    </div>
  );
};

class Switch extends React.Component {
  state = {
    payMethod: BTC,
  };

  select = (choice) => {
    return (evt) => {
      this.setState({
        payMethod: choice,
      });
    };
  };

  render() {
    return (
      <div className='switch'>
        <Choice
          onClick={this.select(CREDITCARD)}
          active={this.state.payMethod === CREDITCARD}
          label='Pay with Creditcard'
        />

        <Choice
          onClick={this.select(BTC)}
          active={this.state.payMethod === BTC}
          label='Pay with Bitcoin'
        />

       <Choice
          onClick={this.select(UPI)}
          active={this.state.payMethod === UPI}
          label='Pay with UPI'
        /> 

        Paying with: {this.state.payMethod}
      </div>
    );
  }
}

module.exports = Switch;
