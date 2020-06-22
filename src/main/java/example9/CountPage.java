package example9;

import org.apache.wicket.Session;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

public class CountPage extends WebPage {
    private static final long serialVersionUID = 1L;

    public CountPage(final PageParameters parameters) {
        super(parameters);
        add(new CountForm("myCountForm"));
        Session.get().setAttribute("count", 10);
		Session.get().bind();
    }
}