---
layout: none
permalink: /kit-sise-test/
author_profile: false
---

<title>kitRun Season 6 시세표</title>

<script data-ad-client="ca-pub-2393564017114032" async src="https://pagead2.googlesyndication.com/pagead/js/adsbygoogle.js"></script>
<!-- Global site tag (gtag.js) - Google Analytics -->
<script async src="https://www.googletagmanager.com/gtag/js?id=UA-142320704-1"></script>
<script>
  window.dataLayer = window.dataLayer || [];
  function gtag(){dataLayer.push(arguments);}
  gtag('js', new Date());

  gtag('config', 'UA-142320704-1');
</script>
<script src="https://www.googletagservices.com/activeview/js/current/osd.js?cb=%2Fr20100101"></script>
<script src="https://partner.googleadservices.com/gampad/cookie.js?domain=detegice.github.io&amp;callback=_gfp_s_&amp;client=ca-pub-2393564017114032"></script>
<script type="text/javascript" async="" src="https://ssl.google-analytics.com/ga.js"></script>
<script src="https://pagead2.googlesyndication.com/pagead/js/r20200909/r20190131/show_ads_impl_fy2019.js" id="google_shimpl"></script>


<script src="http://code.jquery.com/jquery-latest.js"></script>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
<style>
    table.table {
        width: 100%;
        table-layout: fixed;
    }
    .il {
      display: inline;
    }
</style>

<!--
setAttribute : https://www.codingfactory.net/10419
popover : https://getbootstrap.com/docs/3.4/javascript/#popovers, http://jsfiddle.net/9P64a/
-->

