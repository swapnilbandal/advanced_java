<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date,java.sql.ResultSet,com.app.DAO.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Available Flights</title>
</head>
<body>
<a href="">Search Flight</a>
<jsp:include page="searchFlight.jsp"></jsp:include>
 <h1>Available Flights</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Flight Number</th>
            <th>Departure</th>
            <th>Destination</th>
            <th>Departure Date_Time</th>
            <th>Arrival Date_time</th>
            <th>Book Flight</th>
          
        </tr>
        <% 
        ResultSet rs = null;
        try {
            rs = flightsDAO.displayFlights();
            while(rs.next()) {
                int id = rs.getInt("id");
                String Number = rs.getString("number");
                String Departure = rs.getString("departure");
                String Destination = rs.getString("destination");
                Date DDate_Time = rs.getDate("");
                Date ADate_time = rs.getDate("");
        %>
                <tr>
                    <td><%= id %></td>
                    <td><%= Number %></td>
                    <td><%= Departure %></td>
                    <td><%= Destination %></td>
                    <td><%= DDate_Time %></td>
                    <td><%= ADate_time %></td>
                    <td><a href="booking.jsp">Book</a></td>
                </tr>
        <% 
            }
        } catch(Exception e) {
            e.printStackTrace();
        } 
        
        %>
    </table>
    
</body>
</html>