---
title: "KIT 후원 변환기"
date: 2020-01-01 00:00:00
categories:
---

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

<script>
function validateForm() {
  var x = document.forms["inputTest"]["integer"].value;
  var sum = 0;
  if(x >= 1000000) {
    sum += parseInt((x-1000000)/10000);
    x = 1000000;
  }
  
  if(x >= 100000) {
   sum += parseInt((x-100000)/5000);
   x = 100000;
  }
  
  if(x >= 30000) {
    sum += parseInt((x-30000)/2000);
    x = 30000;
  }
  
  sum += parseInt(x / 1000);
  
  alert(sum+"개");
}
</script>

..

<form name="inputTest" onsubmit="return validateForm()">
<input type="text" name="integer">
<input type="submit" value="Submit">
</form>

<ins class="kakao_ad_area" style="display:none;" 
 data-ad-unit    = "DAN-qxi7q147vuif" 
 data-ad-width   = "320" 
 data-ad-height  = "100"></ins> 
<script type="text/javascript" src="//t1.daumcdn.net/kas/static/ba.min.js" async> </script>
