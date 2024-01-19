import React, { useEffect, useState } from "react";

import Addto from "./Addto";
import base_url from "../api/bootapi";
import axios from "axios";

import { toast } from "react-toastify";
const Allcourse=()=>{


    //function to call server
    const getAllCoursesFromServer =()=>{
        axios.get(`${base_url}/notelist`).then(
            (Response)=>{
                //success
                console.log(Response.data);
                // toast.success("courses has been loaded ")
                setCourses(Response.data);
            },
            (error)=>{
                //for error
                console.log(error);
                toast.error("something went wrong")
            }
        );
    };

    //calling loadind course function
    useEffect(() => {
        getAllCoursesFromServer();
    }, []);

    const[courses,setCourses]=useState([
        // {title:"Java Course",description:"this is java course"},
        // {title:"django Course",description:"this is Django course"},
        // {title:"React Course",description:"this is React course"}
    ])
    return(
        <div>
            <h1>All courses</h1>
            <p>List of courses are as follows</p>

            {
                courses.length>0? 
                courses.map((item)=>(
                    <Addto key={item.id} course={item} />
                )) : "No courses"
            }
        </div>

    );

    
};
export default Allcourse;