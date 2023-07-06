package io.delta.flink.table.it.impl;

import io.delta.flink.table.it.suite.DeltaFlinkSqlTestSuite;
import io.delta.flink.utils.extensions.InMemoryCatalogExtension;
import org.apache.flink.table.api.TableEnvironment;
import org.junit.jupiter.api.extension.RegisterExtension;

public class InMemoryCatalogDeltaFlinkSqlTCase extends DeltaFlinkSqlTestSuite {

    @RegisterExtension
    private final InMemoryCatalogExtension catalogExtension = new InMemoryCatalogExtension();

    public void setupDeltaCatalog(TableEnvironment tableEnv) {
        catalogExtension.setupDeltaCatalog(tableEnv);
    }
}
