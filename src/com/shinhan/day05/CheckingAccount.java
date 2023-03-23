package com.shinhan.day05;


//상속 = 기존class(변경가능) + 생성자, field, method추가
public class CheckingAccount extends Account {
	
	String cardNo;
	
	CheckingAccount(String accNo, String owner, int balance,String cardNo){
		//private이어도 가능
		super(accNo, owner, balance);  //명시적으로 부모생성자를 호출
		
		//private으로 하면 안됨
//		this.accNo = accNo;
//		this.owner = owner;
//		this.balance = balance;
		this.cardNo = cardNo;
	}
	
	public int pay(String cardNo, int amount) {
		if(this.cardNo.equals(cardNo)) {
			return withdraw(amount);
		}else {
			System.out.println("카드번호 오류");
			return 0;
		}
	}
	
	void test() {
		System.out.println(getAccNo());
		System.out.println(getOwner());
		System.out.println(getBalance());
		
		setAccNo("8888");
		setOwner("홍길동");
		setBalance(5000);
		
		deposit(1);
		withdraw(2);
	}
}
