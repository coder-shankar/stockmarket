package com.shankar.stockdaoimpl;

public class FloorAPI {

	
	private String amount;

    private String stockSymbol;

    private String rate;

    private String contractNo;

    private String quantity;

    private String sellerBroker;

    private String buyerBroker;

    public String getAmount ()
    {
        return amount;
    }

    public void setAmount (String amount)
    {
        this.amount = amount;
    }

    public String getStockSymbol ()
    {
        return stockSymbol;
    }

    public void setStockSymbol (String stockSymbol)
    {
        this.stockSymbol = stockSymbol;
    }

    public String getRate ()
    {
        return rate;
    }

    public void setRate (String rate)
    {
        this.rate = rate;
    }

    public String getContractNo ()
    {
        return contractNo;
    }

    public void setContractNo (String contractNo)
    {
        this.contractNo = contractNo;
    }

    public String getQuantity ()
    {
        return quantity;
    }

    public void setQuantity (String quantity)
    {
        this.quantity = quantity;
    }

    public String getSellerBroker ()
    {
        return sellerBroker;
    }

    public void setSellerBroker (String sellerBroker)
    {
        this.sellerBroker = sellerBroker;
    }

    public String getBuyerBroker ()
    {
        return buyerBroker;
    }

    public void setBuyerBroker (String buyerBroker)
    {
        this.buyerBroker = buyerBroker;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [amount = "+amount+", stockSymbol = "+stockSymbol+", rate = "+rate+", contractNo = "+contractNo+", quantity = "+quantity+", sellerBroker = "+sellerBroker+", buyerBroker = "+buyerBroker+"]";
    }
    
}
