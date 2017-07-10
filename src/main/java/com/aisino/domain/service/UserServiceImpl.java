package com.aisino.domain.service;

import com.aisino.domain.bean.protocol.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

/**
 * DESCRIPTION：implements UserService
 *
 * @author LuckyH
 * @create 2017-07-10 14:13
 **/
@Path("users")
@Consumes({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
@Produces({MediaType.APPLICATION_JSON, MediaType.TEXT_XML})
public class UserServiceImpl implements UserService {
    @POST
    @Path("register")
    @Consumes({MediaType.APPLICATION_JSON})
    public void registerUser(String user) {
        System.out.println("registerUser");
        User user_fix = new User();
        user_fix.setAge("18");
        user_fix.setUsername("18");
        user_fix.setSex("18");
//        user =user_fix;
        System.out.println("registerUser");
    }

    @POST
    @Path("getId")
    @Consumes({MediaType.APPLICATION_JSON})
    public String registerUser() {
        System.out.println("registerUser");
        User user_fix = new User();
        user_fix.setAge("18");
        user_fix.setUsername("18");
        user_fix.setSex("18");
//        user =user_fix;
        System.out.println("registerUser");
        return "22";
    }
}
