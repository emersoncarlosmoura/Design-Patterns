package designPattern.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import designPattern.solid.dip.MainDip;
import designPattern.solid.isp.MainIsp;
import designPattern.solid.lsp.MainPayment;
import designPattern.solid.ocp.MainOcp;

@RunWith(Suite.class)
@SuiteClasses({
    MainDip.class,
    MainIsp.class,
    MainPayment.class,
    MainOcp.class
})
public class SuiteTest {

}
