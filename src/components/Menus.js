import React from "react";
import { ListGroup } from "react-bootstrap";
import { Link } from "react-router-dom";


function Menuss(){
    return(
        <ListGroup>

            <Link className="list-group-item list-group-item-action" tag="a"  to="/" >Home</Link>
            <Link className="list-group-item list-group-item-action" tag="a"  to="/addtodo" >Add Course </Link>
            <Link className="list-group-item list-group-item-action" tag="a" to="/todolist" >View Course</Link>
            <Link className="list-group-item list-group-item-action" tag="a"  to="#!" action>About Us</Link>
            <Link className="list-group-item list-group-item-action" tag="a"  to="#!" action>Contact</Link>
        </ListGroup>
    );
};

export default Menuss;