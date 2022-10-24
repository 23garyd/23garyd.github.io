---
layout: post
title: 'Google Summer Of Code 2022 Java Setup'
date: 2022-09-10
author: gary ding
cover: '/assets/img/nt3.png'
cover_author: '23garyd'
cover_author_link: '/assets/img/nt3.png'
tags: 
- Java 
- Python 
- FRC
- Linux
pin: true
---

> Google Summer Of Code Java version setup.

### Background

The object detection Java library is based on a OpenCV DepthAI C++ library. It can run on Linux, Windows and OSX platforms. The hardware supports X86_64 and ARM based embedded devices. I used the FRC WPILibrary simulator to test the results of the person detector so that the RoboRIO hardware is not necessary. The detection results will be passed to the simulator or actual RoboRIO by using the FRC WPILibrary NetworkTables components.


![](/assets/img/frc-robo.png)


### Environment

- FRC RoboRIO simulator
- Ubuntu 20.04 on X86_64 
- Oracle Java 8 SDK
- Maven 3.6.3
- DepthAPI driver
- OAK-D camera with USB connected to PC


### Linux Installation

There are some required dependencies that are needed to be compiled and installed in order to simulate the results on a RoboRIO.


- RoboRIO Simulator: Refer to  [this link](https://docs.wpilib.org/en/stable/docs/software/wpilib-tools/robot-simulation/introduction.html) for setup instructions. After a successful installation, the simulator should resemble the following:



![](/assets/img/frc-sim.png)

- JavaCpp for DepthAI: Refer to  [this link](https://github.com/bytedeco/javacpp-presets) for build steps. 
    ```
    cd javacpp-presets
    mvn install --projects .,depthai
    cd javacpp-presets/depthAI/platform
    mvn clean install -Djavacpp.platform.host
    ```
After the above steps are complete, a depthai-platform.jar will be created and installed in the maven repository.


- WPILibrary NetworkTable component
  - Since the version that I used has been removed from the maven repository, manual installation is necessary.  To begin, download the NetworkTables library from [this link](https://first.wpi.edu/FRC/roborio/maven/development/edu/wpi/first/wpilib/networktables/java/NetworkTables/3.1.7-20170802171912-5-gf43675e/NetworkTables-3.1.7-20170802171912-5-gf43675e-desktop.jar).

   - Start a terminal and cd to the path where the jar file was saved. Once complete, run the below command to install this jar to the maven repository.

    ```
    mvn install:install-file -Dfile=./NetworkTables-3.1.7-20170802171912-5-gf43675e-desktop.jar  -DgroupId=edu.wpi.first.wpilib.networktables.java -DartifactId=NetworkTables -Dversion=3.1.7 -Dpackaging=jar

    ```

- java-ironoak install and run
  
    ```
    git clone https://github.com/23garyd/java-ironoak.git
    mvn clean install
    mvn compile exec:java

    ```
Make sure that the Oak-D is connected with the USB 3 port using the original cable. 
From the RoboRIO simulator, the person detector's results have been passed  to the NetworkTables window, and should display the values for when a person has been detected.

![](/assets/img/nt3.png)


## Video Links

Java FRC demo
<iframe type="text/html" width="100%" height="385" src="https://www.youtube.com/embed/Er9NpnCAC9k" frameborder="0"></iframe>