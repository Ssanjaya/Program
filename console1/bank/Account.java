class Account {
    private final String firstName;
    private final String lastName;
    private double balance;
    private static int cid = 17230000 ;
    private final String phoneNumber;
    private final String password;
    private final int id;





    public Account(String firstName, String lastName, String phoneNumber, String password  ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.balance = 0.0;
        cid++;
        this.id = cid;

    }

    public String getPassword() {
        return password;
    }

    public String getFirstName(){
        return this.firstName + "";
    }
    public String getLastName(){
        return this.lastName + "";
    }
    public double getBalance(){
        return this.balance;
    }
    public void setBalance(double newBalance) {
        this.balance = newBalance;
    }
    public int getID(){
        return this.id;
    }
    public String getPhoneNumber(){
        return this.phoneNumber + "";
    }

    public void depositMoney(double depositAmount){
        this.balance += depositAmount;
        System.out.println("You have deposit " +depositAmount +" to your account." + "\n" +
                "Balance is now: " +this.balance);
    }

    public void withdrawal(double withdrawalAmount){
        if(this.balance < withdrawalAmount) {
            System.out.println("You don't have enough funds.");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("You have withdrawal " +withdrawalAmount + " from your account." + "\n" +
                    "Balance is now: " +this.balance);
        }
    }

    public void moneyTransfer(Account thisAccount, Account toAccount, double amountToTransfer){
        if(thisAccount.getBalance() > 0) {
            toAccount.setBalance(toAccount.balance += amountToTransfer);
            thisAccount.setBalance(this.balance -= amountToTransfer);
        } else {
            System.out.println("You don't have enough funds");
        }
    }



        public String toString () {
        return "Name: " + getFirstName() + "\n" +
                "Last name: " + getLastName() + "\n" +
                "Balance: " + getBalance() + "\n" +
                "ID: " + getID();
    }
    }




