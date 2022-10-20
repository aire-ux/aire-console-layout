import "./harness";

import {
  fixture,
  expect, nextFrame,
} from "@open-wc/testing";

import {
  beforeEach,
  describe,
  it,
  vi
} from "vitest";
import {
  ConsoleLayout
} from "@aire-ux/aire-console-layout/aire-console-layout"


import {html} from "lit";


describe('a aire-console-layout', async () => {
  let element: ConsoleLayout;
  beforeEach(async () => {
    element = await fixture(html`
      <aire-console-layout></aire-console-layout>
    `);

    await nextFrame();
  });

  it('should mount the component', () => {
    let elements = document.querySelectorAll('aire-console-layout');
    expect(elements.length).to.equal(1);
  });

});