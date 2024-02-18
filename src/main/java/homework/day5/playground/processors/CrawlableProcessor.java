package homework.day5.playground.processors;

import homework.day5.playground.essence.creatures.Crawlable;

import static homework.day5.playground.utils.DirectionGenerator.generateDirection;
import static homework.day5.playground.utils.DistanceGenerator.generateDistance;

public class CrawlableProcessor {
  public void runCrawlable(Crawlable crawlable) {
    crawlable.crawl(generateDirection(), generateDistance());
  }

  public void runCrawlable(Crawlable crawlable, String direction) {
    crawlable.crawl(direction, generateDistance());
  }

  public void runCrawlable(Crawlable crawlable, String direction, int distance) {
    crawlable.crawl(direction, distance);
  }
}
