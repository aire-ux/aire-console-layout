package io.sunshower.aire.ux.layouts;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.spring.annotation.EnableVaadin;
import io.sunshower.aire.ux.layouts.routes.ConsoleLayoutRoute;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@PWA(name = "ConsoleLayout Demo", shortName = "Demo")
@ComponentScan(basePackageClasses = ConsoleLayoutRoute.class)
@EnableVaadin({"io.sunshower.aire.ux.layouts.routes"})
public class ConsoleLayoutDemoApplication extends VerticalLayout implements AppShellConfigurator {

  public static void main(String[] args) {
    SpringApplication.run(ConsoleLayoutDemoApplication.class, args);
  }
}
