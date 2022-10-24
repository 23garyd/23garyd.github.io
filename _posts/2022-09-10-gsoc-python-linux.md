---
layout: post
title: 'Google Summer Of Code 2022 Python Setup'
date: 2022-09-10
author: gary ding
cover: '/assets/img/streamlit2.png'
cover_author: '23garyd'
cover_author_link: '/assets/img/streamlit1.png'
tags: 
- Java 
- Python 
- FRC
- Linux
pin: true
---

> Google Summer Of Code Python version setup.

### Background

The object detection Python library is based on a OpenCV DepthAI python library. It can run on Linux, Windows and OSX platforms. The hardware supports X86_64 and ARM based embedded devices. I used the FRC WPILibrary simulator to test the results of the person detector so that the RoboRIO hardware is not necessary. The detection results will be passed to the simulator or actual RoboRIO by using the FRC WPILibrary NetworkTables components. In addition, I also used Streamlit to create a web-based user interface to adjust various parameters and inputs for the person detector.


### Environment

- FRC RoboRIO simulator
- Streamlit
- Ubuntu 20.04 on X86_64 
- Python 3.6+
- DepthAPI driver
- OAK-D camera with USB connected to PC


### Linux Installation



There are some required dependencies that are needed to be compiled and installed in order to simulate the results on a RoboRIO.


- RoboRio Simulator: Refer [this link](https://docs.wpilib.org/en/stable/docs/software/wpilib-tools/robot-simulation/introduction.html) for setup instructions. After a successful installation, the desktop should show a simulator like this. 


- Streamlit: Refer this link](https://docs.streamlit.io/library/get-started/installation) for installation.


![](/assets/img/frc-sim.png)

- DepthAI for Ubuntu, Refer to [this link](https://docs.luxonis.com/projects/api/en/latest/install/#ubuntu)) for installation. 
   ```
    git clone https://github.com/luxonis/depthai-python.git
    cd depthai-python/examples
    python3 install_requirements.py
     
    ```
Before starting the program with streamlit, it is important to check to make sure that driver has been installed correctly.

- Python-ironoak install and run
  
    ```
    git clone https://github.com/23garyd/python-ironoak.git
    streamlit persondetector_ui_combo.py

    ```
Make sure the OAK-D is connected with the USB 3 port with the original cable. After starting the program with streamlit, the detection results should appear on the RoboRIO simulator in real time.

![](/assets/img/streamlit1.png)

From the RoboRIO simulator, the detection results appear at the bottom of the NetworkTables window, in the row SmartDashboard. The values will update as the position of the detected person moves.

![](/assets/img/nt3.png)

## Video Links

Python FRC demo
<iframe type="text/html" width="100%" height="385" src="https://www.youtube.com/embed/kZoewUklqjo" frameborder="0"></iframe>