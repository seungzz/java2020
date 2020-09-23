/**
 * 문제점 : 
 * 1. 키가 중복이 발생할수 있다.  
 * 2. 어플리케이션(메모)와 관련이 없는 데이터를 너무 많이 조회하는 문제가 생길수 있습니다.
 * 
 */
window.onload = function() {
	var addBtn = document.getElementById("add_button");
	for(var i =0;i<localStorage.length;i++){
		var key = localStorage.key(i);
		if(key.substring(0,6)=="sticky")
			addToDom(localStorage.getItem(key));
	}
	addBtn.onclick = createSticky;
};
function createSticky() {
	var text = document.getElementById("note_text").value;
	var key = "sticky" + localStorage.length;
	localStorage.setItem(key,text);
	addToDom(text);
}
function addToDom(text){
	var stickies = document.getElementById("stickies");
	stickies.innerHTML += 
		"<li> <span class='sticky'>"+text+"</span></li>";
}




