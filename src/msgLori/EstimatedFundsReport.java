package msgLori;

import java.io.*;

public class EstimatedFundsReport
{

  public static void printReport ()
  //
  // computes total funds available for purchasing new mortgages in the current mnonth.
  //
  {
    System.out.println ("Funds available: " + MSGApplication.getEstimatedFundsForMonth());
    UserInterface.pressEnter();
  }  // printReport

}
