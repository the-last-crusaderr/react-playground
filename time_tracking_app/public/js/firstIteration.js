

class TimersDashBoard extends React.Component{    
     render(){
      return(
        <div className='ui three column centered grid'>
          <div className='column'>
             <EditableTimerList/>
             <ToggleableTimerForm
	       isOpen={true}/>
	  </div> 
        </div>
	 );
 }
}





class EditableTimerList extends React.Component{
      render(){
       return(
         <div id='timers'>
	  <EditableTimer
           title = 'Learn React'
	   project = 'World Domination'
	   elasped = '843432'
	   runningSince = {null} 
	   editFormOpen = {false}
	   />
	  <Editabletimer
	   title = 'Build a portfolio'
           project = 'World Domination'
           elasped = '3843432'
           runningSince = {null} 
           editFormOpen = {true}
	   />
	 </div>
       );
 }	
}


class EditableTimer extends React.Component{
      render(){
       return(


       )
  }
}



class ToggleableTimerForm extends React.Component{
      render(){
        return(
          <div>
	   <p>'I am ToggleableTimerForm'</p>
	  </div>
	);
	      }
	}
