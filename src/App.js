import React from 'react';

import './index.css';

// import App from './App';
    
import Headnav from './components/headnavbar';

import 'bootstrap/dist/css/bootstrap.min.css';
import Contentin from './components/ContentInfo';

import 'react-toastify/dist/ReactToastify.css';
import '@fortawesome/fontawesome-free/css/all.css';

import { ToastContainer } from 'react-bootstrap';



function App() {
  return (
    <div>
      <ToastContainer />
      <Headnav />
      <Contentin />
      
    </div>
  );
}

export default App;
