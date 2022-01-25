import './App.css';
import MemoExample from './Component/memoExample/Parent';
import UseCallBackExample from './Component/UseCallbackExample/Parent';
import UseMemoExample from './Component/UseMemoExample/Parent';
function App() {
  // Read the Readme.md file to get more info
  return (
    <div className="App">
      <div className="Memo-Example">
        <h1>Memo Example</h1>
        <MemoExample />
      </div>
      <hr />
      <div className="useCallBack-Example">
        <h1>use call back Example</h1>
        <UseCallBackExample/>
      </div>
      <hr/>
      <div className = "useMemo-Example">
        <h1>use memo example</h1>
        <UseMemoExample/>
      </div>
    </div>
  );

}

export default App;
