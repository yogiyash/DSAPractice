/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    
    let map = {}
    for (let i =0 ; i< nums.length; i++){
        if(map[target-nums[i]] != undefined){
            const arr = [];
            arr.push(map[target-nums[i]]);
            arr.push(i);
            return arr;
        }
        map[nums[i]] = i;
    }
};


const nums = [0,7,8,2,5,3];
const result  =  twoSum(nums, 9);
console.log(result);