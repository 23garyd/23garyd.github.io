---
layout: post
title: 'Eco-Friendly Farm Robot PoC Part 2'
subtitle: 'Setup Rover Software and Make an Autonomous Drive with GNSS/RTK Systems '
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

## Navigation 

Agricultural robots are widely used nowadays to provide people with an alternative solution to conduct repetitive and high-risk operations in many indoor and outdoor agricultural environments. However, the ability of agricultural robots to navigate or move autonomously has always been a challenge due to the complexity of agricultural environments, especially the Global Positioning System (GPS)-denied environment. Localization, mapping, path planning and obstacle avoidance are the essential capabilities for robots to navigate from the starting point to the destination autonomously and successfully. Among them, localizing accurately and generating a globally consistent map of the surroundings in real-time are critical tasks to improve the performance of agricultural robots. Therefore, it is crucial to propose an efficient and accurate real-time localization and mapping method to meet the needs of autonomous navigation in agricultural environments

SLAM is concerned with the problem of building a map of an unknown environment by a mobile robot while at the same time localizing the robot relative to the map. SLAM consists of multiple parts: Landmark extraction, data association, state estimation and land- marks update. Each part can be solved by different way and there is a huge amount of different hardware that can be used. The main part of the SLAM process is extended Kalman filter (EKF), which always holds the current estimated position.

For the positioning and localization of the rover we use Real Time Kinematic (RTK) GPS. It’s a technique used to enhance the precision of position data from satellite-based positioning systems such as GPS, GLONASS or Galileo. It uses measurements of the phase of the signal carrier wave, rather than the information content of the signal, and it provides centimeter-level accuracy

We obtain data from the surroundings around the robot from a light detection and ranging device (LiDAR). It uses light in the form of a pulsed laser to measure range of objects around and produces thousands of points per seconds. These points usually also carry some additional information such as their intensity or a number of return. With these information we should be able to generate three-dimensional model of the environment and also its surface characteristics [8].

![](/assets/img/rplidar-s2.png)
*The initial lidar model this project evaluated*

The third and also the last absolutely necessary sensor is an Inertial measurement unit (IMU). It is attached to LiDAR and tells us, how LiDAR is positioned at the moment. Points produced by LiDAR are relative to its centre at the time of the measurement, points produced by RTK GPS are relative to base (Chap. 3.3]), and IMU measurements are relative to IMU initial position. These measurement must be transformed into common coordinate system in order to perform calculations upon them.

By using these three sensors and combining them together we can explicitly create 3D maps (point clouds) in real time. We should also be able to navigate in them and also know our location at every moment. 


![](/assets/img/garyding_xmaxx_parking.jpg)
*Gary was testing the autonomous drive in parking lot*

![](/assets/img/gary_xmaxx_demo.jpg)
*OpenCV Founder Gary Bradski and teams were on the demo field*


## Video Links

Rover Setup
<iframe type="text/html" width="100%" height="385" src="https://www.youtube.com/embed/rqqbVXaiuio" frameborder="0"></iframe>

<iframe type="text/html" width="100%" height="385" src="https://www.youtube.com/embed/u-RKHTTs0DY" frameborder="0"></iframe>
















