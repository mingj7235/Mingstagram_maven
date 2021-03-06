package com.joshua.mingstagram.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping ("/test/home")
    public String testHome() {
        return "home";
    }

    @GetMapping ("/test/auth/join")
    public String testJoin() {
        return "/auth/join";
    }

//    @GetMapping("/test/user")
//    public @ResponseBody User getUser() {
//        User user = new User();
//        user.setId(1L);
//        user.setUsername("cos");
//        user.setName("홍길동");
//        user.setEmail("cos@nate.com");
//        user.setProfileImage("my.jpg");
//
//        Image img1 = new Image();
//        img1.setId(1L);
//        img1.setCaption("음식 사진");
//        img1.setLocation("food.jpg");
//        img1.setLocation("부산 서면");
//        img1.setUser(user);
//
//        Image img2 = new Image();
//        img2.setId(2L);
//        img2.setCaption("장난감 사진");
//        img2.setLocation("game.jpg");
//        img2.setLocation("서울 강남");
//        img2.setUser(user);
//
//        List<Image> images = new ArrayList<>();
//        images.add(img1);
//        images.add(img2);
//        user.setImages(images);
//
//        return user;
//    }
//
//    @GetMapping("/test/image")
//    public @ResponseBody Image getImage() {
//        User user = new User();
//        user.setId(1L);
//        user.setUsername("cos");
//        user.setName("홍길동");
//        user.setEmail("cos@nate.com");
//        user.setProfileImage("my.jpg");
//
//        Image img1 = new Image();
//        img1.setId(1L);
//        img1.setCaption("음식 사진");
//        img1.setLocation("food.jpg");
//        img1.setLocation("부산 서면");
//        img1.setUser(user);
//
//        return img1;
//    }
//
//    @GetMapping("/test/images")
//    public @ResponseBody List<Image> getImages(){
//        User user = new User();
//        user.setId(1L);
//        user.setUsername("cos");
//        user.setName("홍길동");
//        user.setEmail("cos@nate.com");
//        user.setProfileImage("my.jpg");
//
//        Image img1 = new Image();
//        img1.setId(1L);
//        img1.setCaption("음식 사진");
//        img1.setLocation("food.jpg");
//        img1.setLocation("부산 서면");
//        img1.setUser(user);
//
//        Image img2 = new Image();
//        img2.setId(2L);
//        img2.setCaption("장난감 사진");
//        img2.setLocation("game.jpg");
//        img2.setLocation("서울 강남");
//        img2.setUser(user);
//
//        List<Image> images = new ArrayList<>();
//        images.add(img1);
//        images.add(img2);
//        user.setImages(images);
//
//        return images;
//    }
//
//    @GetMapping("/test/like")
//    public @ResponseBody Likes getLike() {
//        User user = new User();
//        user.setId(1L);
//        user.setUsername("cos");
//        user.setName("홍길동");
//        user.setEmail("cos@nate.com");
//        user.setProfileImage("my.jpg");
//
//        Image img1 = new Image();
//        img1.setId(1L);
//        img1.setCaption("음식 사진");
//        img1.setLocation("food.jpg");
//        img1.setLocation("부산 서면");
//        img1.setUser(user);
//
//        Likes like = new Likes();
//        like.setId(1L);
//        like.setUser(user);
//        like.setImage(img1);
//
//        return like;
//    }
}
