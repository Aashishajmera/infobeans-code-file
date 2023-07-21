class IciciBank{
    private int bal = 10000;
	
	public void setBal(int bal) {
		this.bal = bal;
	}

	public void balanceInquiry(){
		System.out.println("Your balance is: " +bal);
	}
	
	public void deposite(int amount){
		bal += amount;
		System.out.println("Total balance is: "+bal);
	}
	
	public void withdrawal(int amount){
		if(amount > bal){
			System.out.println("Insufficient balance: ");
		}else{
			bal -= amount; 
			System.out.println("withdrawal success: "+amount);
		}
	}
}

class TestMain{
	public static void main(String[] args) {
        IciciBank obj = new IciciBank();
		obj.balanceInquiry();
		obj.deposite(2000);
		obj.withdrawal(400);
		obj.setBal(20000);
		obj.balanceInquiry();
    }
}