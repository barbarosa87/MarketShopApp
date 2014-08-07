package MarketApp.barbarosa.marketshopapp.MarketApp.barbarosa.marketshopapp.NetworkUtilities;

/**
 * Created by ilias.karditsis on 7/8/2014.
 */
public class Links {
    private String serverUrl='37.6.110.14';
    private String loginJSON='login.php';


    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public String getLoginJSON() {
        return loginJSON;
    }

    public void setLoginJSON(String loginJSON) {
        this.loginJSON = loginJSON;
    }
}