<script>
  window.onload = function() {
    document.getElementById("curMin").innerText = String(currentMin());
    document.getElementById("curMax").innerText = String(currentMax());
    var curtag = "jg";

    // setting sises
    var priArr1 = new Array(100000, 200000, 500000, 
                           800000, 5000000, 6000000,
                           4000000, 2000000, 200000,
                           1200000, 7000000, 800000);
    for(var i=1 ; i<=priArr1.length ; i++) {
      if(i == 9) {
        document.getElementById(curtag+String(i)).innerText = numToKor(priArr1[i-1]);
        document.getElementById(curtag+String(i)).setAttribute('rel','popover');
        document.getElementById(curtag+String(i)).setAttribute('data-trigger','hover');
        document.getElementById(curtag+String(i)).setAttribute('data-original-title','시세 범위');
        document.getElementById(curtag+String(i)).setAttribute('data-content',numToKor(priArr1[i-1])+' ~ : P버섯 조각은 최저 시세만 있습니다');
        $('#'+curtag+String(i)).popover();
        continue;
      }
      if(i == 11) {
        document.getElementById(curtag+String(i)).innerText = numToKor(priArr1[i-1]);
        document.getElementById(curtag+String(i)).setAttribute('rel','popover');
        document.getElementById(curtag+String(i)).setAttribute('data-trigger','hover');
        document.getElementById(curtag+String(i)).setAttribute('data-original-title','시세 범위');
        document.getElementById(curtag+String(i)).setAttribute('data-content',numToKor(priArr1[i-1])+' ~ : 구미호 결정은 최저 시세만 있습니다');
        $('#'+curtag+String(i)).popover();
        continue;
      }
      document.getElementById(curtag+String(i)).innerText = numToKor(priArr1[i-1]);
      document.getElementById(curtag+String(i)).setAttribute('rel','popover');
      document.getElementById(curtag+String(i)).setAttribute('data-trigger','hover');
      document.getElementById(curtag+String(i)).setAttribute('data-original-title','시세 범위');
      document.getElementById(curtag+String(i)).setAttribute('data-content',minPrice(priArr1[i-1])+' ~ '+maxPrice(priArr1[i-1]));
      $('#'+curtag+String(i)).popover();
    }

    curtag = "jr";
    var priArr2 = new Array(800, 2000, 4000,
                            15000, 10000, 45000,
                            30000, 3000000, 2000000,
                            20000000, 22150000, 3000,
                            103000, 143000, 9780000,
                            1200000, 1200000, 2400000,
                            5000000, 6000000, 2000000,
                            2000000, 2000000, 200000);
    for(var i=1 ; i<=priArr2.length ; i++) {
      if(i == 10) {
        document.getElementById(curtag+String(i)).innerText = numToKor(priArr2[i-1]);
        document.getElementById(curtag+String(i)).setAttribute('rel','popover');
        document.getElementById(curtag+String(i)).setAttribute('data-trigger','hover');
        document.getElementById(curtag+String(i)).setAttribute('data-original-title','시세 범위');
        document.getElementById(curtag+String(i)).setAttribute('data-content',numToKor(priArr2[i-1])+' ~ : P버섯 결정은 최저 시세만 있습니다');
        $('#'+curtag+String(i)).popover();
        continue;
      }
      if(i == 11) {
        document.getElementById(curtag+String(i)).innerText = numToKor(priArr2[i-1]);
        document.getElementById(curtag+String(i)).setAttribute('rel','popover');
        document.getElementById(curtag+String(i)).setAttribute('data-trigger','hover');
        document.getElementById(curtag+String(i)).setAttribute('data-original-title','시세 범위');
        document.getElementById(curtag+String(i)).setAttribute('data-content',numToKor(priArr2[i-1])+' ~ : P버섯 영혼은 최저 시세만 있습니다');
        $('#'+curtag+String(i)).popover();
        continue;
      }
      document.getElementById(curtag+String(i)).innerText = numToKor(priArr2[i-1]);
      document.getElementById(curtag+String(i)).setAttribute('rel','popover');
      document.getElementById(curtag+String(i)).setAttribute('data-trigger','hover');
      document.getElementById(curtag+String(i)).setAttribute('data-original-title','시세 범위');
      document.getElementById(curtag+String(i)).setAttribute('data-content',minPrice(priArr2[i-1])+' ~ '+maxPrice(priArr2[i-1]));
      $('#'+curtag+String(i)).popover();
    }

    curtag = "sj";
    var priArr3 = new Array(800, 1500, 3000,
                            9000, 15000, 200000,
                            50000, 10500000, 22150000, 
                            10000, 20000, 50000, 
                            80000, 500000, 75000, 
                            530000, 100000, 200000, 
                            300000, 10000);
    for(var i=1 ; i<=priArr3.length ; i++) {
      if(i == 9) {
        document.getElementById(curtag+String(i)).innerText = numToKor(priArr3[i-1]);
        document.getElementById(curtag+String(i)).setAttribute('rel','popover');
        document.getElementById(curtag+String(i)).setAttribute('data-trigger','hover');
        document.getElementById(curtag+String(i)).setAttribute('data-original-title','시세 범위');
        document.getElementById(curtag+String(i)).setAttribute('data-content',numToKor(priArr3[i-1])+' ~ : P상자는 최저 시세만 있습니다');
        $('#'+curtag+String(i)).popover();
        continue;
      }
      document.getElementById(curtag+String(i)).innerText = numToKor(priArr3[i-1]);
      document.getElementById(curtag+String(i)).setAttribute('rel','popover');
      document.getElementById(curtag+String(i)).setAttribute('data-trigger','hover');
      document.getElementById(curtag+String(i)).setAttribute('data-original-title','시세 범위');
      document.getElementById(curtag+String(i)).setAttribute('data-content',minPrice(priArr3[i-1])+' ~ '+maxPrice(priArr3[i-1]));
      $('#'+curtag+String(i)).popover();
    }

    curtag = "bs";
    var priArr4 = new Array(110000, 330000, 600000,
                            1500000, 1350000, 3500000,
                            2750000, 4250000, 4800000,
                            4950000, 4100000, 140000000,
                            100000000, 12550000, 8000000,
                            15000000, 3500000, 5000000,
                            6000000, 9500000, 12000000,
                            6000000, 34300000, 24300000, 
                            14300000, 8200000, 9200000,
                            12200000, 16600000, 58600000,
                            7400000, 6100000, 15200000,
                            23100000, 35000000, 40000000,
                            42000000, 55100000, 20000000);
    for(var i=1 ; i<=priArr4.length ; i++) {
      if(i == 16) {
        document.getElementById(curtag+String(i)).innerText = numToKor(priArr4[i-1]);
        document.getElementById(curtag+String(i)).setAttribute('rel','popover');
        document.getElementById(curtag+String(i)).setAttribute('data-trigger','hover');
        document.getElementById(curtag+String(i)).setAttribute('data-original-title','시세 범위');
        document.getElementById(curtag+String(i)).setAttribute('data-content',numToKor(priArr4[i-1])+' ~ : 구미호 버섯 (여우)는 최저 시세만 있습니다');
        $('#'+curtag+String(i)).popover();
        continue;
      }
      document.getElementById(curtag+String(i)).innerText = numToKor(priArr4[i-1]);
      document.getElementById(curtag+String(i)).setAttribute('rel','popover');
      document.getElementById(curtag+String(i)).setAttribute('data-trigger','hover');
      document.getElementById(curtag+String(i)).setAttribute('data-original-title','시세 범위');
      document.getElementById(curtag+String(i)).setAttribute('data-content',minPrice(priArr4[i-1])+' ~ '+maxPrice(priArr4[i-1]));
      $('#'+curtag+String(i)).popover();
    }

    curtag = "gt";
    var priArr5 = new Array(400, 20000, 50000,
                            200000, 100000, 600000,
                            2600000, 3600000, 50000,
                            250000, 2250000, 3000000,
                            6500000);
    for(var i=1 ; i<=priArr5.length ; i++) {
      document.getElementById(curtag+String(i)).innerText = numToKor(priArr5[i-1]);
      document.getElementById(curtag+String(i)).setAttribute('rel','popover');
      document.getElementById(curtag+String(i)).setAttribute('data-trigger','hover');
      document.getElementById(curtag+String(i)).setAttribute('data-original-title','시세 범위');
      document.getElementById(curtag+String(i)).setAttribute('data-content',minPrice(priArr5[i-1])+' ~ '+maxPrice(priArr5[i-1]));
      $('#'+curtag+String(i)).popover();
    }
  }
  function currentMin() {
    return 50;
  }
  function currentMax() {
    return 150;
  }
  function numToKor(num) {
    var intNum = Number(num);
    var ret = "";
    if(intNum >= 100000000) {
      var eok = parseInt(intNum/100000000);
      ret = ret + String(eok);
      ret = ret + "억";
      intNum -= eok*100000000;
    }
    if(intNum >= 10000) {
      var man = parseInt(intNum/10000);
      ret = ret + String(man);
      ret = ret + "만";
      intNum -= man*10000;
    }
    if(intNum > 0) {
      var ill = parseInt(intNum);
      ret = ret + String(ill);
    }
    ret = ret + "원";
    return ret;
  }
  function minPrice(price) {
    return numToKor(parseInt(price*currentMin()/100));
  }
  function maxPrice(price) {
    return numToKor(parseInt(price*currentMax()/100));
  }
