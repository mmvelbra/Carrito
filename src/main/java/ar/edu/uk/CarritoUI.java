package ar.edu.uk;

import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.GAEVaadinServlet;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Button.ClickEvent;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

@Theme("carrito")
@SuppressWarnings("serial")
public class CarritoUI extends UI {
	@WebServlet(value = "/*", asyncSupported = true)
	@VaadinServletConfiguration(productionMode = false, ui = CarritoUI.class, widgetset = "ar.edu.uk.CarritoWidgetSet")
	public static class Servlet extends GAEVaadinServlet {
	}

	@Override
	protected void init(final VaadinRequest request) {
		final VerticalLayout layout = new VerticalLayout();
		layout.setMargin(true);
		setContent(layout);

		final Button button = new Button("Click Me");
		button.addClickListener(new Button.ClickListener() {
			@Override
			public void buttonClick(final ClickEvent event) {
				layout.addComponent(new Label("Thank you for clicking"));
			}
		});
		layout.addComponent(button);
	}

}
