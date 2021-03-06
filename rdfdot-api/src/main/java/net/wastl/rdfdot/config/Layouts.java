/*
 * Copyright 2014 Sebastian Schaffert (wastl@wastl.net)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.wastl.rdfdot.config;

/**
 * Layout directions for the graph
 *
 * @author Sebastian Schaffert (sschaffert@apache.org)
 */
public enum Layouts {
    TOP_DOWN("TB"), LEFT_RIGHT("LR"), RIGHT_LEFT("RL"), BOTTOM_UP("BT");

    private String cfg;

    Layouts(String cfg) {
        this.cfg = cfg;
    }

    @Override
    public String toString() {
        return cfg;
    }
}
