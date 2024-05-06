
// Yelp APi response classes to map JSON to Java ob;
public class YelpResponse {
   // field for businesses
   // what type?
   // it will be an array
    public Business[] businesses;


}

class Business {
    // represent one business object
    public String name;
    public double rating;
    public Location location;


    // todo - what about location?
    // street address of the business
}
class Location {
    public String city;
    public String address1;


}
