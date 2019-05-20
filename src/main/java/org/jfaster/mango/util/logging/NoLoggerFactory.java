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

package org.jfaster.mango.util.logging;

/**
 * @author ash
 */
public class NoLoggerFactory extends InternalLoggerFactory  {

  public static final InternalLoggerFactory INSTANCE = new NoLoggerFactory();

  private NoLoggerFactory() {
  }

  @Override
  protected InternalLogger newInstance(String name) {
    return new NoLogger(name);
  }

}
