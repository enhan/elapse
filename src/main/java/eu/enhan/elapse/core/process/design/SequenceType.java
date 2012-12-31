package eu.enhan.elapse.core.process.design;

import com.google.common.collect.ImmutableList;

/**
 * Created with IntelliJ IDEA.
 * User: manu
 * Date: 12/31/12
 * Time: 11:28 AM
 * To change this template use File | Settings | File Templates.
 */
public class SequenceType {

    private final ImmutableList<StepTypeToken> sequence;

    SequenceType(ImmutableList<StepTypeToken> sequence) {
        this.sequence = sequence;
    }

    public ImmutableList<StepTypeToken> getSequence() {
        return sequence;
    }
}
