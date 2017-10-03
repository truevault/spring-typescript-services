/**
 * Copyright © 2016 Mathias Kowalzik (Mathias.Kowalzik@leandreck.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.leandreck.endpoints.processor.model;

/**
 * A class with minimal string utilities.
 */
public class StringUtil {
	/**
	 * Returns the first defined value from the list of items, or
	 * null if no value is defined.
	 * @param items
	 * @return
	 */
	public static String definedValue(String ... items) {
		for (String item : items) {
			if (item != null && !item.isEmpty()) {
				return item;
			}
		}

		return null;
	}

}
