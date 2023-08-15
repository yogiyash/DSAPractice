

const map = {};

const str = 'qwertw';
for (let i = 0; i < str.length; i++) {
    if (map[str[i]]) {
        console.log(`yes dup ${str[i]} `);
    } else {
        map[str[i]]=1;
        //console.log(`not dup ${str[i]}`) ;
    }
}



//console.log(map.q)