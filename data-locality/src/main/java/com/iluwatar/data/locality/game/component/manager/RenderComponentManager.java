/*
 * The MIT License
 * Copyright © 2014-2019 Ilkka Seppälä
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.iluwatar.data.locality.game.component.manager;

import com.iluwatar.data.locality.game.component.Component;
import com.iluwatar.data.locality.game.component.RenderComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Render component manager for Game.
 */
public class RenderComponentManager {

  private static final Logger LOGGER = LoggerFactory.getLogger(RenderComponentManager.class);

  private static final int MAX_ENTITIES = 10000;

  private final int numEntities;

  private static final Component[] RENDER_COMPONENTS = new RenderComponent[MAX_ENTITIES];

  public RenderComponentManager(int numEntities) {
    this.numEntities = numEntities;
  }

  /**
   * Start render component.
   */
  public void start() {
    LOGGER.info("Start Render Game Component ");
    for (int i = 0; i < numEntities; i++) {
      RENDER_COMPONENTS[i] = new RenderComponent();
    }
  }


  /**
   * render component.
   */
  public void render() {
    LOGGER.info("Update Render Game Component ");
    // Process Render.
    for (int i = 0; i < numEntities; i++) {
      if (RENDER_COMPONENTS.length > i && RENDER_COMPONENTS[i] != null) {
        RENDER_COMPONENTS[i].render();
      }
    }
  }
}
