package IO_ObjectStream;

public class Run {

	public static void main(String[] args) {
//		new ObjectStream().objectSave();
//		new ObjectStream().objectRead();
		ObjectStream objs = new ObjectStream();
		
		objs.objectSave();
		objs.objectRead();
		
	}

}
