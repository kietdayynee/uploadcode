package Login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Login")
public class Login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // Xử lý logic đăng nhập ở đây (ví dụ: kiểm tra thông tin đăng nhập với cơ sở dữ liệu)

        // Chuyển hướng đến trang thành công hoặc thất bại
        if (username.equals("username")&& password.equals("123")) {
            response.sendRedirect("success.jsp");
        } else {
            response.sendRedirect("failure.jsp");
        }
    }
}

