package m24i;

import org.apache.commons.jexl3.JexlBuilder;
import org.apache.commons.jexl3.JexlContext;
import org.apache.commons.jexl3.JexlEngine;
import org.apache.commons.jexl3.JexlExpression;
import org.apache.commons.jexl3.MapContext;

public class Main {
  
  public static void main(String[] args) {
    JexlEngine jexl = new JexlBuilder().create();
    
    String jexlExp = "{'jp':'JPN', 'us':'USA'}['us'] ?: 'UNKNOWN'";
    JexlExpression e = jexl.createExpression(jexlExp);
    
    JexlContext jc = new MapContext();
    
    Object o = e.evaluate(jc);
    System.out.println(o.toString());
  }

}
