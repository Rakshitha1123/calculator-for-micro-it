<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head><title>Calculator</title></head>
<body>
    <h2>Simple Calculator</h2>
    <form action="calculate" method="post">
        <input type="text" name="num1" placeholder="Enter number 1" required><br><br>
        <input type="text" name="num2" placeholder="Enter number 2" required><br><br>
        <select name="operation">
            <option value="add">Add (+)</option>
            <option value="sub">Subtract (-)</option>
            <option value="mul">Multiply (*)</option>
            <option value="div">Divide (/)</option>
        </select><br><br>
        <input type="submit" value="Calculate">
    </form>
</body>
</html>
