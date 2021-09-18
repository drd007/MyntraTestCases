import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class RestAPITestCase {

    //Get all user
    @Test
    public void getAllUser()
    {
given().get("localhost:9090/myntra/users/data").then().statusCode(200).log().all();

    }

    //Register a user

    @Test
    public void registerUser()
    {

        Map<String, Object> map=new HashMap<String,Object>();

        map.put("id","6");
        map.put("name","rahul");
        map.put("lastName","singh");
        map.put("email","rahulsingh@gmail.com");
        map.put("password","sourabh");
        map.put("mobile","9993984456");
        map.put("status","VARIFIED");

        System.out.println(map);

        JSONObject request=new JSONObject(map);

        System.out.println(request);
        System.out.println(request.toJSONString());

        given().
                header("Content-Type", "application/json").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                body(request.toJSONString()).
                when().post("https://localhost:9090/myntra/users/data/").
                then().statusCode(200);

    }




}
