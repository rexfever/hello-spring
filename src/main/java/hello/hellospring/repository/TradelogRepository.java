package hello.hellospring.repository;

import hello.hellospring.domain.Stock;

import java.util.List;

public interface TradelogRepository {

    int[] save(List<Stock> stock);
    Stock getTop5ByInstitutional(Integer today);
    Stock getTop5ByForeiger(Integer today);
    Stock getTop10ByPayment(Integer today);

}
