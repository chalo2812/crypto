import React from 'react';
import './Crypto.css';
import logo from './crypto.png';

function Crypto() {
    return (
        <div className="Crypto">
            <img className="Crypto-logo" src={logo} alt="Pedo"/>
            <span>Texto</span>
        </div>
    );
}

export default Crypto;