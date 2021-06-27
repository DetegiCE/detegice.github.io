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

function numComma(num) {
    var regex = /\B(?=(\d{3})+(?!\d))/g;
    return num.toString().replace(regex, ',');
}

function makeRankText(gRank, cRank, country) {
    return '<a href="https://scoresaber.com/global">#' + numComma(gRank) + '</a> (<img src="https://www.countryflags.io/' + country + '/flat/24.png"> <a href="https://scoresaber.com/global?country="' + country + '">#' + numComma(cRank) + '</a>)'
}

function ssGet() {
    var sslink = document.forms["ssRead"]["inputSS"].value;
    var uid = findUID(sslink);
    var url = 'https://new.scoresaber.com/api/player/' + uid + '/full'
    $.getJSON(url, function(data) {
        document.getElementById("nameValue").innerHTML = '<a href="https://steamcommunity.com/profiles/' + uid + '>' + data.playerInfo.playerName + '</a>'
        document.getElementById("rankValue").innerHTML = makeRankText(data.playerInfo.rank, data.playerInfo.countryRank, data.playerInfo.country)
        document.getElementById("ppValue").innerText = numComma(data.playerInfo.pp)
        document.getElementById("araValue").innerText = str(data.playerInfo.scoreStats.averageRankedAccuracy.toFixed(2)) + '%'
        document.getElementById("pcValue").innerText = numComma(data.playerInfo.scoreStats.rankedPlayCount) + ' / ' + numComma(data.playerInfo.scoreStats.totalPlayCount)
        document.getElementById("scoreValue").innerText = numComma(data.playerInfo.scoreStats.totalRankedScore) + ' / ' + numComma(data.playerInfo.scoreStats.totalScore)
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
<tr><td>랭크</td><td id="rankValue"></td></tr>
<tr><td>PP</td><td id="ppValue"></td></tr>
<tr><td>평균 랭곡 정확도</td><td id="araValue"></td></tr>
<tr><td>플레이 카운트 (랭곡/전체)</td><td id="pcValue"></td></tr>
<tr><td>점수 합계 (랭곡/전체)</td><td id="scoreValue"></td></tr>
<tr><td rowspan="3">TOP 3</td><td id="top1Value"></td></tr>
<tr><td id="top2Value"></td></tr>
<tr><td id="top3Value"></td></tr>
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
