package net.ddns.dustriel.urlification;

/**
 * Created by ricardo on 08/10/2016.
 */
public class BasicUrlifier implements Urlifier {

    @Override
    public String urlify(String stringToUrlify) {
        return stringToUrlify.trim().replaceAll(" ", "%20");
    }
}
