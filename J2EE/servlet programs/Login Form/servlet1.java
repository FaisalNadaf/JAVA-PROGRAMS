import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/servlet1")
public class servlet1 extends HttpServlet {
private static final long serialVersionUID = 1L;
 public servlet1() {
 super();
 }
protected void doGet(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
}
protected void doPost(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
// TODO Auto-generated method stub
doGet(request, response);
PrintWriter pw=response.getWriter();
response.setContentType("text/html");
String user=request.getParameter("username");
String pass=request.getParameter("password");
if(user.equals("admin")&& pass.equals("admin"))
{
pw.println("Login");
}
else
{
pw.println("Failed");
}
}
}
