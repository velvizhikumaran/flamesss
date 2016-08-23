

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Flamesss
 */
public class Flamesss extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Flamesss() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		String s1=request.getParameter("input1");
		String s2=request.getParameter("input2");
		String ss1=s1;
		String ss2=s2;
		String s3="";
		String s4="flames"; 
		int num=0;
		int a=s1.length();
		int b=s2.length();
		int len1=a;
		int len2=b;
		int c=0;
		int d=s4.length();
		PrintWriter out=response.getWriter();
		out.println("<title>");
		out.println("Relationship of both");
		out.println("</title>");
		
		  if(a==0&&b==0)
		  {
		   
		 out.println("<body><br><br><br><br><br><br><div align='center'><h2 style=color:purple>Please give the names</h2>");
		    }
		   if(a!=0&&b!=0){
					if(a<b){
	                  s1=ss2;
	                  s2=ss1;
	                  a=len2;
	                  b=len1;
					}
				 if(a>=b){
						for(int i=1;i<=a;i++){
							for(int j=1;j<=b;j++){
								if(s1.substring(i-1,i).equals(s2.substring(j-1,j))){
									StringBuffer b1=new StringBuffer(s1);
									StringBuffer b2=new StringBuffer(s2);
									StringBuffer b3=b1.delete(i-1,i);
									StringBuffer b4=b2.delete(j-1,j);
									s1=b3.toString();
									s2=b4.toString();
								    a=s1.length();
									b=s2.length();
									j=0;
									}
							}
						} s3=s1+s2;
					c=s3.length();
					System.out.println(c);
					}for(int s=6;s>1;s--)
					{
						if(c>s)
						 num=c-s;
						 else
						 num=c;
						 while(num>s)
						 {
						   num=num-s;
						 }
						 s4=s4.substring(num,d)+s4.substring(0,num);
						 StringBuffer b1=new StringBuffer(s4);
						 System.out.println(s4);
						 StringBuffer b2=b1.delete(b1.length()-1,b1.length());
						 s4=b2.toString();
						 d--;
						 
					}
		switch(s4)
		  {
		   case "f":out.println("<div align='center'><br><br><br><br><br><br><h2 style=color:purple>Relationship = Friends</h2></body>"); break;
		   case "l":out.println("<div align='center'><br><br><br><br><br><br><h2 style=color:purple>Relationship = Lovers</body></h2>"); break;
		   case "a":out.println("<div align='center'><br><br><br><br><br><br><h2 style=color:purple>Relationship = Affections</body></h2>"); break;
		   case "m":out.println("<div align='center'><br><br><br><br><br><br><h2 style=color:purple>Relationship = Married</body></h2>"); break;
		   case "e":out.println("<div align='center'><br><br><br><br><br><br><h2 style=color:purple>Relationship = Enemy</body></h2>"); break;
		   case "s":out.println("<div align='center'><br><br><br><br><br><br><h2 style=color:purple>Relationship = Brother & Sisters</body></h2>"); break;
		  }
	}
	out.println("</html>");
	
	}
	
}