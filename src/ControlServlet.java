

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class ControlServlet
 */
@WebServlet(name="ControlServlet",urlPatterns={"/home"})
public class ControlServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ControlServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(request.getParameter("currencyService") != null){
			
				String eventSetId = request.getParameter("eventSetId");
				String targetCurrency = request.getParameter("targetCurrency");
				String outputEventSetId;
				System.out.println(eventSetId +" " + targetCurrency);
				String[] params = new String[2];
				params[0] = eventSetId;
				params[1] = targetCurrency;
				outputEventSetId = WebServiceClient.main(params);
				System.out.println(outputEventSetId);
				getServletContext().setAttribute("outputEventSetId", outputEventSetId);
				response.sendRedirect("../SoapServices/home#currency");
		}
			else{
				request.getRequestDispatcher("homepage.jsp").forward(request, response);
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
