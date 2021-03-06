/*
 * Copyright 2017 Nitrite author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.dizitart.no2;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Settings to control remove operation in {@link NitriteCollection}.
 *
 * @see NitriteCollection#remove(Filter, RemoveOptions)
 * @author Anindya Chatterjee
 * @since 1.0
 */
@ToString
public class RemoveOptions {

    /**
     * Indicates if only one document will be removed or all of them.
     *
     * @param justOne a value indicating if only one document to remove or all.
     * @return `true` if only one document to remove; otherwise, `false`.
     * */
    @Getter @Setter
    private boolean justOne;
}
