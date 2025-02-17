 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Information File</title>
    </head>
    <body>

        <form action="CalculateServlet.do" Method="POST">

            <table>

         
                
                <tr>


                    <td>Enter Salary:</td>

                    <td><input type="number" name="salary"></td>


                </tr>



                <tr> 
                    <td>Job Role</td>
                    <td>

                        <select name="jobRole">

                            <option value="Manager">Manager</option>

                            <option  value="Developer">Developer</option>

                            <option  value="intern">Intern</option>

                        </select></td>




                </tr>

                <tr> 
                    <td> </td>
                    <td><input type="submit" value="Submit"></td>

                </tr>

            </table>


        </form>


    </body>
</html>
