import group from './group';
import './App.css';
import React, { useState } from 'react';
import previewFile from './previewFile';
import ColorsTable from './ColorsTable';
import MyResponsiveLine from './MyResponsiveLine';
import Entropy from './Entropy';

function App() {
  var pixelList;
  const [colorsList,setColorsList] = useState([]);
  const [clicked,setClicked] = useState(false);
  const [fullSizeOfPicture, setFullSizeOfPicture] = useState(0);
  function setCanvas() {

    const preview = document.querySelector('img');
    const canvas = document.getElementById('canvas');
    const ctx = canvas.getContext('2d');
    const image = new Image(preview.width, preview.height); // Using optional size for image
    image.onload = drawImageActualSize;

    image.src = preview.src;
    function drawImageActualSize() {
      canvas.width = this.naturalWidth;
      canvas.height = this.naturalHeight; 
      
      ctx.clearRect(this,0,0,this.width, this.height);
      ctx.drawImage(this, 0, 0);
    }
    
}
const click = () =>{
  setClicked(true);
  setColorsList([]);
  setTimeout(() => {  
    const canvas = document.getElementById('canvas');
    const ctx = canvas.getContext('2d');
    const data = ctx.getImageData(0,0,canvas.width,canvas.height);
      var i,j=0;
      let listlenght = data.data.length/4;
      pixelList = new Array(listlenght);
      
      for (i = 0; i < data.data.length; i += 4) {
        let pixel = new Array(4);
        pixel[0]= data.data[i];
        pixel[1]=data.data[i+1];
        pixel[2]=data.data[i+2];
        pixel[3]=data.data[i+3];
        var pixelName = pixel.join(',');
        pixelList[j] = [pixelName,pixel];
        j++;
      }
      setFullSizeOfPicture(pixelList.length);
      var newList = group(pixelList);
      setColorsList(newList);
      setClicked(false);
   }, 2000);
  
}
const reset = () =>{
  setColorsList([]);
  setClicked(false);
}
  return (
    <div className="App">
      <header className="App-header">
        <div id="leftSide">
          <img id="obraz" src="" height="200" alt="Preview..." onLoad={()=>setCanvas()} style={{display:"none"}}/>
          <canvas width="200px" height="200px" id="canvas" className="placeholder-lg"></canvas>
          <form>
              <input type="file" id="fileSelector" className="form-control form-control-sm" onChange={()=>previewFile()}/><br/>
              
              <input type="button" className="btn btn-secondary" onClick={()=>click()} value="Przetwórz" style={{marginRight:"2px"}}/>
              <input type="button" className="btn btn-secondary" value="Wyczyść" onClick={()=>reset()}/>
              
          </form>
          {colorsList.length!==0 && <Entropy colorsList={colorsList} size={fullSizeOfPicture}/>}
        </div>
        {colorsList.length!==0?
          <div id="rightSide">
          <div style={{height:"430px"}}>
            {colorsList.length!==0 && <MyResponsiveLine colorsList={colorsList}/>}
            
            </div>
            <div id="colorsTable">{colorsList.length!==0 && <ColorsTable colorsList={colorsList} />}</div>
          </div>
          :null}
          {clicked === true ?
          <div id="rightSide">
            <div className="spinner-border text-secondary" role="status">
              <span className="visually-hidden">Loading...</span>
            </div></div>
             : null
          }
      </header>
      </div>
  );
}

export default App;
