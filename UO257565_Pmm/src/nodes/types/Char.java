package nodes.types;

import nodes.ASTNode;
import nodes.Type;

public class Char implements Type {

        private int line;
        private int column;

        @Override
        public int getLine() {
        return line;
    }

        @Override
        public int getColumn() {
        return column;
    }
}
