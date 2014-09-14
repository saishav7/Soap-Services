

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import au.edu.unsw.sltf.services.SummaryMarketDataResponseDocument.SummaryMarketDataResponse;



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
				System.out.println(eventSetId +" " + targetCurrency);
				String[] params = new String[2];
				params[0] = eventSetId;
				params[1] = targetCurrency;
				WebServiceClient.setInputEventSetId(eventSetId);
				WebServiceClient.setInputTargetCurrency(targetCurrency);
				WebServiceClient.main(null);
				getServletContext().setAttribute("outputEventSetId", WebServiceClient.getOutputEventSetId());
				response.sendRedirect("../SoapServices/home#currency");
		}	else if(request.getParameter("downloadService") != null){
			
			String eventSetId = request.getParameter("downloadEventSetId");
			String[] downloadRequest = new String[2];
			downloadRequest[0] = "download";
			downloadRequest[1] = eventSetId;
			String outputdataSourceURL = ImportDownloadWebServiceClient.main(downloadRequest);
			System.out.println(outputdataSourceURL);
			getServletContext().setAttribute("outputDataSourceURL", outputdataSourceURL);
			response.sendRedirect("../SoapServices/home#import");
			
		}	else if(request.getParameter("importService") != null){
			String[] downloadRequest = new String[5];
			downloadRequest[0] = "import";
			downloadRequest[1] = request.getParameter("sec");
			downloadRequest[2] = request.getParameter("startDate");
			downloadRequest[3] = request.getParameter("endDate");
			downloadRequest[4] = request.getParameter("dataSourceURL");
			
			String outputImportEventSetId = ImportDownloadWebServiceClient.main(downloadRequest);
			getServletContext().setAttribute("outputImportEventSetId", outputImportEventSetId);
			response.sendRedirect("../SoapServices/home#import");
			
		}	else if(request.getParameter("summaryService") != null){
			String[] downloadRequest = new String[1];
			downloadRequest[0] = request.getParameter("summaryEventSetId");
			SummaryMarketDataResponse res = SummaryDataWebServiceClient.main(downloadRequest);
			getServletContext().setAttribute("outputSummaryEventSetId", res.getEventSetId());
			getServletContext().setAttribute("outputSummaryStartDate", res.getStartDate());
			getServletContext().setAttribute("outputSummaryEndDate", res.getEndDate());
			getServletContext().setAttribute("outputSummaryMarketType", res.getMarketType());
			getServletContext().setAttribute("outputSummaryCurrencyCode", res.getCurrencyCode());
			getServletContext().setAttribute("outputSummaryFileSize", res.getFileSize());
			response.sendRedirect("../SoapServices/home#summary");
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
