---
layout: post
title: 'Eco-Friendly Farm Robot PoC Part 1'
subtitle: 'Introduction'
date: 2021-05-10
categories: tech
author: Gary Ding
cover: '/assets/img/garyding_bk5.jpg'
cover_author: ''
cover_author_link: 'https://unsplash.com/@danielleone'
tags: 
- Java 
- Python 
- Linux
pin: true
---

## Introduction 

Autonomous mobile robots can be incorporated into a variety of applications, ranging from logistics and maintenance, to intelligence gathering and surveillance. The goal of this research is to prototype and demonstrate the autonomous capabilities for a farm environment. 

This project started as a OpenCV sponsored project to promote the low cost Farm robot technologies to help the small farmers to save cost and improve efficiency.  One of the difficulties with robotics is that it usually requires intricate knowledge of hardware level details and expensive sensors in order to even begin developing robotic systems. Whether it's communicating with motor controllers, utilizing servos,interfacing with sensors or implementing hardware acceleration for improved computing, learning robotics often requires graduate level knowledge of these topics with expensive Lidar hardware. This means that some robotics topics and capability can be out of reach for most farm users, due to its steep learning curve and cost. Besides that these robot are not eco-friendly as they consume more energy to achieve even simple work.

This project is aimed to provide solution with low-cost hardware. We are using the Traxxas X-MAXX 1:5 scale RC car as the platform to demonstrate the autonomous features. The autonomous software stack is composed of a Jetson Xavier and a Pixhawk. Interfacing with Pixhawk FC hardware is achieved by means of MAVROS. MAVROS provides a mechanism for opening the serial port for sending and receiving MAVLink packets to and from the Pixhawk. On the Jetson computer this is typically carried out through a Universal Asynchronous Receiver-Transmitter (UART) interface, but can also be accomplished by means of a Universal Serial Bus (USB) to serial converter. At the other end of the communication link, the connection is completed at the Pixhawk’s TELEM2 port, which is intended for this purpose of exchanging MAVLink packets with a companion computer. Setup of this interface requires selecting the appropriate baud rate, or data transfer rate, typically 921,600 bits per second.

![](/assets/img/pixhawk.png)

The steering and throttle were controlled by a Pixhawk flight controller. Sensors include a LiDAR, depth camera, tracking camera, and an IMU. Using existing ROS packages such as Cartographer and TEB planner, we implemented ROS nodes for accomplishing the below tasks.


## Milestones
    1. Design Rover hardware BOM and assembly a few Chassis
    2. Setup Rover software and make a autonomous drive with GNSS RTK
    3. Integrate the data flow framework with ODD person detector
    4. DepthAI Oak-D integration to achieve the OOD person detector
    5. DepthAI Oak-D integration to achieve Obstacle Avoidance

## Research Areas

1. Study the SLAM based on laser rangefinder in outdoor environment
2. Integrate multiple sensors onto an autonomous rover
3. Implement sensory data processing and obstacles avoidance
4. Develop planning algorithms so that the vehicles can react to new obstacles and change their trajectories in real time
5. Verify the functionality of the resulting system in real environment
   
## Video Links

![](/assets/img/farm_rover_team1.jpg)
*Team worked on GPS RTK issues*

![](/assets/img/farm_rover_team2.jpg)
*Team worked on GPS RTK issues*

![](/assets/img/garyding_xmaxx_working.jpg)
*Gary worked on ROS topic to send Mavlink message Pixhawk*

![](/assets/img/garyding_bk3.jpg)
*Tested global planner on Evergreen College*

## Rover Setup
<iframe type="text/html" width="100%" height="385" src="https://www.youtube.com/embed/_r4b08d2SfI" frameborder="0"></iframe>





















