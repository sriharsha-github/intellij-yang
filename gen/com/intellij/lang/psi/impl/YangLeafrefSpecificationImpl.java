// This is a generated file. Not intended for manual editing.
package com.intellij.lang.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static com.intellij.lang.yang.psi.YangTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import com.intellij.lang.psi.*;

public class YangLeafrefSpecificationImpl extends ASTWrapperPsiElement implements YangLeafrefSpecification {

  public YangLeafrefSpecificationImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof YangVisitor) ((YangVisitor)visitor).visitLeafrefSpecification(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public YangPathStmt getPathStmt() {
    return findNotNullChildByClass(YangPathStmt.class);
  }

}