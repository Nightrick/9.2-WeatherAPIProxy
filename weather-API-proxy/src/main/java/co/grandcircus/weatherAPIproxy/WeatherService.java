package co.grandcircus.weatherAPIproxy;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {
	
	private RestTemplate restTemplate = new RestTemplate(); 
	
	public List<Forecast> getForecast(String latitude, String longitude) {
		String coordinates = latitude + "," + longitude;
		String gridpointUrl = "https://api.weather.gov/points/" + coordinates;
		GridpointResponse gridpointInfo = restTemplate.getForObject(gridpointUrl, GridpointResponse.class);
		
		String forecastUrl = gridpointInfo.getProperties().getForecast();
		
		ForecastResponse forecast = restTemplate.getForObject(forecastUrl, ForecastResponse.class);
		
		return forecast.getProperties().getForecasts();
	}

}
