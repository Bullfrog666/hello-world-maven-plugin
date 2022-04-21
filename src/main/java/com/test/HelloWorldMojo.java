package com.test;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "greet")
public final class HelloWorldMojo extends AbstractMojo {

    @Parameter(required = true)
    public String name;

    Package mainPackage = HelloWorldMojo.class.getPackage();
    String version = mainPackage.getImplementationVersion();
    String groupId = mainPackage.getName();
    String artifactId = mainPackage.getImplementationTitle();


    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("Hello " + name);
        getLog().info("Version : " + version + "\nGroupId : " + groupId + "\nArtifactId : " + artifactId);
    }
}