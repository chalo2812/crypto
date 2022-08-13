//@package
//eslint-disable-next-line
import React, {useState, useEffect} from 'react';

//JS - Components
import Crypto from './componentes/crypto/Crypto.js';
import Header from './componentes/header/Header.js';
import './index.js';

//Style
import './App.css';
import './index.css';

export default function App()  {
  return (
    <div className="App">
      <Header/>
      <Crypto/>
    </div>
  );
}
