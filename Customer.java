public class Customer {
    private int OrderNumber;
    private String Name;
	private String Crust;
    private String Size;
    private String Amount;
    private int Price;

    public Customer(int OrderNumber,String Name,String Crust,String Size,String Amount,int Price) {
        this.OrderNumber = OrderNumber;
        this.Name = Name;
        this.Crust = Crust;
        this.Size = Size;
        this.Amount = Amount;
        this.Price = Price;
    }


    /**
     * @return int return the OrderNumber
     */
    public int getOrderNumber() {
        return OrderNumber;
    }

    /**
     * @paramOrderNumber the OrderNumber to set
     */
    public void setOrderNumber(int OrderNumber) {
        this.OrderNumber = OrderNumber;
    }

    /**
     * @return String return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @paramName the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }
    
    
    /**
     * @return String return the Crust
     */
    public String getCrust() {
		return Crust;
	}

    /**
     * @paramCrust the Crust to set
     */
	public void setCrust(String crust) {
		Crust = crust;
	}


    /**
     * @return String return the Size
     */
    public String getSize() {
        return Size;
    }

    /**
     * @paramSize the Size to set
     */
    public void setSize(String Size) {
        this.Size = Size;
    }

    /**
     * @return String return the Amount
     */
    public String getAmount() {
        return Amount;
    }

    /**
     * @paramAmount the Amount to set
     */
    public void setAmount(String Amount) {
        this.Amount = Amount;
    }

    /**
     * @return int return the Price
     */
    public int getPrice() {
        return Price;
    }

    /**
     * @paramPrice the Price to set
     */
    public void setPrice(int Price) {
        this.Price = Price;
    }

}
