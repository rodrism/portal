package br.com.rodrism.portal.config;


/*
@Configuration
@EnableCassandraRepositories
public class CassandraConfig extends AbstractCassandraConfiguration{

	private static final String keyspace = "";
	private static final String contactPoints = "192.168.0.17";
	private static final String datacenter = "Cassandra";
			
	@Qualifier
	@Primary
	@Bean
    public CassandraCqlSessionFactoryBean cluster() {
        CassandraCqlSessionFactoryBean bean = new CassandraCqlSessionFactoryBean();
        bean.setKeyspaceCreations(getKeyspaceCreations());
        bean.setContactPoints(contactPoints);
        bean.setLocalDatacenter(datacenter);
        return bean;
    }
	
	
	
	public static String getDatacenter() {
		return datacenter;
	}



	public SchemaAction getSchemaAction() {
        return SchemaAction.CREATE_IF_NOT_EXISTS;
    }
	
	@Override
	protected String getKeyspaceName() {
		return keyspace;
	}
	
	public static String getKeyspace() {
		return keyspace;
	}

	public static String getContactpoints() {
		return contactPoints;
	}
	


}

*/