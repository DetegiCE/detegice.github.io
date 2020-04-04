---
title: "Layer Popup Test"
date: 2020-04-05 01:23:06
categories: blog js
---

대충 콘텐츠



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

<script src="http://code.jquery.com/jquery-latest.js"></script>
<script>
function wrapWindowByMask(){
    var maskHeight = $(document).height();
    var maskWidth = $(window).width();  

    $('#mask').css({'width':maskWidth,'height':maskHeight});  

    $('#mask').fadeIn(1000);
    $('#mask').fadeTo("slow",0.8);    

    $('.window').show();
}

$(document).ready(function(){
    $('.openMask').click(function(e){
        e.preventDefault();
        wrapWindowByMask();
    });

    $('.window .close').click(function (e) {
        e.preventDefault();
        $('#mask, .window').hide();
    });       

    $('#mask').click(function () {
        $(this).hide();
        $('.window').hide();
    });
});
</script>

<div id="mask"></div>
<script>wrapWindowByMask()</script>

