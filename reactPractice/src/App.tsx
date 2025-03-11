import Child from "./Child";
// import "./App.css";
import Button from 'react-bootstrap/Button';
import 'bootstrap/dist/css/bootstrap.min.css';
import PeopleForm from "./peopleForm";
import People from "./people";

function App() {
  return (
    <>
      <Child name="dhanish" />
      <Child name="kumar" />
      <PeopleForm/>
      <People />
    </>
  );
}

export default App;
