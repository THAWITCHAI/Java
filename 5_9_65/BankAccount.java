public class BankAccount {
    private int id;
    private String owner;
    private float balance;
    private String signature;
    public BankAccount(int id, String owner, float balance , String signature){
        this.id = id;
        this.owner = owner;
        this.balance = balance;
        this.signature = signature;
    }

    public void info(){
        System.out.println("Account ID: "+id+"-"+"has"+balance+" USD.");
    }

    public void withdraw(float money, String pincode) {
        if(balance>=money){
            balance = balance - money;
            System.out.println("withdraw "+money+ " done");
        }else{
            System.out.println("money not enough.");
        }
    }

    public void deposit(float money) {
        System.out.println("deposit "+money+ " done");
    }
}

// class vip extends BankAccount{
//     public vip(int id, String owner, float balance, String signature) {
//         super(id, owner, balance, signature);
//     }

//     @Override
//     public void deposit() {
//         // TODO Auto-generated method stub
//         super.deposit();
//     }
//     @Override
//     public void withdraw() {
//         // TODO Auto-generated method stub
//         super.withdraw();
//     }
// }