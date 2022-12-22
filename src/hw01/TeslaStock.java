package hw01;

/**
 * This Class will represent each stock data 
 * @author dtnng
 *
 */
public class TeslaStock {
	/**
	 * Create data variables for each stock data */
	private double _openingPrice;
	private double _closingPrice;
	private double _lowPrice;
	private double _highPrice;
	private String _date;
	
	/**
	 * Default Constructor */
	public TeslaStock()
	{
		this._openingPrice = 0;
		this._closingPrice = 0;
		this._lowPrice = 0;
		this._highPrice = 0;
		this._date = null;
	}
	
	/**
	 *  Constructor for each data variables*/
	public TeslaStock(double openPrice,double closePrice,double highPrice, double lowPrice,String date)
	{
		this._openingPrice = openPrice;
		this._closingPrice = closePrice;
		this._lowPrice = lowPrice;
		this._highPrice = highPrice;
		this._date = date;
	}
	/**
	 * Setter Open Price */
	public void setOpenPrice(double p)
	{
		this._openingPrice = p;
	}
	
	/**
	 * Getter Open Price */
	public double getOpenPrice()
	{
		return _openingPrice;
	}
	
	/**
	 * Setter Close Price */
	public void setClosePrice(double p)
	{
		this._closingPrice = p;
	}
	
	/**
	 * Getter Close Price */
	public double getClosePrice()
	{
		return _closingPrice;
	}
	
	/**
	 * Setter High Price */
	public void setHighPrice(double p)
	{
		this._highPrice = p;
	}
	
	/**
	 * Getter High Price */
	public double getHighPrice()
	{
		return _highPrice;
	}
	
	/**
	 * Setter Low Price */
	public void setLowPrice(double p)
	{
		this._lowPrice = p;
	}
	
	/**
	 * Getter Low Price */
	public double getLowPrice()
	{
		return _lowPrice;
	}
	
	/**
	 * Setter Date*/
	public void setDate(String d)
	{
		this._date = d;
	}
	
	/**
	 * Getter Date */
	public String getDate()
	{
		return _date;
	}
	/**
	 * To String Method to display all data variables of each stock element */
	public String toString()
	{
		return "Date\t\t\t" + getDate() 
		+ "\nOpening Price\t\t" + getOpenPrice()
		+ "\nHigh Price\t\t" + getHighPrice()
		+ "\nLow Price\t\t" + getLowPrice()
		+ "\nClosing Price\t\t" + getClosePrice()
		+ "\n";
	}
}
