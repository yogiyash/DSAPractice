
const shiftByN = (arr, n) => {
    //[1,2,3,4,5,6]
    //[5,6,1,2,3,4]
    // 0,1,2,3,4,5
    const tempArray = [];
    //store temp array
    let tempIndex = arr.length - n;
    while (tempIndex < arr.length) {
        tempArray.push(arr[tempIndex++]);
    }

    //shift
    let endIndex = arr.length - 1;

    while (endIndex > n - 1) {
        arr[endIndex] = arr[endIndex - n];
        endIndex--;
    }

    tempIndex = 0;
    while (tempIndex < n) {
        arr[tempIndex] = tempArray[tempIndex++];
    }
    return arr;

}

const arr = [1, 2, 3, 4, 5, 6, 7];
for (let i = 1; i < 8; i++) {
    const arraySingh = arr.map(x => x)
    console.log(`shift by ${i}, ${JSON.stringify(shiftByN(arraySingh, i))}`);
}
