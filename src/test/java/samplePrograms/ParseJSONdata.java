package samplePrograms;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.path.json.JsonPath;

public class ParseJSONdata{

public static void main(String args[]){

    String response="{\n" + //
                "  \"userId\": 1001,\n" + //
                "  \"username\": \"coder_dev\",\n" + //
                "  \"isActive\": true,\n" + //
                "  \"roles\": [\"Admin\", \"User\"],\n" + //
                "  \"profile\": {\n" + //
                "    \"firstName\": \"Alex\",\n" + //
                "    \"lastName\": \"Smith\",\n" + //
                "    \"age\": 28\n" + //
                "  },\n" + //
                "  \"preferences\": {\n" + //
                "    \"theme\": \"dark\",\n" + //
                "    \"notificationsEnabled\": false\n" + //
                "  }\n" + //
                "}\n" + //
                "";

    // 1. Using JsonPath to parse the JSON response
     JsonPath jsonPath = new JsonPath(response);
     String username = jsonPath.getString("username"); 
     System.out.println("Username: " + username); 
     
     String roles = jsonPath.getString("roles");
     System.out.println("Roles: " + roles);

     String [] rolesArray = jsonPath.getString("roles").split(",");
        System.out.println("Roles Array: ");
        for (String role : rolesArray) {
            System.out.println(role.trim());
        }

        String firstName = jsonPath.getString("profile.firstName");
        String lastName = jsonPath.getString("profile.lastName");
        System.out.println("Full Name: " + firstName + " " + lastName);

       
        // 2. Using JSONObject and JSONArray
        JSONObject jsonObject = new JSONObject(response);
        String username2 = jsonObject.getString("username");
        System.out.println("Username (JSONObject): " + username2);

        String firstName2 = jsonObject.getJSONObject("profile").getString("firstName");
        String lastName2 = jsonObject.getJSONObject("profile").getString("lastName");
        System.out.println("Full Name (JSONObject): " + firstName2 + " " + lastName2);

        JSONArray rolesJsonArray = jsonObject.getJSONArray("roles");
        System.out.println("Roles (JSONObject): ");
        for(int i=0; i<rolesJsonArray.length(); i++){
            System.out.println(rolesJsonArray.getString(i));
        }


        

}



}