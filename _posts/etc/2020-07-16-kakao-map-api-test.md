---
title: "Kakao Map API test"
date: 2020-07-16 17:19:35
categories: js api
---

<div id="map" style="width:500px;height:400px;"></div>
<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=5bf4bd144dadbaeece33e4747d7a3549"></script>
<script>
  var container = document.getElementById('map');
  var options = {
    center: new kakao.maps.LatLng(35.158525, 126.848378),
    level: 3
  };

  var map = new kakao.maps.Map(container, options);
  
  var positions = [
    {
      content: '<center>시청역</center>'
      latlang: new kakao.maps.LatLang(35.158525, 126.848378)
    }
  ];
  
  for (var i = 0 ; i < positions.length ; i++) {
    var marker = new kakao.maps.Marker({
      map: map,
      position: positions[i].latlng
    }});
    var infowindow = new kakao.maps.InfoWindow({
      content: positions[i].content
    });
    kakao.maps.event.addListener(marker, 'mouseover', makeOverListener(map, marker, infowindow));
    kakao.maps.event.addListener(marker, 'mouseout', makeOutListener(infowindow));
  }
  
function makeOverListener(map, marker, infowindow) {
    return function() {
        infowindow.open(map, marker);
    };
}

function makeOutListener(infowindow) {
    return function() {
        infowindow.close();
    };
}
</script>
