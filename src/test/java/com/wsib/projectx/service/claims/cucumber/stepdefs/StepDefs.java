package com.wsib.projectx.service.claims.cucumber.stepdefs;

import com.wsib.projectx.service.claims.ProjectXClaimsServiceApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = ProjectXClaimsServiceApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
