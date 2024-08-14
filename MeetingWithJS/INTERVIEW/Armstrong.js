(function () {
  let n = 153,
    count = 0,
    temp = n,
    lastDigit,
    arm = 0;

  while (n != 0) {
    lastDigit = parseInt(n % 10);
    count++;
    n = parseInt(n / 10);
  }

  n = temp;

  while (n != 0) {
    lastDigit = parseInt(n % 10);
    mul = 1;
    for (let i = 1; i <= count; i++) {
      mul = parseInt(mul * lastDigit);
    }
    arm += mul;
    n = parseInt(n / 10);
  }

  if (arm == temp) {
    console.log("number is armstrong");
  } else {
    console.log("number is not armstrong");
  }
})();
