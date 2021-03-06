/*
 * Copyright (c) 2018 Couchbase, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.couchbase.client.java.repository.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import com.couchbase.client.core.annotations.InterfaceStability;

import com.couchbase.client.java.encryption.EncryptionProvider;

/**
 * Annotation for encrypted field
 *
 * @author Subhashni Balakrishnan
 * @since 2.6.0
 */
@InterfaceStability.Uncommitted
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD })
public @interface EncryptedField {

    /**
     * Cryptographic algorithm provider name
     *
     * @return name of the provider
     */
    EncryptionProvider provider();

    /**
     * Encryption key name to be used, else the default key set on the provider will be used.
     *
     * @return encryption key name
     */
    String key() default "";

    /**
     * HMAC key name to be used, else the default HMAC key set on the provider will be used.
     *
     * @return HMAC key name
     */
    String hmac() default "";
}
