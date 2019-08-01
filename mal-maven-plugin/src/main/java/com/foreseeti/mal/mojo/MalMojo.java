/*
 * Copyright 2019 Foreseeti AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.foreseeti.mal.mojo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugins.annotations.Parameter;
import org.apache.maven.project.MavenProject;

public abstract class MalMojo extends AbstractMojo {
  /** The current Maven project. */
  @Parameter(property = "project", required = true, readonly = true)
  protected MavenProject project;

  /** The main MAL specification to compile. */
  @Parameter(property = "mal.file", required = true)
  protected String file;

  /** Specifies if the code generator should print verbose information. */
  @Parameter(property = "mal.verbose", defaultValue = "false")
  protected boolean verbose;

  /** Specifies if the code generator should print debug information. */
  @Parameter(property = "mal.debug", defaultValue = "false")
  protected boolean debug;
}
