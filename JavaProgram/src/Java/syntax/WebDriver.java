package Java.syntax;

public interface WebDriver {

    void get(String url);     // Rule: browser must open this URL
    String getTitle();        // Rule: browser must return page title

}
