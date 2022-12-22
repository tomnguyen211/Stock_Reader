package hw01;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/** 
 * This class will take a file and read through all the data and store it to the StockList*/
public class StockReader {

	/** Default Constructor */
	private StockReader()
	{
		super();
	}	
	/**
	 *  This method will take a File and read through all data
	 *  It will read each line of data as an element and store everything to the StockList
	 *  */
	public static StockList readStockData(File dataFile)
	{
		try {
			/** Create an ArrayList of stockList to start storing Tesla Stock*/
			StockList stockList = new StockList();
			/** Read the Data from the File*/
			Scanner scan = new Scanner(dataFile);
			/**Skip First Line*/
			scan.nextLine();
			/** Create a String to read next line*/
			String line = scan.nextLine();	
			/** Loop condition to make sure there is a next line */
			while(line != null) {
				/** Store 5 array of elements Date, Open, High, Low, Close by a comma*/
				String[] tokens = line.split(",");
				/** Create a single Tesla Stock to start storing*/
				TeslaStock stock = new TeslaStock();
				/** Use Loop to go through a single line of Tesla Stock*/
				for(int i = 0; i < tokens.length; i++) {
					/** Get the String of each element in a single line of Tesla*/
					String token = tokens[i];	
					if(i == 0) {
						stock.setDate(token);
					} 
					else if(i == 1) {
						stock.setOpenPrice(Double.parseDouble(token));
					}
					else if(i == 2)
					{
						stock.setHighPrice(Double.parseDouble(token));
					}
					else if( i == 3)
					{
						stock.setLowPrice(Double.parseDouble(token));
					}
					else if(i == 4)
					{
						stock.setClosePrice(Double.parseDouble(token));
					}
				}	
				/** Add 5 elements to one array of stockList*/
				stockList.add(stock);		
				/** Check if there is next line, if not return null to exit while loop*/
				if (scan.hasNextLine()) {
					line = scan.nextLine();
				} else {
					line = null;
				}
			}
			/** Close the reader*/
			scan.close();	
			/** return the stockList*/
			return stockList;	
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		} catch(IllegalArgumentException e)
		{
			System.out.println("Incorrect File Datatype!");
			return null;
		}
		
	}
}
