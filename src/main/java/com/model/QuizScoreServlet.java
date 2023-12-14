package com.model;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/QuizScoreServlet")
public class QuizScoreServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        int score = Integer.parseInt(request.getParameter("score"));

        try {
        	
            // Change these values according to your database setup
            String dbUrl = "jdbc:mysql://localhost:3306/project";
            String dbUsername = "root";
            String dbPassword = "indupriya@2001";

            // Register the JDBC driver and open a connection
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);

            // Insert the score into the database
            String insertQuery = "INSERT INTO quiz_scores (username, score) VALUES (?, ?)";
            PreparedStatement preparedStatement = conn.prepareStatement(insertQuery);
            preparedStatement.setString(1, username);
            preparedStatement.setInt(2, score);
            preparedStatement.executeUpdate();

            // Close the connection
            conn.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

        response.sendRedirect("java.html"); // Redirect to a result page or any desired page after storing the score
    }
}
