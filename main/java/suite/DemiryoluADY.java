package suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import runners.*;

import static org.junit.runners.Suite.*;

@RunWith(Suite.class)
@SuiteClasses({
        LoginRunner.class,
        TicketSearchRunner.class,
        ChooseTicketRunner.class,
//        CargoTransportationRunner.class,
//        TestCalculationRunner.class,
        MainHeaderRunner.class,
        HeaderRunner.class,
        SearchRunners.class
})

public class DemiryoluADY {

}
