import React from "react";
import { ToastContainer } from "react-toastify";
import { Col, Container, Row } from "react-bootstrap";
import { BrowserRouter, Route, Routes } from "react-router-dom";
import Menus from "./Menus";
import Home from "./Home";

import Formlogin from "./AddCourse";
import Allcourse from "./AllCourses";

const Contentin = () => {
  return (
    <div>
      <BrowserRouter>
        <ToastContainer />
        <Container>
          <Row>
            <Col md={4}>
              <Menus />
            </Col>
            <Col md={8}>
              <Routes>
                <Route path="/" element={<Home />} />
                <Route path="/addtodo" element={<Formlogin />} />
                <Route path="/todolist" element={<Allcourse />} />
              </Routes>
            </Col>
          </Row>
        </Container>
      </BrowserRouter>
    </div>
  );
};

export default Contentin;
