/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLongestSubstring = function(str) {

    let longestSub = 0;
    let map = {};
    let currentSub =0;
    //sliding window 
    let head = 0;
  
const log = (val) => {
    console.log(`\n${val}\n`);
}  

    while(head < str.length) {
        let selector = head;
        let start = 0;
        while(selector < str.length){
            start = selector;
            if( map[str[selector]] ){
            // repeated char 
                if (currentSub > longestSub ){
                    longestSub = currentSub;
                }
                map = {};
                currentSub=0;
                break;
            }else{
                //no rep
                currentSub++;
                map[str[selector]] = 1; 
            }
            selector++;
        }
        head++;
    }
    return longestSub; 
};

console.log(lengthOfLongestSubstring(" "));