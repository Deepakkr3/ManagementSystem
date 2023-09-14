package com.manegment.geekstrTest;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class Beans {

    public List<User> getUser()
    {

        return new ArrayList<>();
    }
}
