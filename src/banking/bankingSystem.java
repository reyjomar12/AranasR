package banking;

public class bankingSystem {
    int accountNo = 10001;
    String name;
    float initialBalance = 0;
    int pin = 1234;

    public boolean verifyAccount(int acc, int pn){
        int attempts = 0;
        int maxAttempts = 3;
        
        while (attempts < maxAttempts) {
            if(acc == accountNo && pn == pin){
                return true;
            } else {
                attempts++;
              
                
                if (attempts >= maxAttempts) {
                    System.out.println("Maximum attempts reached. Exiting system...");
                    System.exit(0);
                }
                return false;
            }
        }
        return false;
    }

    public int setAccount(){
        return accountNo;
    }
    
    public void viewBalance(){
    }
}
