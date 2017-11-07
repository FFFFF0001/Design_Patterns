package Composite_Pattern;

public class Client {//组合模式之文件浏览

	public static void main(String[] args) {
		AbstractFile obj1,obj2,obj3,obj4,obj5;
		Folder folder1,folder2,folder3; 
		
		obj1 = new ImageFile("image1");  
	    obj2 = new TextFile("text1");  
	    folder1 = new Folder("folder1");  
	    folder1.add(obj1);  
	    folder1.add(obj2);
	    
	    obj3=new VideoFile("video1");  
	    obj4=new VideoFile("video2");  
	    folder2 = new Folder("folder2");  
	    folder2.add(obj3);  
	    folder2.add(obj4);  
	          
	    obj5=new ImageFile("image2");  
	    folder3 = new Folder("folder3");  
	    folder3.add(folder1);  
	    folder3.add(folder2);  
	    folder3.add(obj5);  
	    
	    folder3.display();
	    }
	}
