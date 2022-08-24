
<%@page import="java.util.ArrayList,com.model.Product"%>
<html>
<head>

</head>
<body>
These Are the Products you can find in our shop:<br>

<%
 ArrayList<Product> Product_list=(ArrayList<Product>)pageContext.getAttribute("prd_list",pageContext.REQUEST_SCOPE);
 int k=1;
 %>
	 
	 
	    
		
		<table bgColor="PINK">
		<tr><td></td><td>Product Id</td><td>Product Name</td><td>Product Qty</td><td>Product Price</td><td>Required Qty</td></tr>
		<% for(Product i:Product_list)
		 {	
		%>
		
		<tr>
		<td><input type='checkbox' name='Product' value=<%=i.getProductid()%> ></td>
		<td><%=i.getProductid()%></td>
		<td><%=i.getProductname()%></td>
		<td><%=i.getPrice()%></td>
		<td><%=i.getQuantity()%></td>
		<td><input type="text" name=<%="qty"+i.getProductid()%> value="0"></td>
		</tr>
		
		<%} %>
		</table>
		
	
	




</body>
</html>