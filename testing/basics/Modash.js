
//We write the Modash library in this file in the Unit Testing chapter


// truncate string length to length given to args
truncate(s,length){
 
 if(s.length < length)
   return s.slice(0,length) 
 return s
	}




// capitalise the first letter and lower case the case
capitalise(s){
    
    return s.charAt(0).toUpperCase() + s.slice(1).toLowerCase()
	}




// change the string to camelCase form
camelCase(s){
  const words = string.split(/[\s|\-|_]+/);
  return [
    words[0].toLowerCase(),
    ...words.slice(1).map((w) => capitalize(w)),
  ].join('');

	}


const Modash = {
 truncate,
 capitalise,
 camelCase
	}


export default Modash




