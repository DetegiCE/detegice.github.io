---
title: "KIT 후원 변환기"
date: 2020-01-01 00:00:00
categories:
---

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
