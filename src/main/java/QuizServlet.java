
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class QuizServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private String jdbcURL = "jdbc:mysql://localhost:3306/onlinetest";
    private String jdbcUsername = "root";
    private String jdbcPassword = "indupriya@2001";

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Load and display the quiz questions
        List<Question> questions = getRandomQuizQuestionsFromDatabase();
        request.setAttribute("questions", questions);
        request.getRequestDispatcher("index.html").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve user answers
        List<Question> questions = getRandomQuizQuestionsFromDatabase();
        int score = 0;

        for (Question question : questions) {
            String userAnswer = request.getParameter("answer" + question.getId());
            if (userAnswer != null && userAnswer.equalsIgnoreCase(question.getAnswer())) {
                score++;
            }
        }

        // Display the score
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Quiz Result</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Quiz Result</h1>");
        out.println("<p>Your score: " + score + " out of " + questions.size() + "</p>");
        out.println("</body>");
        out.println("</html>");
    }

    private List<Question> getRandomQuizQuestionsFromDatabase() {
        List<Question> questions = new ArrayList<>();

        try (Connection connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword)) {
            String query = "SELECT * FROM quiz_questions ORDER BY RAND() LIMIT 4";
            PreparedStatement statement = connection.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String question = resultSet.getString("question");
                String answer = resultSet.getString("answer");
                questions.add(new Question(id, question, answer,a,b,c,d));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return questions;
    }

    private static class Question {
        private int id;
        private String question;
        private String answer;
        private String a;
        private String b;
        private String c;
        private String d;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getQuestion() {
			return question;
		}
		public void setQuestion(String question) {
			this.question = question;
		}
		public String getAnswer() {
			return answer;
		}
		public void setAnswer(String answer) {
			this.answer = answer;
		}
		public String getA() {
			return a;
		}
		public void setA(String a) {
			this.a = a;
		}
		public String getB() {
			return b;
		}
		public void setB(String b) {
			this.b = b;
		}
		public String getC() {
			return c;
		}
		public void setC(String c) {
			this.c = c;
		}
		public String getD() {
			return d;
		}
		public void setD(String d) {
			this.d = d;
		}

        
    }
}
