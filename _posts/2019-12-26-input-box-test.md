---
title: "Input Box 테스트"
date: 2019-12-26 17:07:00
categories: blog
---

<script>
function validateForm() {
  var x = document.forms["inputTest"]["integer"].value;
  if(x >= 0 && x <= 9) {
    alert("Number is between 0 and 9");
    return false;
  }
  else {
    alert("No!");
    return true;
  }
}
</script>

Input box test

Number between 0 to 9

Typo Fixed

<form name="inputTest" onsubmit="return validateForm()">
<input type="text" name="integer">
<input type="submit" value="Submit">
</form>
