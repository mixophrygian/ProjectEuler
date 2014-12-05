var FibSum = function (number) {
    var sum = 0;
    var prevTerm = 1;
    var temp = 0;
    var nextTerm = 2
    while(prevTerm < number) {
        if(prevTerm % 2 === 0){
         sum += prevTerm;   
        };
        temp = nextTerm;
        nextTerm += prevTerm;
        prevTerm = temp;
        
    };
    console.log(sum);
};

FibSum(4000000);
