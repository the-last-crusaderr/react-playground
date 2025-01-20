/*
  eslint-disable react/prefer-stateless-function, react/jsx-boolean-value,
  no-undef, jsx-a11y/label-has-for
*/

//import {v4 as uuidv4} from 'uuid';

class TimersDashboard extends React.Component {

state = {
  timers : [
   {
          title:'Practice Squat',
          project:'To get physically fit',
          elapsed:8986300,
	  id: uuid.v4(),
          runningSince:{null},	   
   },  
   {
	  title:'Practice Meditation',
          project:'To get mentally fit',
          elapsed:328986300,
	  id: uuid.v4(),
          runningSince:{null},
	 
   },
 ]
}



// Inside TimersDashboard
  handleCreateFormSubmit = (timer) => {
    this.createTimer(timer);
  };  


 handleTrashClick = (id) => {
   console.log(id); 
   const updatedTimers = this.state.timers.filter( (timer) => {
       return timer.id !== id;
	   }   )

     this.setState({timers: updatedTimers,})
	 }

            



  createTimer = (timer) => {
    const t = helpers.newTimer(timer);
    this.setState({
      timers: this.state.timers.concat(t),
    }); 
  };  



/*
 handleCreateFormSubmit = (timer) => {
     this.createTimer(timer);
	 }


createTimer = (timer) => {
     const t = helpers.newTimer(timer);
     this.setState( {timers: this.state.timers.concat(t),} )


	}
*/

 handleEditFormSubmit = (args) => {
     
     const updatedTimers = this.state.timers.map( (timer) => {
	 if(args.id === timer.id){
           return Object.assign({},timer,{title:args.title, project:args.project,})
		 } 
         else
	   return timer	 
	     }  )
    // console.log(args.id,this.state.timers[0].id,updatedTimers)
     this.setState({timers: updatedTimers});
	 }



  render() {
    return (
      <div className='ui three column centered grid'>
        <div className='column'>
          <EditableTimerList
	   timers={this.state.timers}
	   onFormSubmit={this.handleEditFormSubmit}
	   onTrashClick={this.handleTrashClick}/>
          <ToggleableTimerForm
            onFormSubmit={this.handleCreateFormSubmit}
          />
        </div>
      </div>
    );
  }
}

class ToggleableTimerForm extends React.Component {
  constructor(props){
    super(props)
    this.handleFormOpen = this.handleFormOpen.bind(this)
	  }	
  state = {
    isOpen: false,
	  }

  handleFormOpen(){
    this.setState( {isOpen: true,}  )
	  }

  handleFormClose = () => {
     this.setState( {isOpen: false}  )
	  }	  
	  
  handleFormSubmit = (timer) => {

     this.props.onFormSubmit(timer) 
    this.setState( {isOpen: false})
	  }


  render() {
    if (this.state.isOpen) {
      return (
        <TimerForm onFormSubmit={this.handleFormSubmit} onFormClose={this.handleFormClose}/>
      );
    } else {
      return (
        <div className='ui basic content center aligned segment'>
          <button className='ui basic button icon' onClick={this.handleFormOpen}>
            <i className='plus icon' />
          </button>
        </div>
      );
    }
  }
}

class EditableTimerList extends React.Component {
  render() {
   const timers = this.props.timers.map( (timer) => (
       <EditableTimer
          key ={timer.id}
	  id = {timer.id}
          title={timer.title}
          project={timer.project}
          elapsed={timer.elapsed}
          runningSince={timer.runningSince}
	  onFormSubmit={this.props.onFormSubmit}
	  onTrashClick={this.props.onTrashClick}
        />
	  ));
   console.log(this.props.onTrashClick)
    return (
      <div id='timers'>
        {timers}
      </div>
    );
  }
}

class EditableTimer extends React.Component {
  state = {
    editFormOpen:false,}

 handleEditClick = () => {
   this.openForm();
	 }

 handleSubmit = (timer) => {
    this.props.onFormSubmit(timer);
    this.closeForm();
	 }

 handleFormClose = () => {
    this.closeForm();
	 }

 closeForm = () => {
    this.setState( {editFormOpen: false,}  )
	 }

 openForm = () => {
   this.setState( {editFormOpen: true,}  )
	 }	 
	 

  render() {
    if (this.state.editFormOpen) {
      return (
        <TimerForm
          title={this.props.title}
          project={this.props.project}
	  id={this.props.id}
	  onFormSubmit={this.handleSubmit}
	  onFormClose={this.handleFormClose}
        />
      );
    } else {
      return (
        <Timer
	  id={this.props.id}
          title={this.props.title}
          project={this.props.project}
          elapsed={this.props.elapsed}
          runningSince={this.props.runningSince}
	  onEditClick={this.handleEditClick}
	  onTrashClick={this.props.onTrashClick}
        />
      );
    }
  }
}

class Timer extends React.Component {
	handleTrashClick = () => {
            this.props.onTrashClick(this.props.id)
		}
  render() {
    const elapsedString = helpers.renderElapsedString(this.props.elapsed);
    return (
      <div className='ui centered card'>
        <div className='content'>
          <div className='header'>
            {this.props.title}
          </div>
          <div className='meta'>
            {this.props.project}
          </div>
          <div className='center aligned description'>
            <h2>
              {elapsedString}
            </h2>
          </div>
          <div className='extra content'>
            <span className='right floated edit icon' onClick={this.props.onEditClick}>
              <i className='edit icon' />
            </span>
            <span className='right floated trash icon' onClick={this.handleTrashClick}>
              <i className='trash icon' />
            </span>
          </div>
        </div>
        <div className='ui bottom attached blue basic button'>
          Start
        </div>
      </div>
    );
  }
}

class TimerForm extends React.Component {
	state = {
	  title: this.props.title || '',
	  project: this.props.project || '',
		}
       handleTitleChange = (e) => {
         this.setState( { title: e.target.value }  )
	      }
       handleProjectChange = (e) => {
          this.setState( { project: e.target.value}  )
	       }	       

       handleSubmit = ()=>{
        const timer = {
		id :this.props.id,
               title: this.state.title,
               project: this.state.project,
       }
       //console.log(this.props.id)
	this.props.onFormSubmit(timer)

	       }
		
  render() {
    console.log(this.state.title, this.state.project, this.props.onFormSubmit);	  
    const submitText = this.props.id ? 'Update' : 'Create';
    return (
      <div className='ui centered card'>
        <div className='content'>
          <div className='ui form'>
            <div className='field'>
              <label>Title</label>
              <input type='text' value={this.state.title} onChange={this.handleTitleChange}/>
            </div>
            <div className='field'>
              <label>Project</label>
              <input type='text' value={this.state.project} onChange={this.handleProjectChange}/>
            </div>
            <div className='ui two bottom attached buttons'>
              <button className='ui basic blue button' onClick={this.handleSubmit}>
                {submitText}
              </button>
              <button className='ui basic red button' onClick={this.props.onFormClose}>
                Cancel
              </button>
            </div>
          </div>
        </div>
      </div>
    );
  }
}

ReactDOM.render(
  <TimersDashboard />,
  document.getElementById('content')
);
