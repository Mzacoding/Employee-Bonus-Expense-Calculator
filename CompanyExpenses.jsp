<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Company Expenses</title>
    </head>
    <body>
        <h1>Company Expenses</h1>


        <%

            double totalCampanyExpenses = (Double) request.getAttribute("totalCampaniesExpenses");


        %>




        <div>

            <table>

                <tr>

                    <td>Total Company Expenses :R<%=totalCampanyExpenses%></td>
                </tr>


            </table>


            <p><a href="information.jsp">Re-Calculate</a> Total Company Expenses </p>
            <p><a href="index.html">Go</a> to Welcome page</p>

        </div>


    </body>
</html>
