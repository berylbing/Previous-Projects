<%@page import="org.jbpm.api.*,java.io.*,java.io.File"%>
<%
	
	String  name = request.getParameter("name");
	
	System.out.println("../"+ name +".png");
	File f= new File("../WEB-INF/clases/workflow_"+name+".png");
	FileInputStream inputStream =new FileInputStream(f);
	byte[] b = new byte[1024];
	int len = -1;
	while ((len = inputStream.read(b, 0, 1024)) != -1) {
		response.getOutputStream().write(b, 0, len);
	}
%>