package is.hi.hbv202g.ass9.compositeLeafObservedByComposite;

import java.util.ArrayList;
import java.util.List;

public class PlusComposite implements MathExpression, Observer {

    private List<MathExpression> list = new ArrayList<>();

    public int getResult() {
        int result = 0;
        for (MathExpression mathExpression : list) {
            result += mathExpression.getResult();
        }
        return result;
    }

    public void add(MathExpression mathExpression) {
        list.add(mathExpression);
    }

    private int lastObservedResult;

    public void update() {
        lastObservedResult = getResult();

        System.out.println("Last observed result: " + lastObservedResult);
    }

    public int getLastObservedResult() {
        return lastObservedResult;
    }
}
