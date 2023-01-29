import {
  css,
  html,
  HTMLTemplateResult,
  LitElement
} from "lit";

import {ComponentContainer, GoldenLayout, LayoutConfig} from "golden-layout";
import {
  customElement
} from 'lit/decorators/custom-element.js'

import {
 query
} from 'lit/decorators/query.js'
class MyComponent {
  rootElement: HTMLElement;
  private resizeWithContainerAutomatically: boolean;

  constructor(public container: ComponentContainer) {
    this.rootElement = container.element;
    this.rootElement.innerHTML = '<h2>' + 'Component Type: MyComponent' + '</h2>';
    this.resizeWithContainerAutomatically = true;
  }
}
@customElement('aire-console-layout')
export class ConsoleLayout extends LitElement {


  @query('div')
  private element: HTMLDivElement | undefined;
  private config : LayoutConfig = {
    root: {
      type: 'row',
      content: [
        {
          title: 'My Component 1',
          type: 'component',
          componentType: 'MyComponent',
          width: 50,
        },
        {
          title: 'My Component 2',
          type: 'component',
          componentType: 'MyComponent',
        }
      ]
    }
  };

  // language=CSS
  static styles = css`

    div {
      width: 100%;
      height: 100%;
      border: 1px solid blue;
    }
    
  `;

  render(): HTMLTemplateResult {
    return html`
      <div></div>
    `;
  }

  connectedCallback() {
    super.connectedCallback();
    const layout = new GoldenLayout(this.config, this.element!);
    layout.registerComponentFactoryFunction( 'component', function( container, componentState ){
      // container.element.html( '<h2>' + componentState.label + '</h2>' );
      container.element.innerHTML = '<h2>Hello</h2>';
    });
    layout.registerComponentConstructor('MyComponent', ConsoleLayout);

    // layout.loadLayout(ConsoleLayout.config as any);
    // layout.loadLayout(this.config);
    layout.init();
  }

  disconnectedCallback() {
    super.disconnectedCallback();
  }
}
