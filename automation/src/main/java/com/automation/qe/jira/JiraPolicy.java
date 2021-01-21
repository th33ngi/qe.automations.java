package com.automation.qe.jira;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface JiraPolicy {
	boolean logTicketReady();
}
