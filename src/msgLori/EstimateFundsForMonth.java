package msgLori;

public class EstimateFundsForMonth   {

	public static void compute() //
	  // computes the estimated funds available for month
	  //
	  {
	
	    try
	    {
		float expectedMonthlyInvestmentReturn = (float) 0.0; // expected monthly investment return
		float expectedTotaMonthlyNetPayments = (float) 0.0; // expected total mortgage payments less total monthly grants
	        float estimatedFunds = (float) 0.0;
	
		Investment  inv = new Investment ();	// investment record
		Mortgage    mort = new Mortgage ();	// mortgage record
	
		expectedMonthlyInvestmentReturn = inv.totalMonthlyReturnOnInvestment ();
		expectedTotaMonthlyNetPayments = mort.totalMonthlyNetPayments ();
	
	        estimatedFunds = (expectedMonthlyInvestmentReturn - (MSGApplication.getAnnualOperatingExpenses () / (float) 12.0) +
	        		expectedTotaMonthlyNetPayments);
	
	        MSGApplication.setEstimatedFundsForMonth(estimatedFunds);
	
	    }
	    catch (Exception e)
	    {
		System.out.println ("***** Error: EstimatedFundsForMonth.compute () *****");
		System.out.println ("\t" + e);
	    }
	
	  }  // compute
}
