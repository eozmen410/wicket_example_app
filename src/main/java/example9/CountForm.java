package example9;

import org.apache.wicket.Session;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Button;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.model.Model;

public class CountForm extends Form {

    private Label countLabel;

    public CountForm(String id) {
        super(id);

        countLabel = new Label("countLabel", Model.of(""));
        countLabel.setDefaultModelObject(Session.get().getAttribute("count"));
        add(countLabel);

        add(new Button("increase"){
            public void onSubmit() {
                Session.get().setAttribute("count", (int) Session.get().getAttribute("count")+1);
                countLabel.setDefaultModelObject(Session.get().getAttribute("count"));

            }
        });
        Button decrease = new Button("decrease"){
            public void onSubmit() {
                Session.get().setAttribute("count", (int) Session.get().getAttribute("count")-1);
                countLabel.setDefaultModelObject(Session.get().getAttribute("count"));

            }
        };
        decrease.setDefaultFormProcessing(false);
        add(decrease);
    }
}
