---
title: "Kakao Map API test"
date: 2020-07-16 17:19:35
categories: js api
---

Kakao Map API Test

- Drawing Gwangju, Korea Subway Line 2 


<div id="map" style="width:100%;height:350px;"></div>

<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=5bf4bd144dadbaeece33e4747d7a3549"></script>
<script>
var mapContainer = document.getElementById('map'), // 지도를 표시할 div  
    mapOption = { 
        center: new kakao.maps.LatLng(35.151523, 126.869565), // 지도의 중심좌표
        level: 7 // 지도의 확대 레벨
    };

var map = new kakao.maps.Map(mapContainer, mapOption);

var linePath = [
    new kakao.maps.LatLng(35.158525, 126.848378),
    new kakao.maps.LatLng(35.151740, 126.848378),
    new kakao.maps.LatLng(35.148202, 126.848378),
    new kakao.maps.LatLng(35.146706, 126.848664),
    new kakao.maps.LatLng(35.147235, 126.850261),
    new kakao.maps.LatLng(35.148047, 126.852013),
    new kakao.maps.LatLng(35.147799, 126.856563),
    new kakao.maps.LatLng(35.146291, 126.856963),
    new kakao.maps.LatLng(35.144288, 126.857258)
];

var polyline = new kakao.maps.Polyline({
    path: linePath,
    strokeWeight: 5,
    strokeColor: '#0471C3',
    strokeOpacity: 0.7,
    strokeStyle: 'solid'
});

polyline.setMap(map);
 
// 마커를 표시할 위치와 내용을 가지고 있는 객체 배열입니다 
var positions = [
    {
        content: '<center><div>201 시청역</div></center>', 
        latlng: new kakao.maps.LatLng(35.158525, 126.848378)
    },
    {
        content: '<center><div>202 치평역</div></center>', 
        latlng: new kakao.maps.LatLng(35.151740, 126.848378)
    },
    {
        content: '<center><div>203 상무역</div></center>', 
        latlng: new kakao.maps.LatLng(35.146706, 126.848664)
    },
    {
        content: '<center><div>204 금호역</div></center>', 
        latlng: new kakao.maps.LatLng(35.144288, 126.857258)
    }
];

for (var i = 0; i < positions.length; i ++) {
    var marker = new kakao.maps.Marker({
        map: map, // 마커를 표시할 지도
        position: positions[i].latlng // 마커의 위치
    });
    
    var infowindow = new kakao.maps.InfoWindow({
        content: positions[i].content
    });

    kakao.maps.event.addListener(marker, 'mouseover', makeOverListener(map, marker, infowindow));
    kakao.maps.event.addListener(marker, 'mouseout', makeOutListener(infowindow));
}

// 인포윈도우를 표시하는 클로저를 만드는 함수입니다 
function makeOverListener(map, marker, infowindow) {
    return function() {
        infowindow.open(map, marker);
    };
}

// 인포윈도우를 닫는 클로저를 만드는 함수입니다 
function makeOutListener(infowindow) {
    return function() {
        infowindow.close();
    };
}

</script>
