import './App.css';
interface propName{
    name:string;
}
function child(prop:propName){
    return<>
    <div className="propName">
    <h1>Your name is {prop.name}</h1>
    </div>
    </>
}
export default child;