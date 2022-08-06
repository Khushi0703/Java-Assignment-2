//Design a class named Account that contains:•A private int data field namedid for the account (default 0).
//•A private double data field named balance for the account (default 500₹).
//•A  private  double  data  field  named  annualInterestRate  that  stores  the  currentinterest rate (default 7%). Assume all accounts have the same interest rate.
//•A  private  Date  data  field  named  dateCreated  that  stores  the  date  when  theaccount was created.
//•A no-arg constructor that creates a default account.
//•A constructor that creates an account with the specified id and initial balance.•The accessor and mutator methods for id, balance, and annualInterestRate.
//•The accessor method for dateCreated.
//•A method named getMonthlyInterestRate() that returns the monthlyinterest rate.
//•A method named getMonthlyInterest() that returns the monthly interest.•A method named withdraw that withdraws a specified amount from theaccount.
//•A method named deposit that deposits aspecified amount to the account.

//Prepared by Khushi Shah 21CE127

class Account {
    private int id = 0;
    private double balance = 500.0;
    private double annualInterestRate = 7.0;
    private java.util.Date dateCreated;
    public Account() {
    dateCreated = new java.util.Date();
    }
    public Account(int id2, double balance2) {
    id = id2;
    balance = balance2;
    }
    public int getId() {
    return this.id;
    }
    public double getBalance() {
    return this.balance;
    }
    public double getAnnualInterestRate() {

    return annualInterestRate;
    }
    public String getDateCreated() {
    return this.dateCreated.toString();
    }
    public void setId(int id) {
    this.id = id;
    }
    public void setBalance(double balance) {
    this.balance = balance;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
    this.annualInterestRate = annualInterestRate;
    }
    public double getMonthlyInterestRate() {
    return (annualInterestRate / 100) / 12 ;
    }
    public double getMonthlyInterest() {
    return balance * getMonthlyInterestRate();
    }
    public void withdraw(double amount) {
    this.balance -= amount;
    }
    public void deposit(double amount) {
    this.balance += amount;
    }
    }