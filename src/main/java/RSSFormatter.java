import com.sun.syndication.feed.synd.SyndEntry;
import com.sun.syndication.feed.synd.SyndFeed;

public class RSSFormatter {
    public void output(SyndFeed feed, int dest) {
        if(dest == OUT.CONSOLE.getId()) {
            for(Object obj: feed.getEntries()) {
                SyndEntry entry = (SyndEntry) obj;
                System.out.println(entry.getTitle());
            }
        }
        else {
            //TODO: FILE出力の実装
            DebugLogger.getInstance().debug("Not implements yet.");
        }
    }
}
