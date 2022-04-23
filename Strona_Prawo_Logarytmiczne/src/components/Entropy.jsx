const Entropy = ({colorsList,size})=>{
    var h = 0;
    colorsList.forEach(s => {
        let p = s[2]/size;
        h += p * Math.log2(1/p);
    });
    return(
        <div className="entropy">
            <h6>Entropia informacji zawartych w obrazie wynosi: {h}.</h6>
        </div>
    )
}
export default Entropy;