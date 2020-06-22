package example9;

import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.form.Form;
import org.apache.wicket.markup.html.form.TextField;
import org.apache.wicket.model.Model;

public class SearchForm extends Form {
    private TextField inputField;
    private Label message;

    public SearchForm(String id) {
        super(id);

        inputField = new TextField("input", Model.of(""));
        message = new Label("message", Model.of(""));
        message.setEscapeModelStrings(false);

        add(inputField);
        add(message);

    }
    public final void onSubmit() {
        String input = (String)inputField.getDefaultModelObject();
        message.setDefaultModelObject(input);
    }
}
