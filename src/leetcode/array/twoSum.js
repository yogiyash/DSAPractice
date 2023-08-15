/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    
    let map = {}
    let arr = [];
    for (let i =0 ; i< nums.length; i++){
        //check if second part already in array
        if(map[target-nums[i]] != undefined){
            arr.push(map[target-nums[i]]);
            arr.push(i);
            break;
        }else{
        map[nums[i]] = i;
        }
    }
    return arr;
};


const nums = [0,7,8,2,5,3];
const result  =  twoSum(nums, 9);
console.log(result);