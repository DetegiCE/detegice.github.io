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
    return '<a href="https://scoresaber.com/global">#' + numComma(gRank) + '</a> (<img src="https://www.countryflags.io/' + country + '/flat/24.png"> <a href="https://scoresaber.com/global?country=' + country + '">#' + numComma(cRank) + '</a>)'
}

function difficultyColor(num) {
    if(num == 9)
        return '<span style="color:#8f48db;">Expert+</span>';
    else if(num == 7) 
        return '<span style="color:#bf2a42;">Expert</span>';
    else if(num == 5)
        return '<span style="color:tomato;">Hard</span>';
    else if(num == 3)
        return '<span style="color:#59b0f4;">Normal</span>';
    else if(num == 1)
        return '<span style="color:MediumSeaGreen;">Easy</span>';
    else 
        return '<span style="color:red;">DifficultyDisplayError</span>';
}

function makeRankSongText(data) {
    return '<b>#' + String(data.rank) + ' <a href="https://scoresaber.com/leaderboard/' + String(data.leaderboardId) + '">' + data.songAuthorName + ' - ' + data.songName + ' ' + data.songSubName + ' ' + difficultyColor(data.difficulty) + ' by ' + data.levelAuthorName
}

function makePPText(data) {
    return String((data.pp).toFixed(2)) + 'pp <span style="color:grey"><i>(' + String((data.pp * data.weight).toFixed(2)) + ')</i></span><br/><span style="color:grey">accuracy: ' + String((data.score * 100 / data.maxScore).toFixed(2)) + '%</span>'
}

function ssGet() {
    var sslink = document.forms["ssRead"]["inputSS"].value;
    var uid = findUID(sslink);
    var url = 'https://new.scoresaber.com/api/player/' + uid + '/full'
    $.getJSON(url, function(data) {
        document.getElementById("nameValue").innerHTML = '<a href="https://steamcommunity.com/profiles/' + uid + '">' + data.playerInfo.playerName + '</a>'
        document.getElementById("rankValue").innerHTML = makeRankText(data.playerInfo.rank, data.playerInfo.countryRank, data.playerInfo.country)
        document.getElementById("ppValue").innerText = numComma(data.playerInfo.pp)
        document.getElementById("araValue").innerText = String((data.scoreStats.averageRankedAccuracy).toFixed(2)) + '%'
        document.getElementById("pcValue").innerText = numComma(data.scoreStats.rankedPlayCount) + ' / ' + numComma(data.scoreStats.totalPlayCount)
        document.getElementById("scoreValue").innerText = numComma(data.scoreStats.totalRankedScore) + ' / ' + numComma(data.scoreStats.totalScore)
        document.getElementById("profileValue").innerHTML = '<img src="https://new.scoresaber.com' + data.playerInfo.avatar + '" style="border-radius :30%;">'
    })

    var url2 = 'https://new.scoresaber.com/api/player/' + uid + '/scores/TOP/0'
    $.getJSON(url2, function(data) {
        document.getElementById("top1Value").innerHTML = makeRankSongText(data.scores[0])
        document.getElementById("top2Value").innerHTML = makeRankSongText(data.scores[1])
        document.getElementById("top3Value").innerHTML = makeRankSongText(data.scores[2])
        document.getElementById("top1pp").innerHTML = makePPText(data.scores[0])
        document.getElementById("top2pp").innerHTML = makePPText(data.scores[1])
        document.getElementById("top3pp").innerHTML = makePPText(data.scores[2])
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
<tr><td>이름</td><td id="nameValue"></td><td id="profileValue" rowspan="3"></td></tr>
<tr><td>랭크</td><td id="rankValue"></td></tr>
<tr><td>PP</td><td id="ppValue"></td></tr>
<tr><td>평균 랭곡 정확도</td><td id="araValue" colspan="2"></td></tr>
<tr><td>플레이 카운트<br/>(랭곡/전체)</td><td id="pcValue" colspan="2"></td></tr>
<tr><td>점수 합계<br/>(랭곡/전체)</td><td id="scoreValue" colspan="2"></td></tr>
<tr><td rowspan="3">TOP 3</td><td id="top1Value"></td><td id="top1pp"></td></tr>
<tr><td id="top2Value"></td><td id="top2pp"></td></tr>
<tr><td id="top3Value"></td><td id="top3pp"></td></tr>
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
