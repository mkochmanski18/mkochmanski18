const ColorsTable = ({colorsList}) =>{
    colorsList.sort((a, b) => (a[2] < b[2] && 1) || -1)
    return(
        <div>
            <table className="table table-secondary table-striped">
                <thead>
                    <tr>
                        <th>Nr</th>
                        <th>Kolor</th>
                        <th>Składowe RGBA</th>
                        <th>Liczba pikseli</th>
                    </tr>
                </thead>
                <tbody>
                    {colorsList.length!==0 && colorsList.map((pixel,index)=>{
                    var R = pixel[1][0];
                    var G = pixel[1][1];
                    var B = pixel[1][2];
                    var A = pixel[1][3];
                    return(
                        <tr key={index}>
                            <td>{index+1}</td>
                            <td><div style={{width:'15px',height:'15px',backgroundColor:`rgba(${R},${G},${B},${A})`}}></div></td>
                            <td>{`(${R},${G},${B},${A})`}</td>
                            <td>{pixel[2]}</td>
                        </tr>
                    )})}
                </tbody>
            </table>
        </div>
    )
}
export default ColorsTable;