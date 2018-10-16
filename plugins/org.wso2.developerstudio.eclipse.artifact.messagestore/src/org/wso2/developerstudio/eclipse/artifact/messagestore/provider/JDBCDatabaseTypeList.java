package org.wso2.developerstudio.eclipse.artifact.messagestore.provider;

import java.util.ArrayList;
import java.util.List;

import org.wso2.developerstudio.eclipse.artifact.messagestore.Constants;
import org.wso2.developerstudio.eclipse.platform.core.model.AbstractListDataProvider;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;

/**
 * Message-store JDBC pre-configured database type data provider class
 */
public class JDBCDatabaseTypeList extends AbstractListDataProvider {
    
    @Override
    public List<ListData> getListData(String modelProperty, ProjectDataModel model) {
        List<ListData> list = new ArrayList<ListData>();
        list.add(createListData(Constants.TXT_JDBC_DATABASE_TYPE_OTHER, JDBCDatabaseType.OTHER));
        list.add(createListData(Constants.TXT_JDBC_DATABASE_TYPE_MYSQL, JDBCDatabaseType.MYSQL));
        list.add(createListData(Constants.TXT_JDBC_DATABASE_TYPE_ORACLE, JDBCDatabaseType.ORACLE));
        list.add(createListData(Constants.TXT_JDBC_DATABASE_TYPE_MSSQL, JDBCDatabaseType.MSSQL));
        list.add(createListData(Constants.TXT_JDBC_DATABASE_TYPE_POSTGRESQL, JDBCDatabaseType.POSTGRESQL));
        return list;
    }
    
    /**
     * Message store pre-configured database type
     *
     */
    public enum JDBCDatabaseType {
        OTHER,
        MYSQL,
        ORACLE,
        MSSQL,
        POSTGRESQL
    }

}
