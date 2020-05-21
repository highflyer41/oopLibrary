public interface Loanable {
    
    boolean isLoanable();

    double loanFee();

    Schedule feeSchedule();
    
}