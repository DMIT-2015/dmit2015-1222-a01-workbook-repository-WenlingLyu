<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>

NAIT Moodle Website
<img src="/QrCodeImageGneratorServlet?url=https://moodle.nait.ca&imageSize=200" alt="NAIT Moodle">
Youtube
<img src="/QrCodeImageGneratorServlet?url=https://youtube.com" alt="Youtube">

<h2>QR Code Generator</h2>
<form method="post" action="/QrCodeImageGneratorServlet">
    <div>
        <label for="url">URL for QrCOde</label>
        <input id="url" type="url" name="url" size="100" />
    </div>
    <div>
        <input type="checkbox" id="download" name="download" />
        <label for="download">Download QrCode Image</label>
    </div>
    <button type="submit">Submit</button>
</form>

</body>
</html>