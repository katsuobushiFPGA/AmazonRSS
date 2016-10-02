import org.kohsuke.args4j.CmdLineException;

import com.sun.syndication.feed.synd.SyndFeed;

public class Main {
    public static void main(String[] args) throws CmdLineException {
        ParserFactory fact = new ParserFactory();
        Tuple2<SyndFeed,Integer> feed = fact.getRSSObj(args);
        RSSFormatter format = new RSSFormatter();
        format.output(feed._1(),feed._2());
    }
}