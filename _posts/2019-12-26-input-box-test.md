---
title: "Input Box 테스트"
date: 2019-12-26 17:07:00
categories: blog
---

<script>
function validateForm() {
  var x = forms["inputTest"]["integer"].value;
  if(x >= 0 && x <= 9) {
    alert("Number is between 0 and 9:);
    return true;
  }
  else {
    alert("No!");
    return true;
  }
}
</script>

<form name="inputTest" onsubmit="return validateForm()" method="post">
<input type="text" name="integer">
<input type="submit" value="Submit">
</form>