package service.db;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.InitializingBean;


public class DataSourceConfiguration implements InitializingBean {

	/** Datasource Object */
	private BasicDataSource dataSource = new BasicDataSource();

	/** Defined constant variables to pool connection read from properties file */
	
	private String driverClassName = null;
	private String host;
	private String port;
	private String user;
	private String pass;
	private String sid;
	private int initialSize = 1;
	private int maxActive = 10;

	/*
	 * The maximum number of milliseconds that the pool will wait (when there
	 * are no available connections) for a connection to be returned before
	 * throwing an exception, or -1 to wait indefinitely.
	 */
	private int maxWait = -1; /* default wait indefinitely */

	private int maxIdle = 10;
	
	/*
	 * Flag to remove abandoned connections if they exceed the
	 * removeAbandonedTimout. If set to true a connection is considered
	 * abandoned and eligible for removal if it has been idle longer than the
	 * removeAbandonedTimeout. Setting this to true can recover db connections
	 * from poorly written applications which fail to close a connection.
	 */
	private boolean removeAbandoned = false;
	
	/* Timeout in seconds before an abandoned connection can be removed. */
	private int removeAbandonedTimeout = 300; /* 5 minutes default */

	private boolean poolPreparedStatements = false;
		
	private int maxOpenPreparedStatements = 0;
	
	private long timeBetweenEvictionRunsMillis = 300000;
	
	private int numTestsPerEvictionRun = 6;
	
	private long minEvictableIdleTimeMillis = 1800000;
	
	
	public void setHost(String host) {
		this.host = host;
	}

	public void setPort(String port) {
		this.port = port;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public void setInitialSize(int initialSize) {
		this.initialSize = initialSize;
	}

	public void setMaxActive(int maxActive) {
		this.maxActive = maxActive;
	}

	public void setMaxWait(int maxWait) {
		this.maxWait = maxWait;
	}

	public void setRemoveAbandoned(boolean removeAbandoned) {
		this.removeAbandoned = removeAbandoned;
	}

	public void setRemoveAbandonedTimeout(int removeAbandonedTimeout) {
		this.removeAbandonedTimeout = removeAbandonedTimeout;
	}

	public void afterPropertiesSet() throws Exception {
		/** create DataSource with Pool Connection */
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@//" + host + ":" + port + "/" + sid);
		dataSource.setUsername(user);
	}
	
	public BasicDataSource getDataSource() throws Exception {
		if (null != dataSource) {
			return dataSource;
		} else
			throw new Exception("Datasource not initialized!");
	}

	public boolean isPoolPreparedStatements() {
		return poolPreparedStatements;
	}

	public void setPoolPreparedStatements(boolean poolPreparedStatements) {
		this.poolPreparedStatements = poolPreparedStatements;
	}

	public int getMaxOpenPreparedStatements() {
		return maxOpenPreparedStatements;
	}

	public void setMaxOpenPreparedStatements(int maxOpenPreparedStatements) {
		this.maxOpenPreparedStatements = maxOpenPreparedStatements;
	}

	public long getTimeBetweenEvictionRunsMillis() {
		return timeBetweenEvictionRunsMillis;
	}

	public void setTimeBetweenEvictionRunsMillis(long timeBetweenEvictionRunsMillis) {
		this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
	}

	public int getNumTestsPerEvictionRun() {
		return numTestsPerEvictionRun;
	}

	public void setNumTestsPerEvictionRun(int numTestsPerEvictionRun) {
		this.numTestsPerEvictionRun = numTestsPerEvictionRun;
	}

	public long getMinEvictableIdleTimeMillis() {
		return minEvictableIdleTimeMillis;
	}

	public void setMinEvictableIdleTimeMillis(long minEvictableIdleTimeMillis) {
		this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
	}

	public String getHost() {
		return host;
	}

	public String getPort() {
		return port;
	}

	public String getUser() {
		return user;
	}

	public String getPass() {
		return pass;
	}

	public String getSid() {
		return sid;
	}

	public int getInitialSize() {
		return initialSize;
	}

	public int getMaxActive() {
		return maxActive;
	}

	public int getMaxWait() {
		return maxWait;
	}

	public boolean isRemoveAbandoned() {
		return removeAbandoned;
	}

	public int getRemoveAbandonedTimeout() {
		return removeAbandonedTimeout;
	}

	public void setDataSource(BasicDataSource dataSource) {
		this.dataSource = dataSource;
	}

	public String getDriverClassName() {
		return driverClassName;
	}

	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}

	public int getMaxIdle() {
		return maxIdle;
	}

	public void setMaxIdle(int maxIdle) {
		this.maxIdle = maxIdle;
	}

}
