package wiremock;

import com.github.tomakehurst.wiremock.WireMockServer;
import com.github.tomakehurst.wiremock.common.ConsoleNotifier;
import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import com.github.tomakehurst.wiremock.extension.responsetemplating.ResponseTemplateTransformer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import util.helpers.PropertiesHelper;
import util.helpers.TestDataHelper;

public class WireMockApplication {

    private static final Logger log = LoggerFactory.getLogger(WireMockApplication.class);

    public static void main(String[] args) {
        String testPropertiesFile = TestDataHelper.getTestPropertiesFile();
        String wireMockFilesDir = "src/main/resources";
        boolean wireMockLogging = PropertiesHelper.getProperty(testPropertiesFile, "wiremock.logging").equals("true");
        int port = Integer.parseInt(PropertiesHelper.getProperty(testPropertiesFile, "wiremock.port"));

        WireMockConfiguration options = new WireMockConfiguration();
        options.port(port);
        options.usingFilesUnderDirectory(wireMockFilesDir);
        options.notifier(new ConsoleNotifier(wireMockLogging));
        options.extensions(new ResponseTemplateTransformer(true));
        options.enableBrowserProxying(true);

        WireMockServer wireMockServer = new WireMockServer(options);
        wireMockServer.start();

        log.info("WireMock Sever: " + wireMockServer.baseUrl());
    }
}
