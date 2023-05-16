package simpleController;

public class CalcMVC {
    //... Create model, view, and controller.  They are
    //    created once here and passed to the parts that
    //    need them so there is only one copy of each.
	//https://stackoverflow.com/questions/5831388/what-is-the-controller-in-java-swing
    public static void main(String[] args) {

        CalcModel      model      = new CalcModel();
        CalcView       view       = new CalcView(model);
        CalcController controller = new CalcController(model, view);

        view.setVisible(true);
    }
}