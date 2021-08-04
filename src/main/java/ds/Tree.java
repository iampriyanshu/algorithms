package ds;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Tree {
    int value;
    Tree left;
    Tree right;

    public Tree(int value){
        this.value = value;
        left = null;
        right = null;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
