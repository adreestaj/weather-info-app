# weather-info-app

## Problem Statement


Write a RESTful web service which talks to a 3rd party weather service and caches data for 2 hours.  
It exposes APIs to get weather by city, country and by polar coordinates.  
Write a Sprint Boot application with embedded tomcat to expose the APIs. The codebase should be a Maven project.  
Provide the documentation for each web service with following information:  
URL, Method, Parameters.  
Integrate the following 3rd party weather service to fetch weather information:   
URL:  
api.openweathermap.org/data/2.5/weather?q={city name}&appid=ffa6f13ea40a22452bba3be726315d3f  
Params:  
q= city name and country code divided by comma, use ISO 3166 country codes  
URL:  
api.openweathermap.org/data/2.5/weather?lat={lat}&lon={lon}&appid=ffa6f13ea40a22452bba3be726315d3f  
Params:  
lat, lon coordinates of the location of your interest  

## Setup And Build  
1- Import the project as a maven project.  
2- Clean and build the project through maven.  
3- Install Redis server on your local machine.  
4- Start tomcat and deploy your project.  
Now Project is up and runing.  

## Technologies Used  
1- Spring Boot  
2- Feign Client  
3- Redis Cache 
4- Lambok  

## Testing End Point & Request Response.

### Get weather by city Name
	 
URL:	{{Domain}}/readWeatherByCityName

HttpMethod:	GET

Query Param(s):	cityName=lahore,586

HttpStatusCode:	200

Response Body:	{"statusCode":"200","message":null,"data":{"coord":{"lon":74.34,"lat":31.55},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03d"}],"base":"stations","main":{"temp":304.75,"feels_like":300.14,"temp_min":304.15,"temp_max":305.15,"pressure":1012,"humidity":29},"visibility":7000,"wind":{"speed":7.2,"deg":350},"clouds":{"all":40},"dt":1586514578,"sys":{"type":1,"id":7585,"country":"PK","sunrise":1586479189,"sunset":1586525253},"timezone":18000,"id":1172451,"name":"Lahore","cod":200}}

### Get weather by polar coordinates

URL	{{Domain}}/readWeatherByLatLong

HttpMethod:	GET

Query Param(s):	lat=31.55&lon=74.34

HttpStatusCode:	200

Response Body	:{"statusCode":"200","message":null,"data":{"coord":{"lon":74.34,"lat":31.55},"weather":[{"id":802,"main":"Clouds","description":"scattered clouds","icon":"03d"}],"base":"stations","main":{"temp":304.75,"feels_like":300.14,"temp_min":304.15,"temp_max":305.15,"pressure":1012,"humidity":29},"visibility":7000,"wind":{"speed":7.2,"deg":350},"clouds":{"all":40},"dt":1586514578,"sys":{"type":1,"id":7585,"country":"PK","sunrise":1586479189,"sunset":1586525253},"timezone":18000,"id":1172451,"name":"Lahore","cod":200}}