</script>

<div class="alert alert-danger" role="alert">
    <h4 class="alert-heading">2020년 11월 2일 기준 시세</h4>
    <hr>
    <p class="mb-0" style="display: inline;">시세가 없는 물품은 자유 시세로 가능합니다.<br>
        시세 파괴의 기준은 <div id="curMin" class="il"></div>% ~ <div id="curMax" class="il"></div>%로, 서버 규칙을 참고하시기 바랍니다.<br>
        <strong>시세를 벗어나는 거래를 시도하거나 하는 경우, 최대 밴 처벌을 받으실 수 있습니다.</strong></p>
        <hr>
        금액 위에 마우스를 올리면 시세 범위를 확인하실 수 있습니다.<br>P급, 구미호 결정, 구미호 버섯 (여우)의 경우 최저 시세만 존재합니다.
    </div>
<div>
    
<div class="accordion" id="accordionExample">
    <div class="card"> <!-- 조각 -->
      <div class="card-header" id="headingOne">
        <h2 class="mb-0">
          <button class="btn btn-link btn-block text-left" type="button" data-toggle="collapse" data-target="#collapseOne" aria-expanded="true" aria-controls="collapseOne">
            조각
          </button>
        </h2>
      </div>
  
      <div id="collapseOne" class="collapse show" aria-labelledby="headingOne" data-parent="#accordionExample">
        <div class="card-body">
          <table class="table">
              <thead class="thead-light">
                <tr>
                    <th scope="col">물품</th>
                    <th scope="col">가격</th>
                    <th scope="col">물품</th>
                    <th scope="col">가격</th>
                    <th scope="col">물품</th>
                    <th scope="col">가격</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                    <th scope="row">왕 버섯의 흔적</th>
                    <th scope="row"><a id="jg1"></a></th>
                    <th scope="row">원시인 버섯의 흔적</th>
                    <th scope="row"><a id="jg2"></a></th>
                    <th scope="row">정령 버섯의 흔적</th>
                    <th scope="row"><a id="jg3"></a></th>
                </tr>
                <tr>
                    <th scope="row">대마법사 버섯의 흔적</th>
                    <th scope="row"><a id="jg4"></a></th>
                    <th scope="row">고대 버섯의 흔적</th>
                    <th scope="row"><a id="jg5"></a></th>
                    <th scope="row">눈사람 버섯의 흔적</th>
                    <th scope="row"><a id="jg6"></a></th>
                </tr>
                <tr>
                  <th scope="row">우주인 버섯 조각</th>
                  <th scope="row"><a id="jg7"></a></th>
                  <th scope="row">악동 버섯 조각</th>
                  <th scope="row"><a id="jg8"></a></th>
                  <th scope="row">P 버섯 조각</th>
                  <th scope="row"><a id="jg9"></a></th>
                </tr>
                <tr>
                  <th scope="row">[기간한정] 해파리 조각</th>
                  <th scope="row"><a id="jg10"></a></th>
                  <th scope="row">[기간한정] 구미호 결정</th>
                  <th scope="row"><a id="jg11"></a></th>
                  <th scope="row">[기간한정] 구미호 조각</th>
                  <th scope="row"><a id="jg12"></a></th>
                </tr>
              </tbody>
          </table>
        </div>
      </div>
    </div>
    <div class="card"> <!-- 재료 -->
      <div class="card-header" id="headingTwo">
        <h2 class="mb-0">
          <button class="btn btn-link btn-block text-left collapsed" type="button" data-toggle="collapse" data-target="#collapseTwo" aria-expanded="false" aria-controls="collapseTwo">
            재료
          </button>
        </h2>
      </div>
      <div id="collapseTwo" class="collapse" aria-labelledby="headingTwo" data-parent="#accordionExample">
        <div class="card-body">
            <table class="table">
                <thead class="thead-light">
                  <tr>
                      <th scope="col">물품</th>
                      <th scope="col">가격</th>
                      <th scope="col">물품</th>
                      <th scope="col">가격</th>
                      <th scope="col">물품</th>
                      <th scope="col">가격</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                      <th scope="row">C급 재료</th>
                      <th scope="row"><a id="jr1"></a></th>
                      <th scope="row">B급 재료</th>
                      <th scope="row"><a id="jr2"></a></th>
                      <th scope="row">A급 재료</th>
                      <th scope="row"><a id="jr3"></a></th>
                  </tr>
                  <tr>
                      <th scope="row">S (가수, 여전사)</th>
                      <th scope="row"><a id="jr4"></a></th>
                      <th scope="row">S (기타)</th>
                      <th scope="row"><a id="jr5"></a></th>
                      <th scope="row">SS (치킨, 번개)</th>
                      <th scope="row"><a id="jr6"></a></th>
                  </tr>
                  <tr>
                    <th scope="row">SS (기타)</th>
                    <th scope="row"><a id="jr7"></a></th>
                    <th scope="row">R (소환마녀)</th>
                    <th scope="row"><a id="jr8"></a></th>
                    <th scope="row">R (생물학자)</th>
                    <th scope="row"><a id="jr9"></a></th>
                </tr>
                <tr>
                  <th scope="row">P버섯 결정</th>
                  <th scope="row"><a id="jr10"></a></th>
                  <th scope="row">P버섯 영혼</th>
                  <th scope="row"><a id="jr11"></a></th>
                  <th scope="row">증명서</th>
                  <th scope="row"><a id="jr12"></a></th>
                </tr>
                <tr>
                  <th scope="row">균사체</th>
                  <th scope="row"><a id="jr13"></a></th>
                  <th scope="row">고급진 균사체</th>
                  <th scope="row"><a id="jr14"></a></th>
                  <th scope="row">희귀한 균사체</th>
                  <th scope="row"><a id="jr15"></a></th>
                </tr>
                <tr>
                  <th scope="row">톱상어</th>
                  <th scope="row"><a id="jr16"></a></th>
                  <th scope="row">개복치</th>
                  <th scope="row"><a id="jr17"></a></th>
                  <th scope="row">백상아리</th>
                  <th scope="row"><a id="jr18"></a></th>
                </tr>
                <tr>
                  <th scope="row">깨끗한 물</th>
                  <th scope="row"><a id="jr19"></a></th>
                  <th scope="row">G 강화석</th>
                  <th scope="row"><a id="jr20"></a></th>
                  <th scope="row">Lapis 강화석</th>
                  <th scope="row"><a id="jr21"></a></th>
                </tr>
                <tr>
                  <th scope="row">Redstone 강화석</th>
                  <th scope="row"><a id="jr22"></a></th>
                  <th scope="row">낚시 강화석</th>
                  <th scope="row"><a id="jr23"></a></th>
                  <th scope="row">S급 물고기</th>
                  <th scope="row"><a id="jr24"></a></th>
                </tr>
                </tbody>
            </table>
        </div>
      </div>
    </div>
    <div class="card"> <!-- 상자 -->
      <div class="card-header" id="headingThree">
        <h2 class="mb-0">
          <button class="btn btn-link btn-block text-left collapsed" type="button" data-toggle="collapse" data-target="#collapseThree" aria-expanded="false" aria-controls="collapseThree">
            상자
          </button>
        </h2>
      </div>
      <div id="collapseThree" class="collapse" aria-labelledby="headingThree" data-parent="#accordionExample">
        <div class="card-body">
            <table class="table">
                <thead class="thead-light">
                  <tr>
                      <th scope="col">물품</th>
                      <th scope="col">가격</th>
                      <th scope="col">물품</th>
                      <th scope="col">가격</th>
                      <th scope="col">물품</th>
                      <th scope="col">가격</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                      <th scope="row">C급 선물상자</th>
                      <th scope="row"><a id="sj1"></a></th>
                      <th scope="row">B급 선물상자</th>
                      <th scope="row"><a id="sj2"></a></th>
                      <th scope="row">A급 선물상자</th>
                      <th scope="row"><a id="sj3"></a></th>
                  </tr>
                  <tr>
                      <th scope="row">S급 선물상자</th>
                      <th scope="row"><a id="sj4"></a></th>
                      <th scope="row">SS급 선물상자</th>
                      <th scope="row"><a id="sj5"></a></th>
                      <th scope="row">R급 선물상자</th>
                      <th scope="row"><a id="sj6"></a></th>
                  </tr>
                  <tr>
                    <th scope="row">G 랜덤상자</th>
                    <th scope="row"><a id="sj7"></a></th>
                    <th scope="row">U 랜덤상자</th>
                    <th scope="row"><a id="sj8"></a></th>
                    <th scope="row">P급 랜덤상자</th>
                    <th scope="row"><a id="sj9"></a></th>
                  </tr>
                  <tr>
                    <th scope="row">챕터 1 상자</th>
                    <th scope="row"><a id="sj10"></a></th>
                    <th scope="row">챕터 2 상자</th>
                    <th scope="row"><a id="sj11"></a></th>
                    <th scope="row">챕터 3 상자</th>
                    <th scope="row"><a id="sj12"></a></th>
                  </tr>
                  <tr>
                    <th scope="row">챕터 4 상자</th>
                    <th scope="row"><a id="sj13"></a></th>
                    <th scope="row">챕터 5 상자</th>
                    <th scope="row"><a id="sj14"></a></th>
                    <th scope="row">[기간한정] 해파리 상자</th>
                    <th scope="row"><a id="sj15"></a></th>
                  </tr>
                  <tr>
                    <th scope="row">[기간한정] 달토끼 상자</th>
                    <th scope="row"><a id="sj16"></a></th>
                    <th scope="row">히든 챕터 1 상자</th>
                    <th scope="row"><a id="sj17"></a></th>
                    <th scope="row">히든 챕터 2 상자</th>
                    <th scope="row"><a id="sj18"></a></th>
                  </tr>
                  <tr>
                    <th scope="row">스페셜 챕터 2 상자</th>
                    <th scope="row"><a id="sj19"></a></th>
                    <th scope="row">잠수 코드</th>
                    <th scope="row"><a id="sj20"></a></th>
                    <th scope="row"></th>
                    <th scope="row"></th>
                  </tr>
                </tbody>
            </table>
        </div>
      </div>
    </div>
    <div class="card"> <!-- 버섯 -->
      <div class="card-header" id="headingFour">
        <h2 class="mb-0">
          <button class="btn btn-link btn-block text-left collapsed" type="button" data-toggle="collapse" data-target="#collapseFour" aria-expanded="false" aria-controls="collapseFour">
            버섯
          </button>
        </h2>
      </div>
      <div id="collapseFour" class="collapse" aria-labelledby="headingFour" data-parent="#accordionExample">
        <div class="card-body">
            <table class="table">
                <thead class="thead-light">
                  <tr>
                      <th scope="col">물품</th>
                      <th scope="col">가격</th>
                      <th scope="col">물품</th>
                      <th scope="col">가격</th>
                      <th scope="col">물품</th>
                      <th scope="col">가격</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                      <th scope="row">C급 버섯</th>
                      <th scope="row"><a id="bs1"></a></th>
                      <th scope="row">B급 버섯</th>
                      <th scope="row"><a id="bs2"></a></th>
                      <th scope="row">A급 버섯</th>
                      <th scope="row"><a id="bs3"></a></th>
                  </tr>
                  <tr>
                      <th scope="row">S (가수, 여전사)</th>
                      <th scope="row"><a id="bs4"></a></th>
                      <th scope="row">S (기타)</th>
                      <th scope="row"><a id="bs5"></a></th>
                      <th scope="row">SS (치킨, 번개)</th>
                      <th scope="row"><a id="bs6"></a></th>
                  </tr>
                  <tr>
                    <th scope="row">SS (기타)</th>
                    <th scope="row"><a id="bs7"></a></th>
                    <th scope="row">SSS (검투사, 불타는, 의사, 로봇)</th>
                    <th scope="row"><a id="bs8"></a></th>
                    <th scope="row">SSS (마법사, 눈물, 소림사, 마술사)</th>
                    <th scope="row"><a id="bs9"></a></th>
                  </tr>
                  <tr>
                    <th scope="row">SSS (응원단장, 천사, 과학자, 주술사)</th>
                    <th scope="row"><a id="bs10"></a></th>
                    <th scope="row">SSS (귀부인)</th>
                    <th scope="row"><a id="bs11"></a></th>
                    <th scope="row">R (소환마녀)</th>
                    <th scope="row"><a id="bs12"></a></th>
                  </tr>
                  <tr>
                    <th scope="row">R (생물학자)</th>
                    <th scope="row"><a id="bs13"></a></th>
                    <th scope="row">[기간한정] 해파리 버섯</th>
                    <th scope="row"><a id="bs14"></a></th>
                    <th scope="row">[기간한정] 구미호 버섯 (사람)</th>
                    <th scope="row"><a id="bs15"></a></th>
                  </tr>
                  <tr>
                    <th scope="row">[기간한정] 구미호 버섯 (여우)</th>
                    <th scope="row"><a id="bs16"></a></th>
                    <th scope="row">G (서커스)</th>
                    <th scope="row"><a id="bs17"></a></th>
                    <th scope="row">G (메이드)</th>
                    <th scope="row"><a id="bs18"></a></th>
                  </tr>
                  <tr>
                    <th scope="row">G (선생님)</th>
                    <th scope="row"><a id="bs19"></a></th>
                    <th scope="row">U (태권도)</th>
                    <th scope="row"><a id="bs20"></a></th>
                    <th scope="row">U (학생)</th>
                    <th scope="row"><a id="bs21"></a></th>
                  </tr>
                  <tr>
                    <th scope="row">U (항해사)</th>
                    <th scope="row"><a id="bs22"></a></th>
                    <th scope="row">H (눈사람)</th>
                    <th scope="row"><a id="bs23"></a></th>
                    <th scope="row">H (우주인)</th>
                    <th scope="row"><a id="bs24"></a></th>
                  </tr>
                  <tr>
                    <th scope="row">H (악동)</th>
                    <th scope="row"><a id="bs25"></a></th>
                    <th scope="row">L (왕)</th>
                    <th scope="row"><a id="bs26"></a></th>
                    <th scope="row">L (원시인)</th>
                    <th scope="row"><a id="bs27"></a></th>
                  </tr>
                  <tr>
                    <th scope="row">L (정령)</th>
                    <th scope="row"><a id="bs28"></a></th>
                    <th scope="row">L (대마법사)</th>
                    <th scope="row"><a id="bs29"></a></th>
                    <th scope="row">L (고대)</th>
                    <th scope="row"><a id="bs30"></a></th>
                  </tr>
                  <tr>
                    <th scope="row">[잠수] 서핑 버섯</th>
                    <th scope="row"><a id="bs31"></a></th>
                    <th scope="row">C+ (평범한)</th>
                    <th scope="row"><a id="bs32"></a></th>
                    <th scope="row">U+ (항해사)</th>
                    <th scope="row"><a id="bs33"></a></th>
                  </tr>
                  <tr>
                    <th scope="row">G+ (서커스)</th>
                    <th scope="row"><a id="bs34"></a></th>
                    <th scope="row">잠수+ (서핑)</th>
                    <th scope="row"><a id="bs35"></a></th>
                    <th scope="row">L+ (정령)</th>
                    <th scope="row"><a id="bs36"></a></th>
                  </tr>
                  <tr>
                    <th scope="row">SS+ (달고나)</th>
                    <th scope="row"><a id="bs37"></a></th>
                    <th scope="row">U+ (태권도)</th>
                    <th scope="row"><a id="bs38"></a></th>
                    <th scope="row">[기간한정] 달토끼 버섯</th>
                    <th scope="row"><a id="bs39"></a></th>
                  </tr>
                </tbody>
            </table>
        </div>
      </div>
    </div>
    <div class="card"> <!-- 기타 -->
      <div class="card-header" id="headingFive">
        <h2 class="mb-0">
          <button class="btn btn-link btn-block text-left collapsed" type="button" data-toggle="collapse" data-target="#collapseFive" aria-expanded="false" aria-controls="collapseFive">
            기타
          </button>
        </h2>
      </div>
      <div id="collapseFive" class="collapse" aria-labelledby="headingFive" data-parent="#accordionExample">
        <div class="card-body">
            <table class="table">
                <thead class="thead-light">
                  <tr>
                      <th scope="col">물품</th>
                      <th scope="col">가격</th>
                      <th scope="col">물품</th>
                      <th scope="col">가격</th>
                      <th scope="col">물품</th>
                      <th scope="col">가격</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                      <th scope="row">포자</th>
                      <th scope="row"><a id="gt1"></a></th>
                      <th scope="row">포자뭉치</th>
                      <th scope="row"><a id="gt2"></a></th>
                      <th scope="row">루비</th>
                      <th scope="row"><a id="gt3"></a></th>
                  </tr>
                  <tr>
                      <th scope="row">추천 코인</th>
                      <th scope="row"><a id="gt4"></a></th>
                      <th scope="row">철 곡괭이</th>
                      <th scope="row"><a id="gt5"></a></th>
                      <th scope="row">다이아몬드 곡괭이</th>
                      <th scope="row"><a id="gt6"></a></th>
                  </tr>
                  <tr>
                    <th scope="row">에메랄드 곡괭이</th>
                    <th scope="row"><a id="gt7"></a></th>
                    <th scope="row">루비 곡괭이</th>
                    <th scope="row"><a id="gt8"></a></th>
                    <th scope="row">낚시대</th>
                    <th scope="row"><a id="gt9"></a></th>
                </tr>
                <tr>
                  <th scope="row">좋은 낚시대</th>
                  <th scope="row"><a id="gt10"></a></th>
                  <th scope="row">고급진 낚시대</th>
                  <th scope="row"><a id="gt11"></a></th>
                  <th scope="row">특급 낚시대</th>
                  <th scope="row"><a id="gt12"></a></th>
                </tr>
                <tr>
                  <th scope="row">강화보호권</th>
                  <th scope="row"><a id="gt13"></a></th>
                  <th scope="row"></th>
                  <th scope="row"></th>
                  <th scope="row"></th>
                  <th scope="row"></th>
                </tr>
                </tbody>
            </table>
        </div>
      </div>
    </div>
  </div>



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
