function group(pixelList){

    var max = 0;
    var list = [];
    var i,j;
    list.push([pixelList[0][0],pixelList[0][1],1]);
    for(i = 1;i<pixelList.length;i++){
        for(j=0;j<list.length;j++){
            let index = list.findIndex(nazwa=>nazwa[0]===pixelList[i][0]);
            if(index===-1)
            {
                list.push([pixelList[i][0],pixelList[i][1],1]);
                break;
            }
            else{
                list[index][2] = list[index][2]+1;
                break;
            }
        }
    }

    return list;
    
}
export default group;
