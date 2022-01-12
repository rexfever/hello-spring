package hello.hellospring.repository;

import hello.hellospring.domain.Stock;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

import javax.sql.DataSource;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class JdbcTemplateTradelogRepository implements TradelogRepository{

    private final JdbcTemplate jdbcTemplate;

    public JdbcTemplateTradelogRepository(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public int[] save(List<Stock> stocks) {
        String sql = "INSERT INTO TRADE_LOG( LOG_CODE, LOG_DATE, LOG_NAME, LOG_SVOLUME, LOG_BVOLUME, LOG_PSVOLUME, LOG_PBVOLUME, LOG_SPAYENNT, LOG_BPAYMENT, LOG_MARKET, LOG_BUYER) values (?,?,?,?,?,?,?,?,?,?,?)";
        return jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement ps, int i) throws SQLException {
                Stock stock = stocks.get(i);
                ps.setInt(1, stock.getCode());
                ps.setInt(2, stock.getDate());
                ps.setString(3, stock.getName());
                ps.setInt(4, stock.getSvoluem());
                ps.setInt(5, stock.getBvolume());
                ps.setInt(6, stock.getPsvolume());
                ps.setInt(7, stock.getPbvolume());
                ps.setInt(8, stock.getSpayment());
                ps.setInt(9, stock.getBpayment());
                ps.setString(10, stock.getMarket());
                ps.setString(11, stock.getBuyer());
            }

            @Override
            public int getBatchSize() {
                return stocks.size();
            }
        });
    }

    @Override
    public Stock getTop5ByInstitutional(Integer today) {
        return null;
    }

    @Override
    public Stock getTop5ByForeiger(Integer today) {
        return null;
    }

    @Override
    public Stock getTop10ByPayment(Integer today) {
        return null;
    }
}
