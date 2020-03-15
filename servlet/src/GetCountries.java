

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import model.Country;

 
@WebServlet("/GetCountries")
public class GetCountries extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
    public GetCountries() {
    	  
    	 
    }

	 
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//permissions
		response.addHeader("Access-Control-Allow-Origin", "*");
		
		try {
						
			//Model
			Country x = new Country();
			ArrayList<Country> countries = x.GetCountries();
			

			//Add Items
			JSONArray list = new JSONArray();
			for (Country country: countries) {
				
				JSONObject item = new JSONObject();
				item.put("name", country.getName());
				item.put("code", country.getCode());
				
				list.add(item);  
			}
			
			//main root
			JSONObject mainRoot = new JSONObject();
			mainRoot.put("countries",list);
			
			
			response.getWriter().append(mainRoot.toJSONString());
			
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
		
		 
	}

	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		doGet(request, response);
	}
	
 
}
