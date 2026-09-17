const arr = [1, 2, 3, 4, 5, 6];

// function maxProd(arr) {
//     arr.sort((a, b) => b - a);
//     return Math.max(arr[0] * arr[1], arr[arr.length - 1] * arr[arr.length - 2]);
// }

// console.log(maxProd(arr));

function maxProd(arr) {
    let max = Number.MIN_SAFE_INTEGER;
    let min = Number.MAX_SAFE_INTEGER;

    let sec_max = Number.MIN_SAFE_INTEGER;
    let sec_min = Number.MAX_SAFE_INTEGER;

    for (let i = 0; i < arr.length; i++) {

        let val = arr[i];

        if (val >= max) {
            sec_max = max;
            max = val;
        } else if (val > sec_max) {
            sec_max = val;
        }

        if (val <= min) {
            sec_min = min;
            min = val;
        } else if (val < sec_min) {
            sec_min = val;
        }
    }

    return Math.max(max * sec_max, min * sec_min);
}

console.log(maxProd(arr));