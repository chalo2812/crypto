import React from 'react';
// eslint-disable-next-line
import {Container, Nav, Navbar, NavDropdown, Button} from 'react-bootstrap';
// eslint-disable-next-line
import Table from 'react-bootstrap/Table';
import 'bootstrap/dist/css/bootstrap.min.css';
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
    <div class="primary">
        <br></br>
        <Table striped="columns" bordered="true" responsive="md">
          <thead>
            <tr>
              <th>#</th>
              <th>First Name</th>
              <th>Last Name</th>
              <th>Username</th>
            </tr>
          </thead>

        </Table>
        <br></br>
    </div>

    </>
  );
}

export default Header;
