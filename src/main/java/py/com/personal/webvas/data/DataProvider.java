package py.com.personal.webvas.data;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.apache.tomcat.jdbc.pool.DataSourceFactory;
import org.apache.tomcat.jdbc.pool.PoolConfiguration;
import static py.com.personal.webvas.utils.Constantes.PROJECT_PATH;
import static py.com.personal.webvas.utils.Constantes.RESOURCES_PATH;

/**
 * Proveedor de datos de KML y VAS1. Maneja aspectos de bajo nivel como pool de
 * conexiones.
 *
 * @author ribeirov
 *
 */
public class DataProvider {

    private static DataSource dataSourceKml = null;

    public static void setup() throws FileNotFoundException, IOException {
        if (dataSourceKml == null) {
            dataSourceKml = loadDataSource(PROJECT_PATH + RESOURCES_PATH + "kml.settings"); // TODO parametrizar
        }															// el datasource.
    }

    public static Connection getKmlConnection() throws SQLException {
        return dataSourceKml.getConnection();
    }

    private static DataSource loadDataSource(String file) throws IOException {
        Properties p = new Properties();
        InputStream stream = null;
        try {
            stream = new FileInputStream(file);
        } catch (IOException e) {
            // logger.fatal(String.format("%s=%s|%s",
            // Log.Tag.LOAD_DATA_PROVIDER, file, e.getMessage()));
            // TODO loguear
            throw e;
        }

        p.load(stream);
        PoolConfiguration pc = DataSourceFactory.parsePoolProperties(p);
        DataSource ds = new DataSource();
        ds = new DataSource(pc);

        // logger.info(String.format("%s=%s|%s", Log.Tag.LOAD_DATA_PROVIDER,
        // file, "OK"));
        // TODO loguear
        return ds;
    }
}
