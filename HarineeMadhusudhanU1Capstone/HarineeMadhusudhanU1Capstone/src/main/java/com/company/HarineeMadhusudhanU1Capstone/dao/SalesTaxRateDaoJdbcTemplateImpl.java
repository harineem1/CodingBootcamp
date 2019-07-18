package com.company.HarineeMadhusudhanU1Capstone.dao;

import com.company.HarineeMadhusudhanU1Capstone.dto.SalesTaxRate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class SalesTaxRateDaoJdbcTemplateImpl implements SalesTaxRateDao {

        private JdbcTemplate jdbcTemplate;

        private static final String SELECT_SALES_TAX_RATE_SQL_BY_STATE =
                       " select * from salesTaxRate where state = ? ";

        public SalesTaxRateDaoJdbcTemplateImpl(JdbcTemplate jdbcTemplate) {
                this.jdbcTemplate = jdbcTemplate;
        }

        @Override
        public SalesTaxRate getSalesTaxByState(String state) {


                try {
                        return jdbcTemplate.queryForObject(SELECT_SALES_TAX_RATE_SQL_BY_STATE, this::mapRowToSalesTaxRate, state);
                } catch (EmptyResultDataAccessException e) {
                        // if there is no match for this album id, return null
                        return null;
                }

        }



          private SalesTaxRate mapRowToSalesTaxRate(ResultSet rs, int rowNum) throws SQLException {
                SalesTaxRate salesTaxRate = new SalesTaxRate();
                salesTaxRate.setState(rs.getString("state"));
                salesTaxRate.setRate(rs.getBigDecimal("rate"));
                return salesTaxRate;
        }
}

