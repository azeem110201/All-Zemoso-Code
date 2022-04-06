import { useState } from 'react';
import { TextUtils } from './components/TextUtils';
import { Navbar } from './components/Navbar';
import { About } from './components/About';
import { Contact } from './components/Contact';
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';

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
    // <div className="App">
    //   <Navbar title={"Text-Utils"} mode={mode} toggleMode={toggleMode}/>
    //   <TextUtils />
    // </div>
    <Router>
      <Navbar title={"Text-Utils"} mode={mode} toggleMode={toggleMode}/>
      <Routes>
        <Route path="/" element={<TextUtils />}/>
        <Route path="/about" element={<About />}/>
        <Route path="/contact" element={<Contact />}/>
      </Routes>
    </Router>
  );
}

export default App;
