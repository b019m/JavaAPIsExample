import kong.unirest.Unirest;

import java.util.Map;

public class YelpSearch {

    public static void main(String[] args) {
        String yelpURL = "https://api.yelp.com/v3/businesses/search?location=Minneapolis,MN&categories=restaurants";

        String YELP_API_KEY = "nNiXnU1bQfyADH7BhcHqhy-9qukZfhO6za87cmD2uCl4KRQc1WiiJ9QXSxsNARFKP5FT3Srgf5S8ZKRiSwWFZkmRmjEV2M-k1jjiqp45E0XVcqi4uUp-6QoT3z84ZnYx";

        // todo lowest price category
        // todo specify type of restaurant
        Map<String, Object> yelpQuery = Map.of(
                "location", "Minneapolis MN",
                "categories", "restaurants",
                "price", "1");


            YelpResponse response = Unirest
                    .get(yelpURL)
                    .header("Authorization", "Bearer" + YELP_API_KEY)
                    .queryString(yelpQuery)
                    .asObject(YelpResponse.class).getBody();

            System.out.println(response);
            for (Business b : response.businesses) {
                System.out.println(b.name);
                System.out.println(b.rating);
                System.out.println(b.location.address1 + "," +
                        b.location.city);

            }


        }
    }

