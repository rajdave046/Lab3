public class Main {

    public static void main(String[] args) {
        String store = WebScraper.urlToString("http://erdani.com/tdpl/hamlet.txt");
        String[] content = store.split("\\s+");
        System.out.println(content.length);
    }
}

