<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

    <%@ taglib uri="/struts-tags" prefix="s" %>
    <s:form>
	    <table>
	    	<tr>
	    		<th>Brand</th>
	    		<th>Color</th>
	    		<th>Wheel Count</th>
	    		<th>Year of Production</th>
	    		<th>Is Diesel Engine?</th>
	    	</tr>
	    	<s:iterator value="carList">
	    		<tr>
	    			<td><s:property value="brand"/></td>
	    			<td><s:property value="color"/></td>
	    			<td><s:property value="wheelCount"/></td>
	    			<td><s:property value="yearOfProduction"/></td>
	    			<td><s:property value="isDieselEngine"/></td>
	    		</tr>
	    	</s:iterator>
	    </table>
	    <s:submit value="Add" action="AddCar"/>
    </s:form>
    