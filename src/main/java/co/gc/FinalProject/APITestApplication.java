package co.gc.FinalProject;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;

import com.amadeus.Amadeus;
import com.amadeus.Params;
import com.amadeus.exceptions.ResponseException;
import com.amadeus.referenceData.Locations;
import com.amadeus.resources.Location;

@Controller
public class APITestApplication {
//	@Value("${amadeus.key}")
//	String amadeusKey;
//	
//	@Value("${amadeus.secret}")
//	String amadeusSecret;
	
  public static void main(String[] args) throws ResponseException {
		
	//   Building with credentials provided directly
    Amadeus amadeus = Amadeus
    		// "API Key", "Secret Key"
            .builder("f779sN5J95dn7QCitysGumNZLpClSok8", "KVOSJxlMU76in2cn")
            .build();

    Location[] locations = amadeus.referenceData.locations.get(Params
      .with("keyword", "LON")
      .and("subType", Locations.ANY));

    System.out.println(locations);
  }
}