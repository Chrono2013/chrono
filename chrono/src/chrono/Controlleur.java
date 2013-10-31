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
	@Wire
	Button StartEndRace;
	
	
	@Listen("onSelect=#listboxEvent;onSelect=#listboxCourse;onSelect=#listboxVoiture")
	public void testEvent(){
		if(listboxEvent.getSelectedItem() != null &&
				listboxCourse.getSelectedItem() != null &&
				listboxVoiture.getSelectedItem() != null){
			StartEndRace.setDisabled(false);
		}
		else{
			StartEndRace.setDisabled(true);
		}
	}
	

}
