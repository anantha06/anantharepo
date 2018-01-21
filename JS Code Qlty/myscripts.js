//user text analyser

var count=0;
function changemode() {
	count=count+1;
if(count%2==0){
	document.getElementById("gender").style.visibility="visible";
	document.getElementById("divage").style.visibility="visible";
	document.getElementById("num").style.visibility="hidden";
}
else{
	document.getElementById("gender").style.visibility="hidden";
	document.getElementById("divage").style.visibility="hidden";
	document.getElementById("num").style.visibility="visible";
}

}
function analyse() {
	var value =document.getElementById("inputname").value;
	var value2=document.getElementById("inputnum").value
	if (document.getElementById("name").checked==true){
		analyseName(value);
	}
	else{
	analyseNumber(value2);
	}
}

function analyseNumber(value){
	if(!isNaN(value) && !(value.length==0)){
		if(value<50){
			document.getElementById("display").innerHTML = value+" less than 50";
		}
		else if(value<=50 && value>=100){
			document.getElementById("display").innerHTML = value+" is between 50 to 100";
		}
		else if( value<=1000){
			document.getElementById("display").innerHTML = value+" is between 100 to 1000";
		}
		else if(value>1000){
			document.getElementById("display").innerHTML = value+" is greater than 1000";
		}
		else{
			document.getElementById("display").innerHTML = value+" is invalid number";
		}	
	}
	else{
		document.getElementById("display").innerHTML = value+" is invalid number";
	}
	
	

}
function analyseName(value){
	if(isNaN(value) ||(value.length==0)){
		var male=document.getElementById("male").checked;
		var female=document.getElementById("female").checked;
		var age=document.getElementById("age").value;
		var gender;
		var title;
		if(male){
		gender="male";
		title="Master";
		}
		else{
		gender="female";
		title="Miss";
		}
		
		if(( value.length==0 )){
			document.getElementById("display").innerHTML = "Please enter something";
		}

		else if (value.length<25){
			document.getElementById("display").innerHTML = "<div> Your name is:"+title+" "+name+"</div><br><br>"+"<table align='left'><tr>"+
																"<th>Name</th>"+
																"<th>Gender</th>"+
																"<th>Age</th>"+
																"</tr>"+
																"<tr>"+
																"<td>"+value+"</td>"+
																"<td>"+gender+"</td>"+
																"<td>"+age+"</td>"+
																"</tr>";
		}
		else{
			document.getElementById("display").innerHTML = "Entered name is invalid";
		}
	
	}
	
	
}