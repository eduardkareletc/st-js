/**
 *  Copyright 2011 Alexandru Craciun, Eyal Kaspi
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.stjs.javascript.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation can be added on constructors only and it's the equivalent of using "native" keyword on methods, i.e.
 * its code is not generated. This is because the "native" keyword cannot be used on constructor. It's useful when the
 * code already exists in JavaScript or when you want to overload the constructor.
 *
 * @author acraciun
 * @version $Id: $Id
 */
@Target({ ElementType.CONSTRUCTOR, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Native {//

}
