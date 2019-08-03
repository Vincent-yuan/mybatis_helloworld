package cn.vincent.mybatis;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import cn.vincent.vo.User;



public class Demo {

	public static void main(String[] args) throws IOException{
		Reader reader=Resources.getResourceAsReader("mybatis.cfg.xml");
		SqlSessionFactory sqlMapper=new SqlSessionFactoryBuilder().build(reader);
		SqlSession session=sqlMapper.openSession();
		User user=session.selectOne("cn.vincent.vo.UserMapper.selectUser",1);
		System.out.println(user);
	}
}
