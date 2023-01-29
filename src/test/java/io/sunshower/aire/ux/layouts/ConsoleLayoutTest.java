package io.sunshower.aire.ux.layouts;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import com.aire.ux.test.AireTest;
import com.aire.ux.test.Navigate;
import com.aire.ux.test.RouteLocation;
import com.aire.ux.test.Select;
import com.aire.ux.test.ViewTest;
import com.aire.ux.test.spring.EnableSpring;
import io.sunshower.aire.ux.layouts.routes.ConsoleLayoutRoute;
import org.springframework.boot.test.context.SpringBootTest;

@AireTest
@EnableSpring
@RouteLocation(scanPackage = "io.sunshower.aire.ux.layouts.routes")
@SpringBootTest(classes = ConsoleLayoutDemoApplication.class)
class ConsoleLayoutTest {

  @ViewTest
  @Navigate("aire-console-layout")
  void ensureConsoleLayoutHostIsInjectable(@Select ConsoleLayoutRoute ex) {
    assertNotNull(ex);
  }
}
