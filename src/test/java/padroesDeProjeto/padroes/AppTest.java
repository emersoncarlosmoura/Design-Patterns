package padroesDeProjeto.padroes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import designPattern.abstractfactory.MainAbstractFactory;
import designPattern.adapter.MainAdapter;
import designPattern.bridge.MainBridge;
import designPattern.builder.MainBuilder;
import designPattern.chainOfResponsability.MainChainOfResponsability;
import designPattern.factory.MainFactory;
import designPattern.solid.dip.MainDip;
import designPattern.solid.isp.MainIsp;
import designPattern.solid.lsp.MainPayment;
import designPattern.solid.ocp.MainOcp;
import junit.framework.TestCase;

@RunWith(Suite.class)
@SuiteClasses({
    MainDip.class,
    MainIsp.class,
    MainPayment.class,
    MainAbstractFactory.class,
    MainFactory.class,
    MainOcp.class,
    MainBuilder.class,
    MainAdapter.class,
    MainBridge.class,
    MainChainOfResponsability.class
})
public class AppTest extends TestCase {

}
