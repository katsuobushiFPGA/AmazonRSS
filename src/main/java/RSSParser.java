import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import com.sun.syndication.feed.synd.SyndFeed;
import com.sun.syndication.io.FeedException;
import com.sun.syndication.io.SyndFeedInput;
import com.sun.syndication.io.XmlReader;

public class RSSParser {
      public SyndFeed parse(String url) {
          URL feedUrl = null;
        try {
            feedUrl = new URL(url);
        } catch (MalformedURLException e1) {
            // TODO 自動生成された catch ブロック
            e1.printStackTrace();
            DebugLogger.getInstance().debug("MalformedURLException");
        }
          SyndFeedInput input = new SyndFeedInput();
          SyndFeed feed = null;
        try {
            feed = input.build(new XmlReader(feedUrl));
        } catch (IllegalArgumentException | FeedException | IOException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }
          return feed;
      }
}

