package com.taobao.tddl.executor.function;

import com.taobao.tddl.executor.common.ExecutionContext;
import com.taobao.tddl.optimizer.core.datatype.DataType;
import com.taobao.tddl.optimizer.core.expression.IExtraFunction;

/**
 * 假函数，不能参与任何运算。如果需要实现bdb的运算，需要额外的写实现放到map里，这个的作用就是mysql,直接发送下去的函数
 * 
 * @author Whisper
 */
public class Dummy extends ScalarFunction implements IExtraFunction {

    @Override
    public DataType getReturnType() {
        return DataType.StringType;
    }

    @Override
    public Object compute(Object[] args, ExecutionContext ec) {
        throw new UnsupportedOperationException("该函数还没实现" + this.function.getFunctionName());
    }

    @Override
    public String[] getFunctionNames() {
        return new String[] { "dummy" };
    }

}
