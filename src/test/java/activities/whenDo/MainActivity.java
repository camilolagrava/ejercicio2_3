package activities.whenDo;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class MainActivity {

    public Button newJobButton = new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
    public Label actualResult = new Label(By.xpath("//android.widget.ListView[@resource-id='com.vrproductiveapps.whendo:id/notesList']/android.view.ViewGroup[last()]//android.widget.TextView"));
}
