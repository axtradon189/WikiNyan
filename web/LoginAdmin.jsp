<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>WikiNyan | Login</title>
        <link href="CSS/bootstrap.min.css" rel="stylesheet">
    </head>
    <body>
        <br><br><br><br><br><br><br><br><br>
        <br>
        <div class="container-fluid">
            <div class="panel panel-success">
                <div class="panel-heading" align="center">
                    <h4><b><font color="black">Login Page</font> </b></h4>
                    <form action="LoginAdminServlet" method="post" >
                        <br><br>
                        <table>
                            <tr>
                                <td>
                                   Username 
                                </td>
                                <td>
                                    :
                                </td>
                                <td>
                                    <input type="text" class="form-control" name="username" placeholder="Masukkan Username" required="required">
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    Password
                                </td>
                                <td>
                                    :
                                </td>
                                <td>
                                    <input type="password" class="form-control" name="password" placeholder="Masukkan Password" required="required">
                                </td>
                            </tr>
                            <tr>
                                <td>
                                </td>
                                <td>
                                </td>
                                <td colspan="2">
                                    <button type="submit" class="btn btn-success" style="width: 195px;"><b>Login</b></button>
                                     <a href="index.jsp"><button type="button" class="btn btn-success">Kembali</button></a>
                                </td>
                            </tr>
                        </table>
                        <br><br>
                    </form>
                </div>
            </div>
        </div>
        <br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
    </body>
</html>