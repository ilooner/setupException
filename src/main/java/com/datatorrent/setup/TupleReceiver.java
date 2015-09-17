/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.datatorrent.setup;

import com.datatorrent.api.Context.OperatorContext;
import com.datatorrent.api.DefaultInputPort;
import com.datatorrent.common.util.BaseOperator;

public class TupleReceiver extends BaseOperator
{
  public final transient DefaultInputPort<Double> input = new DefaultInputPort<Double>() {
    @Override
    public void process(Double t)
    {
    }
  };

  @Override
  public void setup(OperatorContext context)
  {
    throw new RuntimeException("Error");
  }
}
