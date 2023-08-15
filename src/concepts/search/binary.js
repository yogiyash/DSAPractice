

const search = ( arr, target) => {
    let head =0;
    let tail = arr.length;
    while (head <= tail )
    {
        mid = (head+tail)/2
        if(arr [mid] == target){
            return target;
        }
        else if (arr[mid] > target ){
            head = mid;
        }else {
            tail = mid;
        }exit

    }
    return -1;

}

