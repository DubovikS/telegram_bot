package tbot.net;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by sergei.dubovik on 8/24/2020.
 */
public class HttpClient {

    private static final Client CLIENT = ClientBuilder.newClient();

    public static Response POST(String url, Object data){
        Response res = CLIENT.target(url)
                .request(MediaType.APPLICATION_JSON_PATCH_JSON_TYPE)
                .post(Entity.entity(data, MediaType.APPLICATION_JSON_TYPE));
        res.readEntity(Object.class);
        return res;
    }
}
