/**
 *  Copyright 2012-2016 Gunnar Morling (http://www.gunnarmorling.de/)
 *  and/or other contributors as indicated by the @authors tag. See the
 *  copyright.txt file in the distribution for a full listing of all
 *  contributors.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.mapstruct.ap.internal.model.source;

import java.util.List;
import javax.lang.model.type.TypeMirror;

/**
 * Holding parameters common to the selection process, common to IterableMapping, BeanMapping, PropertyMapping and
 * MapMapping
 *
 * @author Sjaak Derksen
 */
public class SelectionParameters {

    private final List<TypeMirror> qualifiers;
    private final List<String> qualifyingNames;
    private final TypeMirror resultType;

    public SelectionParameters(List<TypeMirror> qualifiers, List<String> qualifyingNames, TypeMirror resultType ) {
        this.qualifiers = qualifiers;
        this.qualifyingNames = qualifyingNames;
        this.resultType = resultType;
    }

    /**
     *
     * @return qualifiers used for further select the appropriate mapping method based on class and name
     */
    public List<TypeMirror> getQualifiers() {
        return qualifiers;
    }

    /**
     *
     * @return qualifyingNames see qualifiers, used in combination with with @Named
     */
    public List<String> getQualifyingNames() {
        return qualifyingNames;
    }

    /**
     *
     * @return resultType used for further select the appropriate mapping method based on resultType (bean mapping)
     * targetType (Iterable- and MapMapping)
     */
    public TypeMirror getResultType() {
        return resultType;
    }


}
