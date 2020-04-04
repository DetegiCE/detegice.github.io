---
title: "Layer Popup Test"
date: 2020-04-05 01:23:06
categories: blog js
---

대충 콘텐츠

3회 수정함

<style>
#mask { 
position: absolute;
z-index: 9000;
background-color: #000;
display: none;
left: 0;
top: 0;
}

.window {
display: none;
position: absolute;
left: 100px;
top: 100px;
z-index: 10000;
}
</style>


<script>
function wrapWindowByMask(){
    var maskHeight = $(document).height();
    var maskWidth = $(window).width();  

    $('#mask').append("<center><span style='font-size:1.5em; color:white;'>Please turn off adblock!</span></center>");
    $('#mask').css({'width':maskWidth,'height':maskHeight});  

    $('#mask').fadeIn(1000);
    $('#mask').fadeTo("slow",0.8);    

    $('.window').show();
}

$(window).resize(function() {
    var width = $(window).width();
    var height = $(window).height();
    $('#mask').css({'width':width, 'height':height});
});

$(document).ready(function(){
    $('.openMask').click(function(e){
        e.preventDefault();
        wrapWindowByMask();
    });

    $('.window .close').click(function (e) {
        e.preventDefault();
        $('#mask, .window').hide();
    });
});
</script>

<div id="mask"></div>
<script>wrapWindowByMask()</script>

