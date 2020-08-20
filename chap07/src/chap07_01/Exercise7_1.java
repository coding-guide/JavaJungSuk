package chap07_01;

class SutdaDeck{
	final int CARD_NUM=20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck(){
		for(int i = 0; i < CARD_NUM;i++) {
			if(i==0 || i==2||i==7) {
				cards[i] = new SutdaCard(i+1,true);
			}else {
				cards[i] = new SutdaCard(i+1,false);
			}
		}
	} //SutdaDeck()
	
// �迭 cards�� ��� ī���� ��ġ�� ���´�. Math.random()���
	protected void shuffle(){
		SutdaCard tmp = new SutdaCard();
		for(int i = 0; i < 50; i++) {
			int index = (int)(Math.random()*20);
			tmp = cards[index];
			cards[index]=cards[0];
			cards[0] = tmp;
		}
	
	} //shuffle()
	
//	�迭 cards���� ������ ��ġ�� SutdaCard�� ��ȯ�Ѵ�. �Ű����� int index
	protected SutdaCard pick(int index) {
		return cards[index];
	}//pick(int index)
	
//	�迭 cards���� ������ ��ġ�� SutdaCard �� ��ȯ�Ѵ�.  Math.random()���
	protected SutdaCard pick() {
		return cards[(int)(Math.random()*CARD_NUM)];
	}//pick()
	
} // class SutdaDeck

class SutdaCard{
	int num;
	boolean isKwang;
	
	public SutdaCard() {
		this(1,true);
	}
	
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	@Override
	public String toString() {
		return num + (isKwang ? "K" : "");
	}
	
} //class SutdaCards

public class Exercise7_1 {

	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		for(int i = 0; i< deck.cards.length; i++)
			System.out.print(deck.cards[i]+",");
		System.out.println();
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		for(int i = 0; i< deck.cards.length; i++)
			System.out.print(deck.cards[i]+",");
		System.out.println();
		System.out.println(deck.pick(0));
	}

}
