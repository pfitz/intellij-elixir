// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi;

import com.ericsson.otp.erlang.OtpErlangObject;
import com.intellij.psi.PsiElement;
import org.elixir_lang.psi.call.Call;
import org.elixir_lang.psi.operation.Prefix;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public interface ElixirUnmatchedUnaryNonNumericOperation extends ElixirUnmatchedExpression, Call, Prefix {

  @NotNull
  ElixirUnaryPrefixOperator getUnaryPrefixOperator();

  @Nullable
  ElixirUnmatchedExpression getUnmatchedExpression();

  @Nullable
  String functionName();

  @NotNull
  PsiElement functionNameElement();

  @Nullable
  ElixirDoBlock getDoBlock();

  boolean isCalling(String resolvedModuleName, String resolvedFunctionName);

  boolean isCalling(String resolvedModuleName, String resolvedFunctionName, int resolvedFinalArity);

  boolean isCallingMacro(String resolvedModuleName, String resolvedFunctionName, int resolvedFinalArity);

  @Nullable
  String moduleName();

  @NotNull
  Quotable operand();

  @NotNull
  Operator operator();

  @NotNull
  PsiElement[] primaryArguments();

  @Nullable
  Integer primaryArity();

  @NotNull
  OtpErlangObject quote();

  @Nullable
  PsiElement[] secondaryArguments();

  @Nullable
  Integer secondaryArity();

  @NotNull
  int resolvedFinalArity();

  @NotNull
  String resolvedFunctionName();

  @NotNull
  String resolvedModuleName();

  @Nullable
  Integer resolvedPrimaryArity();

  @Nullable
  Integer resolvedSecondaryArity();

}
