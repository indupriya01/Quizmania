<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
  
.fgh{
background-color:#ffffff00;
box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
  transition: 0.3s;
  float:left;
  width:100%;
  height:100%;
  object-position: bottom left;
}
  body {
      margin: 0;
      padding: 0;
      font-family: Arial, sans-serif;
    }
    
    .navbar {
      background-color: #ffffff00;
      overflow: hidden;
    }
    
    .navbar a {
      float: left;
      display: block;
      color: black;
      text-align: center;
      padding: 14px 16px;
      text-decoration: none;
      font-size: 17px;
    }
    .img{
    float:left;
    width:"150%" ;
    height:150%
    }
    
    .navbar a:hover {
      background-color: #ffffff00;
      color: black;
    }
    .container {
      display: flex;
    }
    
    .image {
      flex: 1;
      float:left;
    width:"150%" ;
    height:150%
    }
    .footer-dark {
  padding:50px 0;
  color:#f0f9ff;
  background-color:#282d32;
}

.footer-dark h3 {
  margin-top:0;
  margin-bottom:12px;
  font-weight:bold;
  font-size:16px;
}

.footer-dark ul {
  padding:0;
  list-style:none;
  line-height:1.6;
  font-size:14px;
  margin-bottom:0;
}

.footer-dark ul a {
  color:inherit;
  text-decoration:none;
  opacity:0.6;
}

.footer-dark ul a:hover {
  opacity:0.8;
}

@media (max-width:767px) {
  .footer-dark .item:not(.social) {
    text-align:center;
    padding-bottom:20px;
  }
}

.footer-dark .item.text {
  margin-bottom:36px;
}

@media (max-width:767px) {
  .footer-dark .item.text {
    margin-bottom:0;
  }
}

.footer-dark .item.text p {
  opacity:0.6;
  margin-bottom:0;
}

.footer-dark .item.social {
  text-align:center;
}

@media (max-width:991px) {
  .footer-dark .item.social {
    text-align:center;
    margin-top:20px;
  }
}

.footer-dark .item.social > a {
  font-size:20px;
  width:36px;
  height:36px;
  line-height:36px;
  display:inline-block;
  text-align:center;
  border-radius:50%;
  box-shadow:0 0 0 1px rgba(255,255,255,0.4);
  margin:0 8px;
  color:#fff;
  opacity:0.75;
}

.footer-dark .item.social > a:hover {
  opacity:0.9;
}

.footer-dark .copyright {
  text-align:center;
  padding-top:24px;
  opacity:0.3;
  font-size:13px;
  margin-bottom:0;
}

    
    .card {
      flex: 1;
    background-image: linear-gradient(to right, #c6ffdd, #fbd786, #f7797d);
      padding: 25px;
    }
.contact-us {
    padding: 70px 0px;
    background-color: black;
}
.section-title h2 {
    color: #ffffff;
    font-size: 30px;
    font-weight: normal;
    text-transform: uppercase;
    letter-spacing: 8px;
    border-bottom: 5px solid #af8070;
    padding-bottom: 10px;
    display: inline-block;
}
.section-title p {
    color: #e8e8e8;
    margin-bottom: 30px;
}
.contact-us input,
.contact-us textarea {
    background: #fafafa;
}
.contact-us textarea {
    min-height: 188px;
    max-width: 100%;
}
.contact-us .map {
    overflow: hidden;
    border-radius: 4px;
}
</style>
<body  style="background-color:#CFFAFC;">
<div class="fgh">
</div>
 <div class="navbar">
    <a href="#home">Home</a>
    <a href="#about">About</a>
    <a href="quizes.jsp">Quizes</a>
    <a href="ContactUs.jsp">Contact</a>
  </div>
</body>
 <div class="container">
    <div class="image">
      <img src="https://www.pngplay.com/wp-content/uploads/2/Mickey-Mouse-Transparent-Images.png"   >
    </div>
    <div class="card">
    
      <h2>Wecome</h2>
      <br>
      <p style="font-size: 2rem">Welcome to our quizON website! Are you ready to test your knowledge and challenge yourself? 
      Our platform offers a wide range of engaging quizzes on various topics, including science, history, pop culture, and more. Whether you are a trivia enthusiast or a student looking to review your lessons, we've got you covered.
      With our user-friendly interface, you can easily navigate through different quiz categories and select the ones that interest you the most. Each quiz is carefully crafted to provide a mix of fun and educational content. Answer multiple-choice questions, solve puzzles, and tackle brain 
      teasers to earn points and track your progress.</p>
    </div>
  </div>
  <br>
  <br>
  <br>
  
  <br>
  <br>
  <br>
  
  <br>
  <br>
  <br>
  
  <br>
  <br>
  <br>
  <br>
  <br>
  <br>
  
  <br>
  
  <div class="footer-dark">
        <footer>
         <section class="contact-us">
            <div class="container"></div>
                <div class="row">
                    <div class="col-md-7">
                        <div class="section-title">
                            <h2>Contact Us</h2>
                            <p>Drop your inquiry here and our experts will get back to you!</p>
                            <br>
                            <br>
                            <label for="name">Your Name</label>
                    <input type="text" name="name" class="form-control" id="name" placeholder="Your Name" />
                    <br>
                    <label for="email">Your Email</label>
                    <input type="email" class="form-control" name="email" id="email" placeholder="Your Email" />
                    <br>
                    <label for="subject">Subject</label>
                <input type="text" class="form-control" name="subject" id="subject" placeholder="Subject" />
                <br>
                        </div>
                    </div>
                </div>
                </section>
              
                
        </footer>
    </div>

<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.1.3/js/bootstrap.bundle.min.js"></script>
</body>
</html>