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

var ourCoords = { //강남역의 위도와 경도
		latitude: 37.4979420,
		longitude: 127.0276210
}

/**
 * 출발지와 목적지의 거리를 km로 반환
 * 구면 코사인 법칙 : 구면 삼각법
 * 
 * 위도와 경도
 * 한 국가나 지역의 위치를 정확히 표시 하기 위해 지구상에 가상의 가로선(위도)와
 * 세로선(경도)를 그어 수리적 위치로 표현하는 방법.  
 * 
 * 위도 : 적도를 기준으로 북위(N) , 남위(S) 0~90도로 표시합니다.
 * 경도 : 본초 자오선 (영국 런던의 그리니치 천문대를 지나는 선) 을 기준으로 
 * 동경(E) 서경(E) 0~ 180도로 표시합니다. 
 * 
 * radian은 360도를 2PI로 표현한 단위 입니다.  360도 = 2pi(rad)
 */



function computeDistance(startCoords, destCoords) {
	var startLatRads = degreesToRadians(startCoords.latitude);
	var startLongRads = degreesToRadians(startCoords.longitude);
	var destLatRads = degreesToRadians(destCoords.latitude);
	var destLongRads = degreesToRadians(destCoords.longitude);
	var Radius = 6371; //지구 반지름 (km)
	var distance = Math.acos(
			Math.sin(startLatRads) * Math.sin(destLatRads) +
			Math.cos(startLatRads) * Math.cos(destLatRads) *
			Math.cos(startLongRads - destLongRads)
		)* Radius;
	return distance;
}
/*
 * 1라디안 = 180/Math.PI , 1(degree) = Math.PI / 180
 * 반지름이 1일 경우 원의 전체 둘레 : 2 * Math.PI
 */
function degreesToRadians(degrees) {
	radians = (degrees * Math.PI) / 180;
	console.log(degrees + " - " + ( degrees * Math.PI)+ " - " 
			+ radians);
	return radians;
}
function displayLocation(position){
	var latitude = position.coords.latitude;
	//latitude = 위도
	var longitude = position.coords.longitude;
	//longitude = 경도 
	var location = document.getElementById("location");
	location.innerHTML = "당신의 위치 : 위도("+latitude+"), " +
			"경도("+ longitude+")";
	
	var km = computeDistance(position.coords, ourCoords);
	var distance = document.getElementById("distance");
	distance.innerHTML = "강남역까지의 거리 : " +km +"km";
	
	showMap(position.coords);
	//지도함수 호출
}
var map = null;
function showMap(coords){
	var latAndLng = new google.maps.LatLng(
			coords.latitude, coords.longitude);
	var mapOptions = {
		zoom : 10, //0 ~ 21 까지 설정, 클수록 확대 
		center: latAndLng, //지도의 중심좌표를 설정
		
		mapTypeId: google.maps.MapTypeId.ROADMAP
		//ROADMAP(도로), SATELLITE(위성), HYBRID
	};
	var mapDiv = document.getElementById("map");
	map = new google.maps.Map(mapDiv, mapOptions);
	//지도 객체생성(화면상에 맵객체를 보여줄 영역 , 생성할 때 사용할 옵션)
	
	var title = "당신의 현재 위치입니다.";//마커에 마우스를 올렸을 때 보여줄 툴팁
	var content = "위치(위도: " + 
	coords.latitude +" 경도 : " +coords.longitude+ ")" + 
	"\n 한국정보교육원입니다.";
	addMarker(map, latAndLng, title, content);
}
function addMarker(map, latlng, title, content){
	var markerOption ={
			position: latlng, //마커 생성 위치
			map: map,
			title: title,  //마커위에 마우스 오버할때 보여줄 툴팁
			clickable: true //클릭시 정보창을 보여주기 위해 true 설정
	};
	
	var marker = new google.maps.Marker(markerOption);
	
	var infoWindowOptions ={ //마커 클릭시 나오는 정보창에 대한 옵션
			content: content, //정보창에 나올 내용
			position: latlng
	};
	var infoWindow = new google.maps.InfoWindow(infoWindowOptions);
	//마커 클릭 이벤트 설정
	google.maps.event.addListener(marker, "click", function() {
		infoWindow.open(map);
	});
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











