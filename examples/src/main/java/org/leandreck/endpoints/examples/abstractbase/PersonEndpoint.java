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
package org.leandreck.endpoints.examples.abstractbase;

import org.leandreck.endpoints.annotations.TypeScriptEndpoint;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@TypeScriptEndpoint
@RestController
@RequestMapping("/persons")
public class PersonEndpoint extends BaseEndpoint<Person> implements Clearable {

    @RequestMapping(value = "/{id}/neighbours", method = GET, produces = APPLICATION_JSON_VALUE)
    public List<Person> neighbours(@PathVariable String id) {
        // do something
        return Collections.emptyList();
    }

    @Override
    public void delete(String id) {
        //void
    }

    @Override
    public int clearAll() {
        return 0;
    }

    @Override
    public void move(String id, String cityId) {
        //void
    }
}
