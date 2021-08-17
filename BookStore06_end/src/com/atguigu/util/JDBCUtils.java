package com.atguigu.util;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

import javax.sql.DataSource;

import com.alibaba.druid.pool.DruidDataSourceFactory;
/**
 * ��ȡ���Ӻ��ͷ����ӵĹ�����
 * @author Chunsheng Zhang
 *
 */
public class JDBCUtils {
	private static DataSource dataSource;
	
	/**
	 * ThreadLocal
	 * 		get()
	 * 		set()
	 *      remove()
	 */
	private static ThreadLocal<Connection> threadLocal = new ThreadLocal<>();
	
	static {
		try {
			//1����ȡdruip.properties�ļ�
			Properties pro = new Properties();
			pro.load(JDBCUtils.class.getClassLoader().getResourceAsStream("druid.properties"));
			
			//2���������ӳ�
			dataSource = DruidDataSourceFactory.createDataSource(pro);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	//��ȡ����
	public static Connection getConnection() {
		Connection connection = threadLocal.get();
		try {
			if(connection == null) {
				connection = dataSource.getConnection();
				threadLocal.set(connection);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
//	public static Connection getConnection() {
//		Connection connection = null;
//		try {
//			connection = dataSource.getConnection();
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//		return connection;
//	}

	//�ͷ�����
	public static void releaseConnection() {
		Connection connection = threadLocal.get();
		if(connection != null) {
			try {
				connection.close();
				threadLocal.remove();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
//	public static void releaseConnection(Connection connection) {
//		if(connection != null) {
//			try {
//				connection.close();
//			} catch (SQLException e) {
//				e.printStackTrace();
//			}
//		}
//	}
}
