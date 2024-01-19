import React from "react";

import { Card,Button, CardBody, CardSubtitle, CardText, Container } from "reactstrap";




const Addto = ({course}) =>{
    return(

        <Card className="text-center">
            <CardBody>
                <CardSubtitle className="font-weight-bold">{course.title}</CardSubtitle>
                <CardText>{course.description}</CardText>
                <Container className="text-center">
                    <Button color="danger">Delete</Button>
                    <Button color="warning ml-3">update</Button>
                </Container>
            </CardBody>
        </Card>
    );
};

export default Addto;