---
title: "ScoreSaber Information"
date: 2021-06-27 09:53:22
categories: js api
---

<script>
function findUID(sslink) {
    tlink = sslink
    // &sort=%d
    tlink = tlink.replace(/&sort=[0-9]*/gi,'');
    // &page=%d
    tlink = tlink.replace(/&page=[0-9]*/gi,'');
    // ?sort=%d
    tlink = tlink.replace(/\?sort=[0-9]*/gi,'');
    // ?page=%d
    tlink = tlink.replace(/\?page=[0-9]*/gi,'');
    // https://score~~/u/
    tlink = tlink.replace(/https:\/\/scoresaber.com\/u\//gi,'');
    return tlink;
}

function ssGet() {
    var sslink = document.forms["ssRead"]["inputSS"].value;
    var uid = findUID(sslink);
    var url = 'https://new.scoresaber.com/api/player/' + uid + '/full'
    $.getJSON(url, function(data) {
        document.getElementById("nameValue").innerText = data.playerInfo.playerName
    })
}
</script>

Input ScoreSaber Link

<form name="ssRead">
<input type="text" name="inputSS">
<input type="button" value="Submit" onclick="ssGet()">
</form>

<form name="ssWrite">
<table>
<tr><td>이름</td><td id="nameValue"></td></tr>
</table>
</form>

<!-- Advertisement -->

<script async src="https://pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
<!-- github -->
<ins class="adsbygoogle"
     style="display:block"
     data-ad-client="ca-pub-2393564017114032"
     data-ad-slot="7921062366"
     data-ad-format="auto"
     data-full-width-responsive="true"></ins>
<script>
     (adsbygoogle = window.adsbygoogle || []).push({});
</script>

<ins class="kakao_ad_area" style="display:none;" 
 data-ad-unit    = "DAN-qxi7q147vuif" 
 data-ad-width   = "320" 
 data-ad-height  = "100"></ins> 
<script type="text/javascript" src="//t1.daumcdn.net/kas/static/ba.min.js" async> </script>
