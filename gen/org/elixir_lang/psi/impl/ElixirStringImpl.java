// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi.impl;

import com.ericsson.otp.erlang.OtpErlangObject;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElementVisitor;
import org.elixir_lang.psi.ElixirInterpolatedStringBody;
import org.elixir_lang.psi.ElixirString;
import org.elixir_lang.psi.ElixirVisitor;
import org.jetbrains.annotations.NotNull;

public class ElixirStringImpl extends ASTWrapperPsiElement implements ElixirString {

  public ElixirStringImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ElixirVisitor) ((ElixirVisitor)visitor).visitString(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ElixirInterpolatedStringBody getInterpolatedStringBody() {
    return findNotNullChildByClass(ElixirInterpolatedStringBody.class);
  }

  @NotNull
  public OtpErlangObject quote() {
    return ElixirPsiImplUtil.quote(this);
  }

}
