package com.auberer.compilerdesignlectureproject.ast;

import com.auberer.compilerdesignlectureproject.lexer.TokenType;

import java.util.Set;

public class ASTAssignStmtNode extends ASTNode {
  @Override
  public <T> T accept(ASTVisitor<T> visitor) {
    return visitor.visitAssignStmt(this);
  }

  public static Set<TokenType> getSelectionSet() {
    return ASTAssignExprNode.getSelectionSet();
  }
}
