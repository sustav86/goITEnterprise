package timemanagement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by ukr-sustavov on 28.10.2016.
 */
public class TasksServlet extends HttpServlet {
    private static final String DIV = "#";
    private int checkId;
    private String checkboxPatternLine = "<td><input type=\"checkbox\" name=\"paramCheck\"></td></tr>\n";
    private String dockType = "<!doctype html public \" -//w3c//dtd html 4.0 transitional//en\">\n";
    private String tablePatternLines = "<tr>\n<td>param0</td>\n<td>param1</td>";


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getResponse(request, response);

    }

    @SuppressWarnings("unchecked")
    private void getResponse(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();
        String bufferLine = "";

        HttpSession session = request.getSession(true);
        Map<Integer, String> taskList = (Map<Integer, String>) session.getAttribute("taskList");
        if (taskList == null) {
            taskList = new HashMap<>();
        }

        session.setAttribute("taskList", taskList);

        if (request.getRequestURI().contains("updateList")) {
            for (Map.Entry<String, String[]> entry : request.getParameterMap().entrySet()) {
                String[] value = entry.getValue();
                if (value[0].equals("on")) {
                    taskList.remove(Integer.valueOf(entry.getKey()));
                }
            }
        }else if (request.getRequestURI().contains("addList")) {
            if (request.getParameter("task_name") != "" || request.getParameter("task_category") != "") {
                taskList.put(checkId, request.getParameter("task_name") + DIV + request.getParameter("task_category"));
                checkId++;
            }
        }

        for (Map.Entry<Integer, String> entry : taskList.entrySet()) {
            String currentPatternLine = tablePatternLines;
            String currentCheckBoxPatternLine = checkboxPatternLine;
            String line = entry.getValue();
            String[] currentLine = line.split(DIV);
            for (int i = 0; i < currentLine.length; i++) {
                currentPatternLine = currentPatternLine.replaceAll("param"+i, currentLine[i]);
            }
            bufferLine += currentPatternLine + currentCheckBoxPatternLine.replaceAll("paramCheck", String.valueOf(entry.getKey()));
        }

        out.println(dockType +
                "<html>\n" +
                "<head>\n" +
                "<meta http-equiv=\"content-type\" content=\"text/html; charset=windows-1251\">\n" +
                "<title>Html example</title>\n" +
                "<link rel=\"stylesheet\" href=\"css/main.css\">\n" +
                "</head>\n" +
                "<body>\n" +
                "<div id=\"all\">\n" +
                "<div id=\"header\">\n" +
                "<div class=\"container all\">\n" +
                "<div id=\"logomenu-container\">\n" +
                "<div id=\"logo\">\n" +
                "<h1>My plan's</h1>\n" +
                "</div>\n" +
                "</div>\n" +
                "</div>\n" +
                "<div id=\"content\">\n" +
                "<div class=\"container all\">\n" +
                "<h1>My track list</h1>\n" +
                "<form action=\"addList\" method=\"get\">\n" +
                "<table>\n" +
                "<caption></caption>\n" +
                "<tr>\n" +
                "<th>Name</th>\n" +
                "<th>Category</th>\n" +
                "<th>Complete</th>\n" +
                "</tr>\n" +
                bufferLine +
                "</table>" +
                "<button formaction=\"updateList\">Update tasks</button>\n" +
                "<h2>Task Name</h2><input type=\"text\" name=\"task_name\">\n" +
                "<h2>Task Category</h2><input type=\"text\" name=\"task_category\">\n" +
                "<button formaction=\"addList\">Add tasks</button>\n" +
                "</form>\n" +
                "</div>\n" +
                "</div>\n" +
                "<div id=\"bottom\"></div>\n" +
                "</div>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>\n"
        );

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getResponse(request, response);
    }
}
