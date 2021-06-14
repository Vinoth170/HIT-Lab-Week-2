package labexercise._2;
import java.awt.*;

//One button occupying the entire frame saying Bye
public class Butt extends Frame {
	public static void main(String[] args) {
		Butt MyBut =new Butt();
	}
	Butt(){
		Button HelloBut=new Button("Hello");
		Button ByeBut=new Button("Bye");
		add(HelloBut);
		add(ByeBut);
		setSize(300,300);
		setVisible(true);
	}
}
