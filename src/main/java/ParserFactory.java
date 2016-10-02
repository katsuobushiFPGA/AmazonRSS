import org.kohsuke.args4j.CmdLineException;
import org.kohsuke.args4j.CmdLineParser;

import com.sun.syndication.feed.synd.SyndFeed;

public class ParserFactory {
    public Tuple2<SyndFeed,Integer> getRSSObj(String[] args) {
        CmdLineOption cmdOpt = new CmdLineOption();
        CmdLineParser cmdParser = new CmdLineParser(cmdOpt);
        try {
            cmdParser.parseArgument(args);
        } catch (CmdLineException e) {
            // TODO 自動生成された catch ブロック
            e.printStackTrace();
        }
        RSSParser rssParser = new RSSParser();
        return new Tuple2<SyndFeed, Integer>(cmdOpt.getRssObj(rssParser),cmdOpt.getOutDest());
    }
}
