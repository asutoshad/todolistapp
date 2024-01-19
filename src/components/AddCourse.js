
import axios from "axios";
import React, { Fragment, useEffect, useState } from "react";
import { Button, Container, Form, FormGroup } from "react-bootstrap";
import { Input } from "reactstrap";
import base_url from "../api/bootapi";
import { toast } from "react-toastify";
const AddCourse = () => {
  useEffect (()=>{
    document.title = "Add Course || Asutosh Adhikari";
  }, []);
  const [course, setCourse] = useState({});
  //form handler function
  const handleForm=(e)=>{
    console.log(course);
    postDatatoServer(course);
    e.preventDefault();
  };

  //creating functio nto post data on server
  const postDatatoServer = (data)=>{
axios.post(`${base_url}/note/add`,data).then(
  (Response)=>{
    console.log(Response);
    console.log("Success");
    toast.success("Course added successfully");
    setCourse({});
  },
  (Error)=>{
    console.log(Error);
    console.log("Error");
    toast.error("Error! Something went wrong");
  }
)
  }
  return (
    <Fragment>
      <h1 className="text-center my-3">Fill Course Detail
      </h1>
      <Form onSubmit={handleForm}>
        <FormGroup>
          <label for="userId">Course Id</label>
          <Input type="text" placeholder="Enter Here"
          name="courseId" id="courseId" 
          onChange={(e)=>
          setCourse({...course,courseId: e.target.value})}/>
        </FormGroup>

        <FormGroup>
          <label for="userId">Course Title</label>
          <Input type="text" placeholder="Enter Here"
          name="title" id="title" 
          onChange={(e)=>{
            setCourse({...course,title:e.target.value})
          }}
          />
        </FormGroup>

        <FormGroup>
          <label for="userId">Course Description</label>
          <Input type="textarea" placeholder="Enter Here"
          name="description" id="description" style={{height:150}} 
          onChange={(e)=>{
            setCourse({...course,description:e.target.value})
          }}
          />
        </FormGroup>

        <Container className="text-center">
          <Button type="submit" color="success">Add Course</Button>
          <Button type="reset" color="warning ml-2" 
          >Clear</Button>
        </Container>
      </Form>
    </Fragment>
  );
}

export default AddCourse;
