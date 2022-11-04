//@package
//eslint-disable-next-line
import React, {useState, useEffect} from 'react';
//JS - Components
import Header from './componentes/header/Header.js';
import Crypto from './componentes/crypto/Crypto.js';
import './index.js';
//Style
import './App.css';
import './index.css';
import 'bootstrap/dist/css/bootstrap.css';

export default function App()  {
  return (
    <div className="App">
      <Header/>
      <Crypto/>
    </div>
  );
}
