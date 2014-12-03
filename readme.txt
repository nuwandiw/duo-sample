Running the samples.

Authentication demo.
1.Sign up for a Duo security account from https://signup.duosecurity.com/ and create new integration with the "Web SDK" integration type.
2.In Authenticater.java replace IKEY and SKEY with your Integration key and Secret key.
3.In index.jsp, replace the 'host' value with your Duo Security host.
3.Build the project, deploy in a server and run.

Create user sample.
1.Create new integration with the "Admin API" integration type in Duo security account.
2.In CreateUser.java file replace IKEY, SKEY and host with your Integration key, Secret key and host you got for your Admin API integration.
3.Give a username for the user you are going to create as a main method argument.
4.Run the class and check Duo Security admin panel for the newly created user.
