const array = [11,22,33,44,55,66];

function reducer(accumulator, currentValue, index) {
    const returns = accumulator + currentValue;
    console.log(
      `accumulator: ${accumulator}, currentValue: ${currentValue}, index: ${index}, returns: ${returns}`,
    );
    return returns;
  }
  
  array.reduce(reducer);