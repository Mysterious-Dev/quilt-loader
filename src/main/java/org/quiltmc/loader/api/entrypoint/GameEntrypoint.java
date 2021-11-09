/*
 * Copyright 2016 FabricMC
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

package org.quiltmc.loader.api.entrypoint;

import org.jetbrains.annotations.ApiStatus;

/** Marker interface for quilt entrypoints. Generally only entrypoint interfaces should extend this - and then only for
 * entrypoints that might want to migrate to a different sort later on!*/
@ApiStatus.NonExtendable
public interface GameEntrypoint {

}
