// blue book chapter 5 question 18 
function skip() { 
	document.write("<br>")
} 
function show(text) { 
	document.write(text)
	skip()
} 
var counter=0 
var sumsalary=0 
var a=[] 
var g=0
var i=0 
var biggestage; 
var smallestage; 
var lowsalarywoman=0
for(var n =1 ; true ; n++) { 
	var age=parseFloat(prompt("hello there person number " + n + " what is your age?")) 
	if(age < 0 ) { 
		break;
	}  
	a[i]=age 
	
	if(a[i] > g) { 
		biggestage=a[i]
	} 
	var sex=prompt("what is your sex,person number " + n + "? man or woman?") 
	if(sex == "woman" || sex == "women" ) { 
		var salary=parseFloat(prompt("person number " + n + " what is your salary")) 
		if(salary >= 0 && salary < 200) { 
			lowsalarywoman=lowsalarywoman+1
		}
		sumsalary=sumsalary + salary 
	} 
	if(sex == "man"|| sex == "men") { 
		var salary=parseFloat(prompt("person number " + n + " what is your salary")) 
		sumsalary=sumsalary + salary
	}
	counter=counter+1 
	i++  
	g=age 
} 
var media=(sumsalary/counter).toFixed(2) 
show("the media of all the salarys is " + media + "$")  
show("the biggest age of the group is: " + biggestage + " years old" ) 
a.sort()
show("the smallest age of the grouped is " + a[0] + " years old") 
show("the amount of woman with a salary lower than 200 $ is " + lowsalarywoman + " women") 
