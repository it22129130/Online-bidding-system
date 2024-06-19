<!DOCTYPE html>
<html>
<head>
  <title>Contact Us</title>
  <link rel="stylesheet" href="contact.css">
  <c:import url="header.jsp" />
</head>
<body>
<body>

  <form action ="contact" method ="post">
    <html lang="en" dir="ltr">

    <?php include "header.php"; ?>
    
  <script src="script.js"></script>
<br><br><br><br><br><br>


<section class="contact">
    <div class="content">
        <h2>CONTACT US</h2>
        <br>
        <p>BIDMAGNET "Have questions or need assistance with our online bidding system?<br>
              Contact us today!"<br> </p>
    </div>
    <div class="container">
        <div class="contactInfo">
            <div class="box">
                
                
                <div class="text">
                    <h3>Address</h3>
                    <p>NO 13, New Kandy Road,<br>Colombo,<br>Sri Lanka</p>
                </div>
            </div>
            <br>

            <div class="box">
                
                <div class="text">
                    <h3>Tele-phone</h3>
                    <p>011-1234567</p>
                </div>
            </div>
            <br>
            <div class="box">
               
                <div class="text">
                    <h3>Email</h3>
                    <p>bidmagnetsystem@gmail.com</p>
                </div>
            </div>
            <br>

        </div>
        <div class="contactForm">
            <form>
                <h2>Send Message</h2>
                <div class="inputBox">
                    <input type="text" name="Full name" required="required">
                    <span>Full name</span>
                </div>
                <div class="inputBox">
                    <input type="text" name="Email" required="required">
                    <span>Email</span>
                </div>
                <div class="inputBox">
                    <textarea required="required"name ="message"></textarea>
                    <span>Type your Message...</span>
                </div>
                <div class="inputBox">
                    <input type="submit" name="" value="Send">
                    
                </div>
            </form>
        </div>
    </div>
    
</section>

<?php include "footer.php"; ?>

</form>
</body>
  </html>