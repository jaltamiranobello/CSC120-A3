public class OneCard {
    String owner;
    double balance;
    int ID;
public OneCard(String person, double money) {
    this.owner = person;
    this.balance = money;
}

public void deposit (double amount){
    this.balance += amount;
}
/**
 * Checks the balance available on this card
 * @param amount Proposed charge
 * @return T/F: does card have this much money?
 */
public boolean canAfford (double amount){
    return this.balance > amount;
}

public void spend (double amount){
    if (!this.canAfford(amount)) {    
        System.out.println("Sorry you don't have enough funds :(");
    }
    else {
        this.balance -= amount;
    }
}
public static void main(String[] args) {

    OneCard myOneCard = new OneCard("Alex",1500.34);
    System.out.println(myOneCard.owner);
    OneCard myFriendcard = new OneCard("Emily", 0.04);
    System.out.println(myFriendcard.balance);
    System.out.println(myOneCard.canAfford(50));
    System.out.println(myFriendcard.canAfford(50));
}

}
