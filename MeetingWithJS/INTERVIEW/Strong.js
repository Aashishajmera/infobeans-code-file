(function () {
  let n = 145,
    temp = n;
  let lastDigit,
    fact = 1,
    sum = 0;
  while (n != 0) {
    lastDigit = parseInt(n % 10);
    for (let i = 2; i <= lastDigit; i++) {
      fact *= i;
    }
    sum += fact;
    fact = 1;
    n = parseInt(n / 10);
  }

  if (temp == sum) {
    console.log("strong");
  } else {
    console.log("not strong");
  }
})();
