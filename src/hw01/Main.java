package hw01;

import java.io.File;


public class Main {
	public static void main(String[] args)
	{
		/** Create a StockList Object*/
		StockList stocks = new StockList();
		// The Relative Path of the Telsa File
		File dataFile = new File("src\\files\\tesla_historic_stock_prices.csv");
		
		/** Execute the StockReader method and return all Telsa Stocks to the Stocklist Object*/
		stocks = StockReader.readStockData(dataFile);

		/** Print Min Low Price*/
		System.out.println("Lowest " + stocks.findMinLowPrice());
		
		/** Print Max High Price	*/	
		System.out.println("Highest " + stocks.findMaxHighPrice());
		
		/** Display First Ten Stocks*/
		stocks.displayFirstTenStocks();
		
		/** Display Last Ten Stocks*/
		stocks.displayLastTenStocks();
		
		/** Compute Average Open Price*/
		System.out.println("Average Open Price: " + stocks.computeAverageOpeningPrice());
		
		/**Compute Average Close Price*/
		System.out.println("Average Close Price: " + stocks.computeAverageClosingPrice());
		
		/** Print all Stock*/
		stocks.printAllStocks();
		
	}
}
