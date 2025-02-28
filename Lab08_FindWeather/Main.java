import java.net.UnknownHostException;

public class Main {
    public static void main(String[] args) throws UnknownHostException {
        System.out.println("Lab08_FindWeather");
//        try {
//            GetIP getip = new GetIP();
//        } catch (UnknownHostException e) {
//            System.out.println("The URL is invalid");
//        }

        Location location = new Location();
        location.selectLocationMethod();
    }
}

/* Possible Functions:
* selectLocationMethod(); //1. By IP, 2. By City, 3. Exit
* selectLocation(ip, city);
* showLocation(); // println(lat, long, city);
* ChooseWeatherSource(api_key);
* displayWeatherInfo(ChooseWeatherSource(api_key);); //println(temp, weatherDescription, showLocation();)
* showWeatherSource();
* takeFeedback();
* */

/*
Features:
 1. Location Detection
        Implement functionality to determine user location using:
            IP address-based automatic detection
            City name input
        Location data should include:
            Latitude
            Longitude
            City name
 2. Weather Data Integration
        Integrate with multiple weather service providers:
            OpenWeatherMap API
            WeatherStack API
        Each provider should return:
            Temperature (in Celsius)
            Weather conditions
            GetIP information
 3. Caching System
        Implement a caching mechanism that:
            Stores weather data for 10 minutes
            Prevents unnecessary API calls for the same location
        Returns cached data when available
 4. Rate Limiting
        Implement rate limiting that:
            Enforces a 30-second cooldown between requests to the same weather provider
            Automatically switches to an alternative provider when rate limit is reached
            Provides appropriate user feedback about rate limiting
 5. Error Handling
        Implement robust error handling for:
            Network connectivity issues
            API timeout scenarios
            Invalid user input
 6. User Interface
        Create a console-based interface that:
            Provides clear options for location selection method
            Displays weather information in a readable format
            Shows the source of weather data (which provider)
            Includes appropriate feedback messages
 7. Data Model
    Create a weather data model that includes:
        Temperature
        Weather conditions
        GetIP information
        Data source

 Technical Requirements
     Implement asynchronous operations for API calls
     Use HTTP client for API communications
     Handle API authentication using API keys
     Ensure proper separation of concerns in the codebase

 Sample Output
     Select location method: 1. By IP, 2. By City, 3. Exit
     1
     Getting weather data by IP...
     Data retrieved from WeatherStack.
     Weather in Mirpur from WeatherStack: 23° C, Clear
*/