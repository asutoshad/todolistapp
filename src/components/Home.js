import React from "react";
import { Container,Button } from "react-bootstrap";

function Home() {
  return (
    <div  className="bg-light mb-4 py-3 py-sm-5 text-center">
    
        <h1>Asutosh Adhikari</h1>
        <h3>This is a Demo project</h3>
        <p>
          This is developed by Asutosh Adhikari for learning Java, Spring Boot,
          and React.js and for project purposes.
        </p>
        <Container>
            <Button color="primary" outline>Start Using</Button>
        </Container>
    
    </div>
  );
}

export default Home;
