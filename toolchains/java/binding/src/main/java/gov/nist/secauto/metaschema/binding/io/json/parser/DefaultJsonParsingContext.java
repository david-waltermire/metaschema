/**
 * Portions of this software was developed by employees of the National Institute
 * of Standards and Technology (NIST), an agency of the Federal Government.
 * Pursuant to title 17 United States Code Section 105, works of NIST employees are
 * not subject to copyright protection in the United States and are considered to
 * be in the public domain. Permission to freely use, copy, modify, and distribute
 * this software and its documentation without fee is hereby granted, provided that
 * this notice and disclaimer of warranty appears in all copies.
 *
 * THE SOFTWARE IS PROVIDED 'AS IS' WITHOUT ANY WARRANTY OF ANY KIND, EITHER
 * EXPRESSED, IMPLIED, OR STATUTORY, INCLUDING, BUT NOT LIMITED TO, ANY WARRANTY
 * THAT THE SOFTWARE WILL CONFORM TO SPECIFICATIONS, ANY IMPLIED WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE, AND FREEDOM FROM
 * INFRINGEMENT, AND ANY WARRANTY THAT THE DOCUMENTATION WILL CONFORM TO THE
 * SOFTWARE, OR ANY WARRANTY THAT THE SOFTWARE WILL BE ERROR FREE. IN NO EVENT
 * SHALL NIST BE LIABLE FOR ANY DAMAGES, INCLUDING, BUT NOT LIMITED TO, DIRECT,
 * INDIRECT, SPECIAL OR CONSEQUENTIAL DAMAGES, ARISING OUT OF, RESULTING FROM, OR
 * IN ANY WAY CONNECTED WITH THIS SOFTWARE, WHETHER OR NOT BASED UPON WARRANTY,
 * CONTRACT, TORT, OR OTHERWISE, WHETHER OR NOT INJURY WAS SUSTAINED BY PERSONS OR
 * PROPERTY OR OTHERWISE, AND WHETHER OR NOT LOSS WAS SUSTAINED FROM, OR AROSE OUT
 * OF THE RESULTS OF, OR USE OF, THE SOFTWARE OR SERVICES PROVIDED HEREUNDER.
 */

package gov.nist.secauto.metaschema.binding.io.json.parser;

import com.fasterxml.jackson.core.JsonParser;

import gov.nist.secauto.metaschema.binding.BindingContext;

import java.util.Objects;

public class DefaultJsonParsingContext implements JsonParsingContext {
  private final BindingContext bindingContext;
  private final JsonParser parser;
  private final JsonProblemHandler problemHandler;

  public DefaultJsonParsingContext(JsonParser parser, BindingContext bindingContext) {
    this(parser, bindingContext, new DefaultJsonProblemHandler());
  }

  public DefaultJsonParsingContext(JsonParser parser, BindingContext bindingContext,
      JsonProblemHandler problemHandler) {
    Objects.requireNonNull(parser, "parser");
    Objects.requireNonNull(bindingContext, "bindingContext");
    Objects.requireNonNull(problemHandler, "problemHandler");
    this.parser = parser;
    this.bindingContext = bindingContext;
    this.problemHandler = problemHandler;
  }

  @Override
  public BindingContext getBindingContext() {
    return bindingContext;
  }

  @Override
  public JsonProblemHandler getProblemHandler() {
    return problemHandler;
  }

  @Override
  public JsonParser getEventReader() {
    return parser;
  }
}
