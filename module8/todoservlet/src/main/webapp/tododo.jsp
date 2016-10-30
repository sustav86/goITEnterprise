<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %><%--
  Created by IntelliJ IDEA.
  User: SUSTAVOV
  Date: 29.10.2016
  Time: 15:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP example</title>
</head>
<body>
<div id="all">
    <div id="header">
        <div class="container all">
            <div id="logomenu-container">
                <div id="logo"><h1>My plan's</h1></div>
            </div>
        </div>
        <div id="content">
            <div class="container all">
                <h1>My track list</h1>
                <form method="get">
                    <table>
                        <caption></caption>
                        <tr>
                            <th>Name</th>
                            <th>Category</th>
                            <th>Complete</th>
                        </tr>
                        <%
                            Map<Integer, String> taskList = new HashMap<>();
                            final String DIV = "#";
                            int checkId = 0;
                            String checkboxPatternLine = "<td><input type=\"checkbox\" name=\"paramCheck\"></td></tr>\n";
                            String dockType = "<!doctype html public \" -//w3c//dtd html 4.0 transitional//en\">\n";
                            String tablePatternLines = "<tr>\n<td>param0</td>\n<td>param1</td>";

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
                        %>
                    </table>
                    <button formaction="updateList">Update tasks</button>
                    <h2>Task Name</h2><input type=text" name="task_name">

                    <h2>Task Category</h2><input type=text" name="task_category">
                    <button formaction="addList">Add tasks</button>
                </form>
            </div>
        </div>
        <div id="bottom"></div>
    </div>
</div>
</body>
</html>
