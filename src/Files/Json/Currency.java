package Files.Json;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Currency {
    public Currency(String rates, BigDecimal currencyType) {
        this.rates = rates;
        this.currencyType = currencyType;
    }

    private String rates;
    private BigDecimal currencyType;

    public String getRates() {
        return rates;
    }

    public void setRates(String rates) {
        this.rates = rates;
    }

    public BigDecimal getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(BigDecimal currencyType) {
        this.currencyType = currencyType;
    }
}
