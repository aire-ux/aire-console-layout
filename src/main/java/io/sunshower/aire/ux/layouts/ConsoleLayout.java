package io.sunshower.aire.ux.layouts;

import com.vaadin.flow.component.HtmlContainer;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.JsModule;

@Tag("aire-console-layout")
@JsModule(Paths.ConsoleLayout_SOURCE)
@CssImport(Paths.ConsoleLayout_STYLES)
@CssImport("golden-layout/dist/css/goldenlayout-base.css")
//@CssImport("golden-layout/dist/css/themes/goldenlayout-light-theme.css")
@CssImport("golden-layout/dist/css/themes/goldenlayout-dark-theme.css")

/** uncomment this if you have deployed this component into NPMJS */
// @NpmPackage(value = "@${organzation}/@aire-console-layout", version =
// Versions.ConsoleLayout_VERSION)
public class ConsoleLayout extends HtmlContainer {

  public ConsoleLayout() {
  }
}
