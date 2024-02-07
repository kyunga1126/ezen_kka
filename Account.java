package objectClass;
//은행계좌 클래스
public class Account {
    //멤버변수(=필드,속성)
	static final String BANKNAMEe="신한은행";
    String accountNo; //계좌번호
    String ownerName; //예금주이름
    int balance; //잔액
    
    //생성자
        /* accountNo=acc
    	   ownerName=own
    	   balance=bal
    	   이런식으로 이름을 바꿔서 명령할수도있음. 
    	  
    멤버변수와 생성자간의 이름을 위에처럼 다르게 하면 상관없지만 만약 이름을 다시 만들기 귀찮다면 this.로 구분가능함. 
    this를 붙여야 멤버변수와 생성자 간의 이름을 구분할수있음. */
    public Account() {
		
	}
    public Account(String accountNo, String ownerName, int balance) {
		this.accountNo = accountNo;
		this.ownerName = ownerName;
		this.balance = balance;
	}

	//예금한다 메서드
    void deposit(int amount) {
    	balance+=amount; // balance= balance+amount;
    }
	
    //인출한다 메서드
    int withdraw(int amount) throws Exception {
    if(balance < amount) {
    	throw new Exception("잔액이 부족합니다.");
       }
    balance-=amount;
    return amount;
   }
    
}
