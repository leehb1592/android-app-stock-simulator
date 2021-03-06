package edu.uga.cs.cs4060.stocksimulator.Retrofit;
import com.google.firebase.database.IgnoreExtraProperties;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

import edu.uga.cs.cs4060.stocksimulator.StocksInfomations.FiveYearChart;
import edu.uga.cs.cs4060.stocksimulator.StocksInfomations.OneDayChart;
import edu.uga.cs.cs4060.stocksimulator.StocksInfomations.OneMonthChart;
import edu.uga.cs.cs4060.stocksimulator.StocksInfomations.OneYearChart;
import edu.uga.cs.cs4060.stocksimulator.StocksInfomations.Quote;
import edu.uga.cs.cs4060.stocksimulator.StocksInfomations.Symbol;


@IgnoreExtraProperties
public class Stock {
    @SerializedName("quote")
    @Expose
    public Quote quote;

    @SerializedName("chart")
    @Expose
    public List<OneDayChart> oneDayCharts;
    public List<OneMonthChart> oneMonthCharts;
    public List<OneYearChart> oneYearCharts;
    public List<FiveYearChart> fiveYearCharts;

    @SerializedName("symbol")
    @Expose
    public List<Symbol> symbols;
}

