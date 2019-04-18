//blue book question 20  
function skip() { 
	document.write("<br>") 
} 
function show(text) { 
	document.write(text) 
	skip() 
}  
function A(al) { 
	alert(al)
} 
var name=prompt("hello there what is your name?")
A("hello there in this program you will choose a type of media to give the grades ") 
var want=parseInt(prompt("which type of media do you want? type only the number, 1- regular media 2- complex media 3-leave"))  
var sumgrade=0 
if(want == 1 ) {  
	var limit=parseFloat(prompt("how many grades are you going to give us," + name + "?"))
	var counter=0
	for(var n = 1 ; n <= limit; n++) { 
		var grade=parseFloat(prompt("what is the value of grade number " + n + "?")) 
		sumgrade=sumgrade + grade
		counter=counter+1
	} 
	var media=(sumgrade/counter).toFixed(2) 
	show("the regular media of all the " + limit + " grades equal: " + media) 
} 
if(want == 2) { 
	var limit=parseFloat(prompt("how many grades are you going to give us," + name + "?"))
	var counter=0
	for(var n=1 ; n <= limit ;n++) { 
		var grade=parseFloat(prompt("what is the value of grade number " + n + "?"))  
		var weight=parseFloat(prompt("what is the weight of grade number " + n + "?")) 
		sumgrade=sumgrade + (grade * weight) 
		counter=counter+(1*weight).toFixed(2)
	} 
	var media=sumgrade/counter 
	show("the complex media of all the " + limit + " grades is: " + media)
} 
if(want == 3) { 
	show("<strong><big>" + name + ".exe has left the program" + "</strong></big>")
} 
