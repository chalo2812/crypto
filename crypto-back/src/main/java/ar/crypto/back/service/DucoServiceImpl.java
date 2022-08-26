package ar.crypto.back.service;

import org.apache.http.HttpHeaders;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

@Service
public class DucoServiceImpl implements DucoService{

    @Value("${duco.api}")
    public String ducoApi;

    public String getBalance(final String nameAccount) throws URISyntaxException, IOException {
        URIBuilder query = new URIBuilder(ducoApi + "/balances/" + nameAccount);
        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet request = new HttpGet(query.build());
        CloseableHttpResponse response = client.execute(request);
        EntityUtils.consume(response.getEntity());
        String resp = String.valueOf(response.getEntity());
        response.close();
        return resp;
    }

}
