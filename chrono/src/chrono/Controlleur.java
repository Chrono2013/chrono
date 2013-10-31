package chrono;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.*;

public class Controlleur extends SelectorComposer<Window> {
	
	@Wire
	Listbox listboxEvent;
	@Wire
	Listbox listboxCourse;
	@Wire
	Listbox listboxVoiture;
	
	
	@Listen("onSelect=#listboxEvent")
	public void test(){
		System.out.println("1");
	}
	

}
