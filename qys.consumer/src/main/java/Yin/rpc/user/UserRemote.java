package Yin.rpc.user;

import java.util.List;

import Yin.rpc.consumer.param.Response;


public interface UserRemote {
	public Response saveUser(User user);
	public Response saveUsers(List<User> userlist);
}
