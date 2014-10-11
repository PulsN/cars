<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ taglib uri="/struts-tags" prefix="s" %>

<s:form>
	<s:hidden name="car.id"/>
	<s:textfield name="car.brand" label="Brand"/>
	<s:textfield name="car.color" label="Color"/>
	<s:textfield name="car.wheelCount" label="Wheel Count"/>
	<s:textfield name="car.yearOfProduction" label="Year of Production"/>
	<s:checkbox name="car.isDieselEngine" label="Is Diesel Engine"/>
	<s:submit value="Save" action="SaveCar"/>
	<s:submit value="Cancel" action="ShowCarList"/>
</s:form>