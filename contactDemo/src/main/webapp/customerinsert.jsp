<!DOCTYPE html>
<html>
<head>
  <title>Contact Us</title>
  <link rel="stylesheet" href="contact.css">
</head>
<body>
<body style="
    	height: 200px;
    	margin: auto;
    	text-align: center;">

 
        <div class="contactForm">
        <form action="insert" method="post" >
                <h2>Insert details</h2>
                <div class="inputBox">
                    <input type="text" name="fullname" required="required">
                    <span>Full name</span>
                </div>
                <div class="inputBox">
                    <input type="text" name="email" required="required">
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
</body>
  </html>
