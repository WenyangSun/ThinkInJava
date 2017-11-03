package com.ietree.base.generics.tuple;

public class FiveTuple<A, B, C, D, E> extends FourTuple<A, B, C, D>
{
    public final E fifth;

    public FiveTuple(A a, B b, C c, D d, E e)
    {
        super(a, b, c, d);
        fifth = e;
    }

    public String toString()
    {
        return "FourTuple [first=" + first + ", second=" + second + ", third=" + third + ", fourth=" + fourth + ", fifth=" + fifth + "]";
    }
}
