import React from 'react';
import CreateHistory from 'history/createBrowserHistory'


const history = CreateHistory()

class App extends React.Component {
  render() {
    return (
      <div
        className='ui text container'
      >
        <h2 className='ui dividing header'>
          Which body of water?
        </h2>

        <ul>
          <li>
            <Link to='/atlantic'>
              <code>/atlantic</code>
            </Link>
          </li>
          <li>
            <Link to='/pacific'>
              <code>/pacific</code>
            </Link>
          </li>
        </ul>

        <hr />

        {/* We'll insert the Route components here */}
	<Route path='/atlantic' component={Atlantic}/>
        <Route path='/pacific' component={Pacific}/>
      </div>
    );
  }
}


const Link = ({to,children}) => {

 return(
<a onClick={ (e)=> { e.preventDefault()  
        history.push(e)
} }
href = {to}
>
 {children}
</a>
 )
 }






const Route = ({path,component}) => {

   const pathName = window.location.pathname
   if(pathName.match(path))
     return React.createElement(component)
   else
    return null	   
	}



const Atlantic = () => (
  <div>
    <h3>Atlantic Ocean</h3>
    <p>
      The Atlantic Ocean covers approximately 1/5th of the
      surface of the earth.
    </p>
  </div>
);

const Pacific = () => (
  <div>
    <h3>Pacific Ocean</h3>
    <p>
      Ferdinand Magellan, a Portuguese explorer, named the ocean
      'mar pacifico' in 1521, which means peaceful sea.
    </p>
  </div>
);









export default App;
