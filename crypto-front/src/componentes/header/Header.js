import React from 'react';

import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
//dimport NavDropdown from 'react-bootstrap/NavDropdown';
import Crypto from '../crypto/Crypto.js';

import './Header.css';


function Header() {
  return (
    <>
    <Navbar bg="second" expand="lg">
      <Container>
        <Navbar.Toggle aria-controls="basic-navbar-nav" />
        <Navbar.Collapse id="basic-navbar-nav">
          <Nav className="me-auto">
            <Nav.Link href="#link">Link</Nav.Link>
          </Nav>
        </Navbar.Collapse>
      </Container>

    </Navbar>
    <br />
    <Crypto/>
    </>
  );
}

export default Header;
