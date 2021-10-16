package day3assignment;

public class Desktop extends Computer
{
	public void desktopSize() {
		System.out.println("Print the desktopsize");
	}

	public static void main(String[] args) {
		
		Desktop desk=new Desktop();
		desk.desktopSize();
		desk.computerModel();
	}

}
