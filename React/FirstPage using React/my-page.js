// as we have added /react-dom.development.js in ScriptProcessorNode, noq we can access ReactDOM
const points = ["https://github.com/Devanshi1803", "https://www.linkedin.com/in/devanshi-chandegra/", 
"devanshi.dc18@gmail.com","Hello There!!","My first React Static page"];
const listItems = points.map((pt) =>
  <li>{pt}</li>
); 
function myData() {
    return (<p>My name is Devanshi Chandegra</p>);
}


ReactDOM.render(<div>{myData()}</div>, document.getElementById("myname"))
//alternate way
// const container = document.getElementById('myname');
// const root = ReactDOM.createRoot(container);
// root.render(myData());
ReactDOM.render(<ul><li>{listItems}</li></ul>, document.getElementById("mydetails"))


//above thing using vanilla JS
const h1 = document.createElement("p")
h1.textContent = "This is imperative way to program as we are defining what should be done and how should be done."
h1.className = "header"
document.getElementById("imperative").append(h1)

//react allows declarative way of programming -> following react code will be converted by react to html, javascript
ReactDOM.render(<div>This is declarative way to program as we are defining what should be done. everything else will be taken care by react.</div>, document.getElementById("declarative"))
