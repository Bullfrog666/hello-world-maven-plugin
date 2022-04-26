package com.test;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.*;
import org.apache.maven.project.MavenProject;


@Mojo(name = "greet", defaultPhase = LifecyclePhase.PROCESS_RESOURCES)

public final class HelloWorldMojo extends AbstractMojo {

    @Parameter(required = true)
    public String name;

    @Component
    private MavenProject mavenProject;

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info("Hello " + name);
        getLog().info("Version : " + mavenProject.getVersion() + "\nGroupId : " + mavenProject.getGroupId() + "\nArtifactId : " + mavenProject.getArtifactId());
    }
}