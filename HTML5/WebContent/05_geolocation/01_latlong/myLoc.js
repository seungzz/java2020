window.onload = getMyLocation;

function getMyLocation() {
	if(navigator.geolocation){
		console.log("위치 정보 지원함");
		navigator.geolocation.getCurrentPosition
		(displayLocation, displayError);
		//navigator.geolocation.getCurrentPosition()
		//첫번째 매개변수는 요청이 성공했을 경우의 콜백 함수, 
		//두번째 매개변수는 요청이 실패했을 경우의 콜백 함수
		//세번째 매개변수는 수집옵션입니다. 
	}else{
		console.log("위치정보 지원하지 않음");
	}
}
function displayLocation(position){
	var latitude = position.coords.latitude;
	//latitude = 위도
	var longitude = position.coords.longitude;
	//longitude = 경도 
	var location = document.getElementById("location");
	location.innerHTML = "당신의 위치 : 위도("+latitude+"), " +
			"경도("+ longitude+")";
}

function displayError(error) {
	var errorTypes = 
	["알려지지 않은 에러 발생", "권한 거부", "위치 정보를 찾지 못함","요청 응답시간 초과"];
	var errHTML = erroTypes[error.code];
	console.log(errorTypes[error.code]);
	if(error.code==0 || error.code==2) {
		console.log(error.message);
		errHTML += "<br>" + error.message;
	}
	var location = document.getElementById("location");
	location.innerHTML = errHTML;
}











