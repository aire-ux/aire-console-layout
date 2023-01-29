package io.sunshower.aire.ux.layouts.routes;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.spring.annotation.RouteScope;
import io.sunshower.aire.ux.layouts.ConsoleLayout;

@RouteScope
@Route("aire-console-layout")
public class ConsoleLayoutRoute extends VerticalLayout {

  public ConsoleLayoutRoute() {
    setSizeFull();
    add(new ConsoleLayout());
  }
}
