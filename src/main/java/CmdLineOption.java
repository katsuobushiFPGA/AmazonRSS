import java.util.Arrays;
import java.util.List;

import org.kohsuke.args4j.Option;

import com.sun.syndication.feed.synd.SyndFeed;

public class CmdLineOption {
    @Option(name = "-c", aliases = "--category", required = true, metaVar = "<category>", usage = "Select category.")
    private String ctgryCmd;
    @Option(name = "-o", aliases = "--out", required = true, metaVar = "<output>", usage = "Output destination.\n0 - Console.\n1 - File")
    private int dest;

    private final List<String> category = Arrays.asList(
            "gift-cards",
            "instant-video",
            "mobile-apps",
            "diy",
            "dvd",
            "digital-text",
            "toys",
            "videogames",
            "shoes",
            "jewelry",
            "sports",
            "software",
            "dmusic",
            "hpc",
            "computers",
            "beauty",
            "fashion",
            "baby",
            "pet-supplies",
            "hobby",
            "kitchen",
            "appliances",
            "electronics",
            "office-products",
            "apparel",
            "books",
            "musical-instruments",
            "english-books",
            "industrial",
            "watch",
            "automotive",
            "music",
            "food-beverage"
    );
    private final String baseUrl = "https://www.amazon.co.jp/rss/bestsellers/";
    private boolean validateCmd() {
        if(category.contains(ctgryCmd)) {
            return true;
        }
        else {
            return false;
        }
    }
    public int getOutDest() {
        return dest;
    }
    public SyndFeed getRssObj(RSSParser rss) {
        boolean valRes = validateCmd();
        if(valRes == true) {
            //create bestseller url.
            String url = baseUrl + ctgryCmd;
            return rss.parse(url);
        }
        else {
            DebugLogger.getInstance().debug("Validation Error");
            throw new IllegalArgumentException("Validation Error" + "\n" + ctgryCmd + " is " + "no such element at category.");
        }
    }
}
