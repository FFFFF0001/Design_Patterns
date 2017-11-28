package Iterator_Pattern;

public interface TVIterator {
	//抽象迭代器类TVIterator（电视机遥控器类）
	void setChannel( int i );
	void next();
	void previous();
	boolean isLast();
	boolean isFirst();
	Object currentChannel();


}