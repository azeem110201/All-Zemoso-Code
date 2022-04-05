import { useState } from 'react';
import { TextUtils } from './components/TextUtils';
import { Navbar } from './components/Navbar';

function App() {
  const [mode, setMode] = useState('light');
  const toggleMode = () => {
    if(mode === 'light'){
      setMode('dark');
      document.body.style.backgroundColor = 'grey';
    }
    else{
      setMode('light');
      document.body.style.backgroundColor = 'white';
    }
  }
  return (
    <div className="App">
      <Navbar title={"Text-Utils"} mode={mode} toggleMode={toggleMode}/>
      <TextUtils />
    </div>
  );
}

export default App;
