/**
 * This "BankAccount" class is a simple introduction to
 * methods and variables / fields / private data members. 
 * 
 * @author Raymond Lister
 * @version April 2015; a "static" version for a Lab Test
 */

/*
 * HINT: You should NOT need to memorise much to complete
 *       this skeleton.  The type of the variables
 *       "accountNumber", "accountName" and "balance"
 *       (i.e. int, String and double respectively)
 *       provide useful information.
 */

public class BankAccountStatic
{
  /*
   * The variables follow. These are also
   * called "fields? or ?private data members?.
   */

   private static int accountNumber = 0;
    
   private static String accountName = "no name";

   private static double balance; // eg. 1.27 means $1.27
   
       
   /**
    * ... javadoc comment (if any) has been omitted from this skeleton ... 
    */
    public static int getAccountNumber()       
    {
        return accountNumber;
    }
   
    
   /**
    * ... javadoc comment (if any) has been omitted from this skeleton ...
    */
    public static void setAccountNumber(int accNo)
    {
       accountNumber = accNo;
    }
    
    
   /**
    * ... javadoc comment (if any) has been omitted from this skeleton ...
    */
    public static String getAccountName()
    {
       return accountName;
    }
    
    
   /**
    * ... javadoc comment (if any) has been omitted from this skeleton ... 
    */
    public static void setAccountName(String name)
    {
       accountName = name;
    }
 
    
   /**
    * ... javadoc comment (if any) has been omitted from this skeleton ... 
    */
    public static double getBalance()
    {
        return balance;
    }

    
   /**
    * ... javadoc comment (if any) has been omitted from this skeleton ...
    */
    public static void deposit(double deposit)  
    {
        balance += deposit;
    }

    
   /**
    * @param   amount  To be subtracted from the balance
    *
    * @return  the updated account balance or -1.0 if the withdrawal is refused
    *
    * The withdrawal is refused when the withdrawal would
    * have resulted in a negative balance.
    * 
    * Note: This method "withdraw" has been provided in
    *       its entirety. You do NOT have to make any
    *       changes to it.
    */
    public static double withdraw(double amount)
    {  
       if ( balance >= amount )
       {
          balance = balance - amount;
          return balance;
       }
       else
          return -1.0;
    }
  
} // class BankAccountStatic
