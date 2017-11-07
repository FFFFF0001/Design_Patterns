package Composite_Pattern;

public class VideoFile extends AbstractFile{
	
	private String fileName;
	
	public VideoFile( String element ) {
		
		this.fileName = new String();
		this.fileName = element;
	}

	public void add(AbstractFile element) {	
		
		System.out.println("VideoFile:add"); 
	}

	public void remove(AbstractFile element) {	
		
		 System.out.println("VideoFile:remove");  
	}

	public void display() {
		System.out.println(fileName);  
		System.out.println("VideoFile:display"); 
			
	}
}