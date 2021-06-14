import com.jayway.restassured.response.Response;
import org.json.JSONException;
import org.junit.Test;

import static com.jayway.restassured.RestAssured.given;
import static org.junit.Assert.assertEquals;

    public class ApiForMavenTest {

        @Test
        public void testFirst() throws JSONException {

            Response resp = given().header("User-Agent", "Jmeter").get("https://pn.com.ua/ct/1232/?fo=693");
            assertEquals(200, resp.statusCode());
        }

        @Test
        public void testSecond() throws JSONException {

            Response resp = given().header("User-Agent", "Jmeter").get("https://pn.com.ua/ct/1232/?fo=693-918");
            assertEquals(200, resp.statusCode());
        }

        @Test
        public void testThird() throws JSONException {

            Response resp = given().header("User-Agent", "Jmeter").get("https://pn.com.ua/ct/1003/?fo=79-282-623");
            assertEquals(200, resp.statusCode());
        }

        @Test
        public void testFourth() throws JSONException {

            Response resp = given().header("User-Agent", "Jmeter").get("https://pn.com.ua/ct/1047/?fo=417-436-671-832");
            assertEquals(200, resp.statusCode());
        }
}
