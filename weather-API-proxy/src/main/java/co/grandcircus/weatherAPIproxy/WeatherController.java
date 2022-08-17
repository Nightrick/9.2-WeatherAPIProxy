package co.grandcircus.weatherAPIproxy;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {
	
	@Autowired
	WeatherService service; 
	
	@GetMapping("/forecast")
	public List<Forecast> getForecast(String latitude, String longitude){
		return service.getForecast(latitude, longitude);
	}

}
