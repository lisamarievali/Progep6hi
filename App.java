package Analytics;

public final class App {

    public static void main(String[] args){
        DelfiLinkScraper scraper = new DelfiLinkScraper("https://www.delfi.ee/");
        scraper.makeWebRequest();
        scraper.extractLinks();

    }
}
