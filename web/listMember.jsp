<%-- 
    Document   : listMember.jsp
    Created on : May 26, 2025, 9:17:20 PM
    Author     : Nguyen Tien Dat
--%>


<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="DTO.Member" %>
<html>
<head>
    <title>Danh sách Member</title>
</head>
<body>
    <h2>Danh sách Member</h2>
    <table border="1" >
        <tr>
            <th>IDMember</th>
            <th>Password<th>
            <th>Member Name</th>
            <th>Phone</th>
            <th>Email</th>
            <th>Address</th>
            <th>Date of Birth</th>
            <th>Join Date</th>
            <th>ID Coach</th>
            <th>Subscription</th>
            <th>Status</th>
        </tr>

        <%
            List<Member> list = (List<Member>) request.getAttribute("listMembers");
            if (list != null) {
                for (Member m : list) {
        %>
        <tr>
            <td><%= m.getIDMember() %></td>
            <td><%= m.getPassword() %></td>
            <td><%= m.getMemberName() %></td>
            <td><%= m.getPhone() %></td>
            <td><%= m.getEmail() %></td>
            <td><%= m.getAddress() %></td>
            <td><%= m.getDateOfBirth() %></td>
            <td><%= m.getJoinDate() %></td>
            <td><%= m.getIDCoach() %></td>
            <td><%= m.getSubcription()%></td>
            <td><%= m.getStatus() %></td>
        </tr>
        <%
                }
            } else {
        %>
        
        <%
            }
        %>
    </table>
</body>
</html>
