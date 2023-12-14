<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Contact Us!</title>
        <meta charset="utf-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" />
        <!-- Bootstrap JS -->
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="contactUSCSS.css"/>
        <link rel="stylesheet" href="indexStyle.css"/>
    </head>
    <body>
        
        <!-- Contact Us Section -->
        <section class="contact-us">
            <div class="container">
                <div class="row">
                    <div class="col-md-7">
                        <div class="section-title">
                            <h2>Contact Us</h2>
                            <p>Drop your inquiry here and our experts will get back to you!</p>
                        </div>
                    </div>
                </div>
                <form action="sendEmail.jsp" method="post">
    <!-- Form fields -->
    <div class="form-row">
        <div class="col-md-6 form-group">
            <input type="text" name="name" class="form-control" placeholder="Your Name" />
        </div>
        <div class="col-md-6 form-group">
            <input type="email" name="email" class="form-control" placeholder="Your Email" />
        </div>
    </div>
    <div class="form-group">
        <input type="text" name="subject" class="form-control" placeholder="Subject" />
    </div>
    <div class="form-group">
        <textarea name="message" class="form-control" placeholder="Type Message"></textarea>
    </div>
    <button type="submit" class="btn btn-light">Contact Now</button>
</form>
                
                    
                </div>
            </div>
        </section>
        
        
        <div class="footer">
            <footer>
                 © 2023 QuizOn, Inc. 
            </footer>
        </div>
        <!-- End Contact Us Section -->
         <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    -->
    </body>
</html>