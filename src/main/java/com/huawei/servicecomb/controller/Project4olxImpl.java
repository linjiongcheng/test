package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-07-02T13:20:54.903Z")

@RestSchema(schemaId = "project4olx")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Project4olxImpl {

    @Autowired
    private Project4olxDelegate userProject4olxDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProject4olxDelegate.helloworld(name);
    }

}
