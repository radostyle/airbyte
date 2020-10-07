/*
 * MIT License
 *
 * Copyright (c) 2020 Airbyte
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package io.airbyte.integrations.base;

import java.nio.file.Path;

public class JavaBaseConstants {

  public static String ENV_DESTINATION_CLASS = "DESTINATION_CLASS";
  public static String ENV_DESTINATION_JAR_PATH = "DESTINATION_JAR_PATH";

  public static String ARGS_CONFIG_KEY = "config";
  public static String ARGS_SCHEMA_KEY = "schema";
  public static String ARGS_STATE_KEY = "state";

  public static String ARGS_CONFIG_DESC = "path to the json configuration file";
  public static String ARGS_SCHEMA_DESC = "input path for the schema";
  public static String ARGS_PATH_DESC = "path to the json-encoded state file";

  // todo (cgardens) - this mount path should be passed in by the worker and read as an arg or
  // environment variable by the runner.
  public static Path LOCAL_MOUNT = Path.of("/local");

}
