---
title: "광주 도시철도 2호선 노선도"
date: 2020-07-16 17:19:35
categories: js api
---

Kakao Map API Test

Drawing Gwangju, Korea Subway Line 2 


<div id="map" style="width:100%;height:500px;"></div>

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
    new kakao.maps.LatLng(35.144288, 126.857258),
    new kakao.maps.LatLng(35.140974, 126.858588),
    new kakao.maps.LatLng(35.137385, 126.858963),
    new kakao.maps.LatLng(35.133046, 126.859388),
    new kakao.maps.LatLng(35.132538, 126.859964),
    new kakao.maps.LatLng(35.132602, 126.860602),
    new kakao.maps.LatLng(35.132666, 126.866380),
    new kakao.maps.LatLng(35.133174, 126.869385),
    new kakao.maps.LatLng(35.133407, 126.870133),
    new kakao.maps.LatLng(35.134486, 126.872023),
    new kakao.maps.LatLng(35.133864, 126.872257),
    new kakao.maps.LatLng(35.129595, 126.874442),
    new kakao.maps.LatLng(35.128724, 126.874689),
    new kakao.maps.LatLng(35.126375, 126.875196),
    new kakao.maps.LatLng(35.127074, 126.877147),
    new kakao.maps.LatLng(35.127531, 126.878515),
    new kakao.maps.LatLng(35.127624, 126.878966),
    new kakao.maps.LatLng(35.128017, 126.882411),
    new kakao.maps.LatLng(35.128287, 126.883365),
    new kakao.maps.LatLng(35.130177, 126.886511),
    new kakao.maps.LatLng(35.130987, 126.888047),
    new kakao.maps.LatLng(35.131880, 126.890958),
    new kakao.maps.LatLng(35.133355, 126.894103),
    new kakao.maps.LatLng(35.134026, 126.896472),
    new kakao.maps.LatLng(35.134792, 126.899091),
    new kakao.maps.LatLng(35.133289, 126.901663),
    new kakao.maps.LatLng(35.133945, 126.910467),
    new kakao.maps.LatLng(35.134305, 126.914613),
    new kakao.maps.LatLng(35.134501, 126.915842),
    new kakao.maps.LatLng(35.134713, 126.916518),
    new kakao.maps.LatLng(35.134958, 126.917022),
    new kakao.maps.LatLng(35.135642, 126.918041),
    new kakao.maps.LatLng(35.138794, 126.922447),
    new kakao.maps.LatLng(35.139382, 126.922927),
    new kakao.maps.LatLng(35.144088, 126.925864),
    new kakao.maps.LatLng(35.150877, 126.930370),
    new kakao.maps.LatLng(35.151339, 126.930568),
    new kakao.maps.LatLng(35.154682, 126.931923),
    new kakao.maps.LatLng(35.159702, 126.930912),
    new kakao.maps.LatLng(35.160456, 126.930660),
    new kakao.maps.LatLng(35.161124, 126.930215),
    new kakao.maps.LatLng(35.161589, 126.929781),
    new kakao.maps.LatLng(35.162026, 126.929212),
    new kakao.maps.LatLng(35.162454, 126.928259),
    new kakao.maps.LatLng(35.164388, 126.921006),
    new kakao.maps.LatLng(35.166882, 126.911033),
    new kakao.maps.LatLng(35.166989, 126.910676),
    new kakao.maps.LatLng(35.167613, 126.910191),
    new kakao.maps.LatLng(35.173918, 126.912735),
    new kakao.maps.LatLng(35.174328, 126.912713),
    new kakao.maps.LatLng(35.178637, 126.912088),
    new kakao.maps.LatLng(35.180445, 126.911949),
    new kakao.maps.LatLng(35.180919, 126.911676),
    new kakao.maps.LatLng(35.181513, 126.910989),
    new kakao.maps.LatLng(35.182236, 126.909561),
    new kakao.maps.LatLng(35.182820, 126.907236),
    new kakao.maps.LatLng(35.183889, 126.906562),
    new kakao.maps.LatLng(35.184018, 126.903377),
    new kakao.maps.LatLng(35.184245, 126.898726),
    new kakao.maps.LatLng(35.184658, 126.898718),
    new kakao.maps.LatLng(35.186694, 126.898333),
    new kakao.maps.LatLng(35.188406, 126.898985),
    new kakao.maps.LatLng(35.189411, 126.899049),
    new kakao.maps.LatLng(35.190870, 126.899209),
    new kakao.maps.LatLng(35.192617, 126.898643),
    new kakao.maps.LatLng(35.192967, 126.898654),
    new kakao.maps.LatLng(35.193456, 126.898878),
    new kakao.maps.LatLng(35.194085, 126.899530),
    new kakao.maps.LatLng(35.194548, 126.899797),
    new kakao.maps.LatLng(35.196435, 126.899979),
    new kakao.maps.LatLng(35.199789, 126.899819),
    new kakao.maps.LatLng(35.202733, 126.898707),
    new kakao.maps.LatLng(35.201274, 126.893266),
    new kakao.maps.LatLng(35.198016, 126.884971),
    new kakao.maps.LatLng(35.197675, 126.883218),
    new kakao.maps.LatLng(35.197789, 126.877135),
    new kakao.maps.LatLng(35.198147, 126.876430),
    new kakao.maps.LatLng(35.200898, 126.874890),
    new kakao.maps.LatLng(35.202243, 126.874014),
    new kakao.maps.LatLng(35.206410, 126.873383),
    new kakao.maps.LatLng(35.210847, 126.874228),
    new kakao.maps.LatLng(35.211138, 126.874100),
    new kakao.maps.LatLng(35.211332, 126.873885),
    new kakao.maps.LatLng(35.214612, 126.863298),
    new kakao.maps.LatLng(35.217580, 126.855562),
    new kakao.maps.LatLng(35.217684, 126.848743),
    new kakao.maps.LatLng(35.217723, 126.840468),
    new kakao.maps.LatLng(35.217675, 126.837959),
    new kakao.maps.LatLng(35.217215, 126.836307),
    new kakao.maps.LatLng(35.215894, 126.833986),
    new kakao.maps.LatLng(35.213348, 126.829543),
    new kakao.maps.LatLng(35.212007, 126.827761),
    new kakao.maps.LatLng(35.205162, 126.820561),
    new kakao.maps.LatLng(35.204214, 126.819893),
    new kakao.maps.LatLng(35.202988, 126.819506),
    new kakao.maps.LatLng(35.202433, 126.819530),
    new kakao.maps.LatLng(35.201283, 126.820034),
    new kakao.maps.LatLng(35.193669, 126.823468),
    new kakao.maps.LatLng(35.191859, 126.823925),
    new kakao.maps.LatLng(35.190719, 126.823855),
    new kakao.maps.LatLng(35.188908, 126.823398),
    new kakao.maps.LatLng(35.187213, 126.822249),
    new kakao.maps.LatLng(35.184895, 126.819834),
    new kakao.maps.LatLng(35.183668, 126.818862),
    new kakao.maps.LatLng(35.182171, 126.818112),
    new kakao.maps.LatLng(35.180615, 126.817810),
    new kakao.maps.LatLng(35.179447, 126.817715),
    new kakao.maps.LatLng(35.179050, 126.824774),
    new kakao.maps.LatLng(35.178674, 126.831725),
    new kakao.maps.LatLng(35.178388, 126.833446),
    new kakao.maps.LatLng(35.174953, 126.848378),
    new kakao.maps.LatLng(35.168368, 126.848378),
    new kakao.maps.LatLng(35.158525, 126.848378)
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
    {content: '<center><div>201 시청역</div></center>', 
     latlng: new kakao.maps.LatLng(35.158525, 126.848378)},
    {content: '<center><div>202 치평역</div></center>', 
     latlng: new kakao.maps.LatLng(35.151740, 126.848378)},
    {content: '<center><div>203 상무역</div></center>', 
     latlng: new kakao.maps.LatLng(35.146706, 126.848664)},
    {content: '<center><div>204 금호역</div></center>', 
     latlng: new kakao.maps.LatLng(35.144288, 126.857258)},
    {content: '<center><div>205 금부역</div></center>', 
     latlng: new kakao.maps.LatLng(35.137385, 126.858963)},
    {content: '<center><div>206 마재역</div></center>', 
     latlng: new kakao.maps.LatLng(35.132602, 126.860602)},
    {content: '<center><div>207 월드컵경기장역</div></center>',
     latlng: new kakao.maps.LatLng(35.133864, 126.872257)},
    {content: '<center><div>208 풍암역</div></center>',
     latlng: new kakao.maps.LatLng(35.127074, 126.877147)},
    {content: '<center><div>209 원광대병원역</div></center>',
     latlng: new kakao.maps.LatLng(35.130177, 126.886511)},
    {content: '<center><div>210 주월역</div></center>',
     latlng: new kakao.maps.LatLng(35.134026, 126.896472)},
    {content: '<center><div>211 백운역</div></center>',
     latlng: new kakao.maps.LatLng(35.133289, 126.901663)},
    {content: '<center><div>212 양림역</div></center>',
     latlng: new kakao.maps.LatLng(35.133945, 126.910467)},
    {content: '<center><div>213 방림역</div></center>',
     latlng: new kakao.maps.LatLng(35.135642, 126.918041)},
    {content: '<center><div>214 남광주역</div></center>',
     latlng: new kakao.maps.LatLng(35.139382, 126.922927)},
    {content: '<center><div>215 조선대역</div></center>',
     latlng: new kakao.maps.LatLng(35.144088, 126.925864)},
    {content: '<center><div>216 지산역</div></center>',
     latlng: new kakao.maps.LatLng(35.151339, 126.930568)},
    {content: '<center><div>217 두암역</div></center>',
     latlng: new kakao.maps.LatLng(35.159702, 126.930912)},
    {content: '<center><div>218 서방사거리역</div></center>',
     latlng: new kakao.maps.LatLng(35.159702, 126.930912)},
    {content: '<center><div>219 광주역</div></center>',
     latlng: new kakao.maps.LatLng(35.166882, 126.911033)},
    {content: '<center><div>220 전남대역</div></center>',
     latlng: new kakao.maps.LatLng(35.173918, 126.912735)},
    {content: '<center><div>221 용봉역</div></center>',
     latlng: new kakao.maps.LatLng(35.180445, 126.911949)},
    {content: '<center><div>222 오치역</div></center>',
     latlng: new kakao.maps.LatLng(35.184018, 126.903377)},
    {content: '<center><div>223 매곡역</div></center>',
     latlng: new kakao.maps.LatLng(35.189411, 126.899049)},
    {content: '<center><div>224 삼각역</div></center>',
     latlng: new kakao.maps.LatLng(35.194548, 126.899797)},
    {content: '<center><div>225 일곡역</div></center>',
     latlng: new kakao.maps.LatLng(35.202733, 126.898707)},
    {content: '<center><div>226 본촌산단역</div></center>',
     latlng: new kakao.maps.LatLng(35.198016, 126.884971)},
    {content: '<center><div>227 양산공원역</div></center>',
     latlng: new kakao.maps.LatLng(35.200898, 126.874890)},
    {content: '<center><div>228 양산역</div></center>',
     latlng: new kakao.maps.LatLng(35.206410, 126.873383)},
    {content: '<center><div>229 용두역</div></center>',
     latlng: new kakao.maps.LatLng(35.210847, 126.874228)},
    {content: '<center><div>230 신용역</div></center>',
     latlng: new kakao.maps.LatLng(35.214612, 126.863298)},
    {content: '<center><div>231 지스트역</div></center>',
     latlng: new kakao.maps.LatLng(35.217684, 126.848743)},
    {content: '<center><div>232 첨단역</div></center>',
     latlng: new kakao.maps.LatLng(35.217723, 126.840468)},
    {content: '<center><div>233 응암공원역</div></center>',
     latlng: new kakao.maps.LatLng(35.215894, 126.833986)},
    {content: '<center><div>234 수완솔빛역</div></center>',
     latlng: new kakao.maps.LatLng(35.201283, 126.820034)},
    {content: '<center><div>235 수완역</div></center>',
     latlng: new kakao.maps.LatLng(35.190719, 126.823855)},
    {content: '<center><div>236 운남역</div></center>',
     latlng: new kakao.maps.LatLng(35.179447, 126.817715)},
    {content: '<center><div>237 신가역</div></center>',
     latlng: new kakao.maps.LatLng(35.179050, 126.824774)},
    {content: '<center><div>238 유덕역</div></center>',
     latlng: new kakao.maps.LatLng(35.168368, 126.848378)}
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
