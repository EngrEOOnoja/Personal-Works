/*Pet Chooser
Let’s pick a favorite pet! Ask the user to type a pet, like “dog” or “cat,” and
save it in a box. If they pick “dog,” make the computer say, “Woof! Dogs are
awesome!” For any other pet, say, “Cool choice, but I love dogs!” Use a
choice to decide what to say.*/



function petchooser(petName){

	if(name === 'dog'){
	  return 'Woof! Dogs are awesome!' ;
			}
	else  return 'Cool choice, but I love dogs!'
	
	}



 const prompt = require('prompt-sync')();
const name = prompt('Enter your pet name: e.g "dog" or "cat" ');
let result = petchooser(name)
    console.log(result);
  

