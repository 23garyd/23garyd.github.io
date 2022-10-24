---
layout: post
title: 'Eco-Friendly Farm Robot PoC Part 3'
subtitle: 'Integrate the Data Flow Framework with ODD Person Detector '
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

This blog explains how to setup an Intel Realsense Depth Camera to be used for obstacle avoidance. This method uses a python script running on a companion computer Jetson Xavier to send distance information to pixhawk.

Two Intel cameras, the RealSense D435 depth camera and the T265 tracking camera, were used in order to enhance the rover’s three-dimensional mapping capabilities. The depth camera provides RGB and depth images of its surroundings, useful for creating a visual 3D map. The tracking camera includes two fisheye cameras, an additional inertial measurement unit (IMU), and on-board SLAM. These are all
accessed via ROS.

The on-board Jetson computer ran Robot Operating System (ROS), a flexible framework for writing robotics programs that allows Ubuntu Linux to control the physical components of the rover. 

Obstacle avoidance within PX4 can be achieved in two different ways: offboard Mode or mission Mode.
					
Offboard mode avoidance ensures that the desired route comes from a ROS node. This is passed into an obstacle avoidance module, which is another ROS node. The avoidance software sends the planned path to the as a stream of SET POSITION TARGET LOCAL NED messages. Since the navigation is done within ROS for offboard mode avoidance, it is possible to use all sensors that can be used to detect an obstacle as within ROS
					
Mission mode avoidance is the other solution. PX4 communicates with the obstacle avoidance software using an implementation of the MAVLink path planning protocol. It is different in the sense that a waypoint is reached when the vehicle is within the goal radius of its goal not taking the heading into consideration. This is because the obstacle avoidance algorithm has full control of the vehicle heading. PX4 then emits a new waypoint when the goal is reached via the TRAJECTORY REPRESENTATION WAYPOINTS. 


![](/assets/img/rover_vfh_2.jpg)


## Rover Setup
<iframe type="text/html" width="100%" height="385" src="https://www.youtube.com/embed/E74HYwpXjos" frameborder="0"></iframe>





















