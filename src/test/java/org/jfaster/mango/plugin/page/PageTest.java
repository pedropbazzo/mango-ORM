/*
 * Copyright 2014 mango.jfaster.org
 *
 * The Mango Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.jfaster.mango.plugin.page;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.*;

/**
 * @author ash
 */
public class PageTest {

  @Test
  public void create() throws Exception {
    Page page = Page.create();
    assertThat(page.getPageNum(), is(0));
    assertThat(page.getPageSize(), is(20));
    assertThat(page.isFetchTotal(), is(false));

    page = Page.create(1, 100);
    assertThat(page.getPageNum(), is(1));
    assertThat(page.getPageSize(), is(100));
    assertThat(page.isFetchTotal(), is(false));

    page = Page.create(2, 200, true);
    assertThat(page.getPageNum(), is(2));
    assertThat(page.getPageSize(), is(200));
    assertThat(page.isFetchTotal(), is(true));

    page = Page.create(true);
    assertThat(page.getPageNum(), is(0));
    assertThat(page.getPageSize(), is(20));
    assertThat(page.isFetchTotal(), is(true));
  }

}