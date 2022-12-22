package hw01;

import java.util.ArrayList;
import java.io.File; 
import java.io.FileWriter;
import java.io.IOException;

/**
 * This class will inherit the ArrayList of each Tesla Stocks
 * This Class will contain all elements of stocks
 * This Class will contain methods to read, write, display each stocks */

public class StockList extends ArrayList<TeslaStock>{

	/** Default Constructor*/
	public StockList() {
		super();
	}
	
	/** This method will create a txt file and write all Tesla Stocks in a nicely order*/
	public void printAllStocks() 
	{
		try {
			/** Create File*/
			File file = new File("src//files/all_stock_data.txt");
			/** Create Writer to write file*/
			FileWriter writer = new FileWriter(file);
			/** Use For Loop to write each stocks to the new txt file*/
			for(int n = 0; n < super.size(); n++)
			{
				writer.write(String.valueOf(super.get(n)));
				writer.write("\n");
			}
			/** Close File*/
			writer.flush();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	/** This method will go through and Display the First Ten Stock to the console*/
	public void displayFirstTenStocks()
	{
		System.out.println("\nFIRST TEN STOCKS:");
		for(int n = 0; n < 10;n++)
		{
			System.out.println(super.get(n).toString());
		}
	}
	/** This method will go through and Display the Last Ten Stock to the console*/
	public void displayLastTenStocks()
	{
		System.out.println("LAST TEN STOCKS:\n");
		for(int n = super.size() - 10; n < super.size();n++)
		{
			System.out.println(super.get(n).toString());
		}
	}
	/** This method will get the average openPrice of all Tesla Stocks and display to the console*/
	public double computeAverageOpeningPrice()
	{
		/** Create default double average */
		double average = 0;
		/** Use for loop to add all the open price*/
		for(int n = 0; n < super.size(); n++)
		{
			average += super.get(n).getOpenPrice();
		}
		/** Divide the total average to the size of the array to get the average*/
		average /= super.size();
		/** Return the average*/
		return average;
	}
	/** This method will get the average closePrice of all Tesla Stocks and display to the console*/
	public double computeAverageClosingPrice()
	{
		/** Create default double average */
		double average = 0;
		/** Use for loop to add all the close price*/
		for(int n = 0; n < super.size(); n++)
		{
			average += super.get(n).getClosePrice();
		}
		/** Divide the total average to the size of the array to get the average*/
		average /= super.size();
		/** Return the average*/
		return average;
	}
	/** This method will find the highest price for Tesla Stock*/
	public double findMaxHighPrice()
	{
		/** create default max*/
		double max = 0;
		/** Set the first element of stock to max*/
		max = super.get(0).getHighPrice();
		/** For every next element of Tesla Stocks, if it higher it will replace the max*/
		for(int n = 1; n < super.size();n++)
		{
			if(max < super.get(n).getHighPrice())
			{
				max = super.get(n).getHighPrice();
			}
		}
		/** Return the final max*/
		return max;
	}
	/** This method will find the lowest price for Tesla Stock*/
	public double findMinLowPrice()
	{
		/** create default min*/
		double min = 0;
		/** Set the first element of stock to min*/
		min = super.get(0).getLowPrice();
		/** For every next element of Tesla Stocks, if it lower it will replace the max*/
		for(int n = 1; n < super.size();n++)
		{
			if(min > super.get(n).getLowPrice())
			{
				min = super.get(n).getLowPrice();
			}
		}
		/** Return the final min*/
		return min;
	}

}
