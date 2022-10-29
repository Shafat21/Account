public class AutoPolicy {
    private int accountNumber;
    private String makeAndModel;
    private String state;
    // Auto Policy Constructor
    public AutoPolicy(int accountNumber,String makeAndModel,String state)
    {
        this.accountNumber = accountNumber;
        this.makeAndModel = makeAndModel;
        this.state = state;
    }

    // Set Account Number
    public void setAccountNumber(int accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    // Get Account Number
    public int getAccountNumber()
    {
        return accountNumber;
    }

    // Set Make and Model
    public void setMakeAndModel(String makeAndModel)
    {
        this.makeAndModel = makeAndModel;
    }

    // Get Make and Model 
    public String getMakeAndModel()
    {
        return makeAndModel;
    }

    // Set State
    public void setState(String state)
    {
        this.state = state;
    }

    // Get State
    public String getState()
    {
        return state;
    }

    // Validate State return method.
    public boolean isNoFaultState()
    {
        boolean noFaultState;
        switch(getState())
        {
            case "MA":case "NJ":case "NY":case "PA":
                noFaultState = true;
                break;
            default:
                noFaultState = false;
                break;
        }
        return noFaultState;
    }
}
// End class of Auto Policy