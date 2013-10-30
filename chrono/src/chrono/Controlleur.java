package chrono;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Window;

public class Controlleur extends SelectorComposer<Window> {
	
	@Wire
	Button StarEndRace;
	
	@Listen("onClick=#newEvent")
	public void hidden(){
		StarEndRace.setVisible(false);
	}
	

}
