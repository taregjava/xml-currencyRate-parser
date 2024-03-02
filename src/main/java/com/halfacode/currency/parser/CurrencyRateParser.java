package com.halfacode.currency.parser;


import com.halfacode.currency.model.CurrencyRate;

import java.util.List;

public interface CurrencyRateParser {

    List<CurrencyRate> parse(String ratesAsString);
}
