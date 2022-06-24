package ar.web.crypto.back.service;

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
public class BinanceServiceImpl implements BinanceService{

    @Value("${binance.api}")
    private String binanceApi;
    @Value("${binance.api.key}")
    private String binanceApiKey;
    @Value("${binance.secret.key}")
    private String binanceSecretKey;

    @Override
    public String postCrypto() throws URISyntaxException, IOException {
        List<NameValuePair> parameters = new ArrayList<NameValuePair>();
        parameters.add(new BasicNameValuePair("convert","USD"));
        URIBuilder query = new URIBuilder("https://pro-api.coinmarketcap.com/v1/cryptocurrency/listings/latest");
        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet request = new HttpGet(query.addParameters(parameters).build());
        request.setHeader(HttpHeaders.ACCEPT, "application/json");
        request.addHeader("X-CMC_PRO_API_KEY", binanceApi);
        CloseableHttpResponse response = client.execute(request);
        EntityUtils.consume(response.getEntity());
        String resp = String.valueOf(response.getEntity());
        response.close();
        return resp;
    }

}
