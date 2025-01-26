import React from 'react';

const content = document.createElement('div');
document.body.appendChild(content);

module.exports = class extends React.Component {
  static displayName = "04-basic-input";
  state = { names: [], occupations: [] }; // <-- initial state

  onFormSubmit = (evt) => {
    const name = this.refs.name.value;
    const occupation = this.refs.occ.value;
    const names = [ ...this.state.names, name ];
    const occupations = [...this.state.occupations, occupation]
    this.setState({ names: names });
    this.setState({occupations: occupations})
    this.refs.name.value = '';
    this.refs.occ.value = '';
    evt.preventDefault();
  };

  render() {
    return (
      <div>
        <h1>Sign Up Sheet</h1>

        <form onSubmit={this.onFormSubmit}>
          <input
            placeholder='Name'
            ref='name'
          />
          
	  <input 
	   placeholder='Occupation'
	   ref='occ'
	   />


          <input type='submit'
	  />
        </form>

        <div>
          <h3>Names of people</h3>
          <ul>
            { this.state.names.map((name, i) => <li key={i}>{name}</li>) }
          </ul>
	  <h3>Occupations of people</h3>
          <ul>
             {this.state.occupations.map((occupation,i) => <li key={i}>{occupation}</li>)}
	  </ul>

        </div>
      </div>
    );
  }
};
