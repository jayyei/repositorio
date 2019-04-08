

var arr = [5,4,3,2,1];
console.info(arr);
console.error( arr[0]);

arr.reverse();
console.warn(arr);

 arr = arr.map(function  (element){
                element *= element;
                return element;
})

console.info((arr));

arr= arr.map ( Math.sqrt);
console.error( arr);

arr = arr.join("|");
console.log(arr);

arr = arr.split("|");
console.warn(arr);

arr.push("6");
console.error(arr);

arr.unshift("0");
console.info(arr);

console.error(arr.toString());

var elimine = arr.pop();
console.log( arr, elimine);

arr.splice(1,3, "10", "200", "30");
console.error(arr);

arr = arr.slice(1 , 3);
console.warn(arr);