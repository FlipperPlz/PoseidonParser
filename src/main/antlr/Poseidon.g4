grammar Poseidon;

poseidonConfig: classDefinitions* | EOF;

classDefinitions: 'class' CLASSNAME classBlock;

classBlock: OPEN_CURLY (~CLOSEBLOCK | classBlock | variableDeclaration)* CLOSEBLOCK SEMICOLON;
variableDeclaration: VARIABLENAME '=' (ARRAY | LITERAL_STRING)*;
//                   ^^^^^^^^^^^^ For some fucking reason this shows up as a CLASSNAME. Fuck this 'language'

WS: [ \t\r\n] -> channel(HIDDEN);
DELIMITED_COMMENT: '/*' .*? '*/' -> skip;
SINGLE_LINE_COMMENT: '//' ~[\r\n]* -> skip;
OPEN_CURLY: '{';
CLOSE_CURLY: '}';
SEMICOLON: ';';
CLOSEBLOCK: '};';
LITERAL_STRING: '"' .*? '"' ;

ARRAY: '{' LITERAL_STRING (',' LITERAL_STRING)* '}' SEMICOLON;


CLASSNAME:
    O_PATCHES | O_MODS | O_DEFS | O_IMAGESETS | O_WIDGETSTYLES | MODULE_ENGINE | MODULE_GAMELIB |
    MODULE_GAME | MODULE_WORLD | MODULE_MISSION | LETTERS+;

O_PATCHES: 'CfgPatches';
O_MODS: 'CfgMods';

O_DEFS: 'defs';
O_IMAGESETS: 'imageSets';
O_WIDGETSTYLES: 'widgetStyles';

MODULE_ENGINE: 'engineScriptModule';
MODULE_GAMELIB: 'gameLibScriptModule';
MODULE_GAME: 'gameScriptModule';
MODULE_WORLD: 'worldScriptModule';
MODULE_MISSION: 'missionScriptModule';

fragment VARIABLENAME: (LETTERS | '[' | ']')+;
fragment LETTERS: [a-zA-Z1-9];