let str="my name is bama"
const mp = new Map();
for(let i=0;i<str.length;i++){
    if(str.charAt(i)==' ') continue;
    let count = mp.get(str.charAt(i)) || 0;
    mp.set(str.charAt(i),count+1)
}
console.log(mp);
