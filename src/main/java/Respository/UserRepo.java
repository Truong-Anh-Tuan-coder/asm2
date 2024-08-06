package Respository;

import Connection.ConnectionDB;
import Entity.UserEntity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class UserRepo {
	ConnectionDB connectionDB = new ConnectionDB();
	PreparedStatement preparedStatement = null;
	ResultSet resultSet = null;

	StringBuilder sqlquery = null;

	public ArrayList<UserEntity> findAll(){
		ArrayList<UserEntity> userList = null;
		sqlquery = new StringBuilder();
		sqlquery.append("select * ");
		sqlquery.append("from warehouse_user");
		try{
			connectionDB.openConnect();
			this.preparedStatement = this.connectionDB.getConnect().prepareStatement(sqlquery.toString());
			this.resultSet = preparedStatement.executeQuery();
			if(this.resultSet.isBeforeFirst()){
				userList = new ArrayList<>();

			}
		}
	}
}
