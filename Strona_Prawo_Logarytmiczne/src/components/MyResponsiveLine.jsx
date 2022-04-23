import { AreaChart,Area,ResponsiveContainer, YAxis, Tooltip} from 'recharts';
import React, { useState } from 'react';

const MyResponsiveLine = ({colorsList,max}) => {
    const [numOfColors,setNumsOfColors] = useState(null); 
    var data = [];
    colorsList.forEach(element => data.push({name:element[0],count:element[2]}));
    data.sort((a, b) => (a.count < b.count && 1) || -1)
    var listPiece;
    if(numOfColors){
        listPiece=data.slice(0,numOfColors);
    }
    else{
        setNumsOfColors(data.length);
    }
    const count = (val) =>{
        let sum = 0;
        for(let i=0;i<=val;i++){
            sum += data[i].count;
        }
        return sum;
    }
    
    var amountOfAll = count(data.length-1);

    return(
        <>
        <div style={{fontSize: 18, marginTop: '10px'}}>Obraz zawiera 
            <span style={{color:'firebrick'}}>
            &nbsp; {amountOfAll}&nbsp; 
            </span> 
            pikseli:
        </div>
        <ResponsiveContainer width={'90%'} height={300}>
            <AreaChart data={numOfColors?listPiece:data} id="chart">
                <Area dataKey="count" fill="firebrick" stroke="firebrick"/>
                
                <YAxis dataKey="count"/>
                <Tooltip
                     formatter={function(value) {
                         return `${value}`;
                       }}
                      labelFormatter={(value) =>{
                          let sum=count(value);
                          return(
                              <div>
                                  {`Nr koloru: ${value+1}`} <br/>
                                    {`Udział pikseli (z lewej strony kursora)`}<br/>{` w całym obrazie: ${Math.ceil(sum/amountOfAll*100)}%`}</div>
                          )
                      }}
                />
            </AreaChart>
        </ResponsiveContainer>
        {/* <input type="number" placeholder="Ogranicz ilość kolorów na wykresie" value={numOfColors} onChange={(e)=>setNumsOfColors(e.target.value)}/> */}
        <input type="range" class="form-range" name="points" min="1" max="data.length" style={{width:"80%"}} onChange={(e)=>setNumsOfColors(Math.ceil(e.target.value*data.length/100))}></input><br/>
       
        <div id="chartSizeLabel">Liczba kolorów pikseli na wykresie:
            <span style={{color:'firebrick'}}>
            &nbsp; {`${numOfColors}/${data.length}`}&nbsp; 
            </span> 
        </div>
        </>
    )
}
export default MyResponsiveLine;