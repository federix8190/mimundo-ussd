package py.com.personal.webvas.mimundoussd;

import java.util.TimeZone;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import java.util.List;
import py.com.personal.webvas.data.ApiRestAccess;
import py.com.personal.webvas.data.DataProvider;
import py.com.personal.webvas.smppcs.ussd.AbstractUssdSession;
import py.com.personal.webvas.smppcs.ussd.UssdDispatcher;
import py.com.personal.webvas.ussd.USSDSession;
import static py.com.personal.webvas.utils.Constantes.PROJECT_PATH;
import static py.com.personal.webvas.utils.Constantes.RESOURCES_PATH;
import py.com.personal.webvas.utils.EasyConfiguration;
import py.com.personal.webvas.utils.EasyConfiguration.ConfigurationSource;

public class MiMundo {

    protected static final Logger logger = LoggerFactory
            .getLogger(MiMundo.class);
    
    static {
        try {
            LoggerContext context = (LoggerContext) LoggerFactory
                    .getILoggerFactory();
            JoranConfigurator jc = new JoranConfigurator();
            jc.setContext(context);
            context.reset();
            jc.doConfigure("logback.xml");
        } catch (Exception e) {

        }
    }

    public static void main(String[] args) throws Exception {
        
        /*ApiRestAccess apiRest = new ApiRestAccess();
        if (apiRest != null) {
            List<String> resp = apiRest.getFacturas("6739851");
            System.err.println("Response : " + resp);
            return;
        }*/
        
        EasyConfiguration.mapConfigurableProperties(ConfigurationSource.FILE,
                PROJECT_PATH + RESOURCES_PATH + "applicationProperties.xml", 
                MiMundoConfiguration.instance);

        TimeZone.setDefault(TimeZone
                .getTimeZone(MiMundoConfiguration.instance._timezone));

        DataProvider.setup();

        System.setProperty("sun.net.client.defaultReadTimeout", "19000");

        start(args);
    }

    private static boolean consoleMode;

    public static boolean getConsoleMode() {
        return MiMundo.consoleMode;
    }

    private static void startServiceAsUssdServer() throws Exception {
        consoleMode = false;

        MiMundoConfiguration mmc = MiMundoConfiguration.instance;

        if (!mmc._ussdSystemId.equals("")) {
            UssdDispatcher ussdDispatcher = new UssdDispatcher(
                    MiMundoConfiguration.instance._ussdHost,
                    MiMundoConfiguration.instance._ussdPort,
                    MiMundoConfiguration.instance._ussdSystemId,
                    MiMundoConfiguration.instance._ussdPassword, 120000) {

                @Override
                public AbstractUssdSession createNetworkInitiatedSessionInstace(
                        String msisdn) {
                    return new USSDSession(msisdn);
                }
            };
            ussdDispatcher.start();

            logger.info(String.format("Dispatcher ussd systemId=%s,host=%s,port=%s",
                    mmc._ussdSystemId, mmc._ussdHost, mmc._ussdPort));
        }

        if (!mmc._ussdSystemId_1.equals("")) {
            UssdDispatcher ussdDispatcher_1 = new UssdDispatcher(
                    MiMundoConfiguration.instance._ussdHost_1,
                    MiMundoConfiguration.instance._ussdPort_1,
                    MiMundoConfiguration.instance._ussdSystemId_1,
                    MiMundoConfiguration.instance._ussdPassword_1, 120000) {

                @Override
                public AbstractUssdSession createNetworkInitiatedSessionInstace(
                        String msisdn) {
                    return new USSDSession(msisdn);
                }
            };
            ussdDispatcher_1.start();

            logger.info(String.format("Dispatcher ussd systemId=%s,host=%s,port=%s",
                    mmc._ussdSystemId_1, mmc._ussdHost_1, mmc._ussdPort_1));
        }

        if (!mmc._ussdSystemId_2.equals("")) {
            UssdDispatcher ussdDispatcher_2 = new UssdDispatcher(
                    MiMundoConfiguration.instance._ussdHost_2,
                    MiMundoConfiguration.instance._ussdPort_2,
                    MiMundoConfiguration.instance._ussdSystemId_2,
                    MiMundoConfiguration.instance._ussdPassword_2, 120000) {

                @Override
                public AbstractUssdSession createNetworkInitiatedSessionInstace(
                        String msisdn) {
                    return new USSDSession(msisdn);
                }
            };
            ussdDispatcher_2.start();

            logger.info(String.format("Dispatcher ussd systemId=%s,host=%s,port=%s",
                    mmc._ussdSystemId_2, mmc._ussdHost_2, mmc._ussdPort_2));
        }

        if (!mmc._ussdSystemId_3.equals("")) {
            UssdDispatcher ussdDispatcher_3 = new UssdDispatcher(
                    MiMundoConfiguration.instance._ussdHost_3,
                    MiMundoConfiguration.instance._ussdPort_3,
                    MiMundoConfiguration.instance._ussdSystemId_3,
                    MiMundoConfiguration.instance._ussdPassword_3, 120000) {

                @Override
                public AbstractUssdSession createNetworkInitiatedSessionInstace(
                        String msisdn) {
                    return new USSDSession(msisdn);
                }
            };
            ussdDispatcher_3.start();

            logger.info(String.format("Dispatcher ussd systemId=%s,host=%s,port=%s",
                    mmc._ussdSystemId_3, mmc._ussdHost_3, mmc._ussdPort_3));
        }
    }

    public static void start(String[] args) throws Exception {
        if (args.length == 0) {
            startServiceAsUssdServer();
        } else {
            String msisdn = args[0];

            if (msisdn != null) {
                startServiceAsConsole(msisdn);
            } else {
                System.out.println("Verifique los parametros en modo consola");
            }
        }
    }

    private static void startServiceAsConsole(String msisdn) throws Exception {
        System.out.println("Iniciando servicio en modo consola:" + msisdn);
        consoleMode = true;
        USSDSession session = new USSDSession(msisdn);
        session.menuPrincipal();
    }
}
