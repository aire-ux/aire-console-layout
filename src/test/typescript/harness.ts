import {
  ConsoleLayout
} from "@aire-ux/aire-console-layout/aire-console-layout";

export default function setup() {


  window.customElements.define(
      'aire-console-layout',
      ConsoleLayout
  );
  Object.defineProperty(window.location, 'href', {
    writable: true,
    value: 'https://localhost'
  });
  // (window as any).chai.use(chaiDomDiff);
}
setup();