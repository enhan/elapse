package eu.enhan.elapse.core.process.design;

import com.google.common.collect.ImmutableList;

/**
 * Created with IntelliJ IDEA.
 * User: manu
 * Date: 12/31/12
 * Time: 11:28 AM
 * To change this template use File | Settings | File Templates.
 */
public class SequenceType extends StepTypeToken{

    private final ImmutableList<StepTypeToken> sequence;

    SequenceType(ImmutableList<StepTypeToken> sequence) {
        super(StepType.SEQUENCE);
        this.sequence = sequence;
    }

    public ImmutableList<StepTypeToken> getSequence() {
        return sequence;
    }
}
