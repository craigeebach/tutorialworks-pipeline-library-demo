#!/usr/bin/env groovy
package com.cleverbuilder

class GlobalVars {
   static String foo = "bar"
   // refer to this in a pipeline using:
   //
   // import com.cleverbuilder.GlobalVars
   // println GlobalVars.foo

   static final String SLACK_MESSAGE = "Sending Slack Notification"
   static final String EMAIL_MESSAGE = "Sending Email"
}
