/**
 * Created by Sabab on 4/24/2017.
 */

import java.lang.Object;
import groovy.sql.Sql;

class SQL extends Object {

    def db = [url:'jdbc:hsqldb:mem:testDB', user:'sa', password:'', driver:'org.hsqldb.jdbc.JDBCDriver']
    def sql = Sql.newInstance(db.url, db.user, db.password, db.driver)

    static void main(String[] args) {
        // connect to db
        def sql = Sql.newInstance("jdbc:mysql://localhost:3306/test",
                "root", "secret", "com.mysql.jdbc.Driver")
        // execute a simple query
        sql.eachRow("SELECT 'Connection successful!' "){ row ->
            // print data returned by the query
            println row[0]
        }
        // close the connection
        sql.close()
    }
}
