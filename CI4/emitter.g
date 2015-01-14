tree grammar emitter;
options {
language = Java;
output = template;
tokenVocab = buchstabenGrammar;
ASTLabelType = CommonTree;
}
@header {
import java.util.Set;
import java.util.HashSet;
import java.lang.Character;
}
start 	:	line line line line line line;
line	:	