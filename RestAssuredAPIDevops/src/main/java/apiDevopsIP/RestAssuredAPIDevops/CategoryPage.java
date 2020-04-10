package apiDevopsIP.RestAssuredAPIDevops;

import java.util.HashMap;
import java.util.Map;

public class CategoryPage {
	
	
	public Map<String, String> buildHeaders() {
		Map<String, String> headers = new HashMap<String, String>();
		headers.put("Content-type", "application/json");
		
		return headers;
		
	}

}
