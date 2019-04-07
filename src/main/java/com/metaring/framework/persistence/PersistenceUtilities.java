/**
 *    Copyright 2019 MetaRing s.r.l.
 * 
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 * 
 *        http://www.apache.org/licenses/LICENSE-2.0
 * 
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.metaring.framework.persistence;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class PersistenceUtilities {

    public static final String getInsertString(Map<String, String> map) {
        StringBuilder sb = new StringBuilder(" (");
        List<String> keys = new ArrayList<>(map.keySet());
        for (String key2 : keys) {
            sb.append(key2).append(", ");
        }
        sb.replace(sb.lastIndexOf(", "), sb.length(), ") VALUES (");
        for (String key2 : keys) {
            try {
                String s = map.get(key2);
                sb.append("'").append(s).append("'");
            }
            catch (Exception e) {
                if (e instanceof NullPointerException) {
                    sb.append("NULL");
                }
                sb.append(Long.parseLong(map.get(key2)));
            }
            sb.append(", ");
        }
        return sb.replace(sb.lastIndexOf(", "), sb.length(), ")").toString();
    }
}