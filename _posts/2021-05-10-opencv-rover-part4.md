---
layout: post
title: 'Eco-Friendly Farm Robot PoC Part 4'
subtitle: 'DepthAI Oak-D Integration to Achieve the OOD Person Detector'
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
This part talks about object detection techniques.

For the rover to safely move around it’s necessary to avoid collisions with obstacles. One approach is LIdar based. Here we are trying to locate and to segment individual obstacles. The environment is represented by an OcTree which is created by OctoMap and rover will take all the occupied voxels as one obstacle instead. Therefore, the rover has to move in a way it doesn’t intersect with the OctoMap. The OcTree is used because of low memory requirements and probability approach in the environment modelling.

When we started sensing the environment, the framework could only create the point clouds in real time. That turned out to be very inefficient because point cloud was very difficult to analyse. To overcome this issue the possibility for sensors raw data acquisition was implemented. After that, during offline point cloud creation, we identified and fixed several both software and hardware errors. The software ones were usually related to issues that were omitted in invited solutions, e.g. alignment between coordinate systems of different sensors or wrong time frames adjustments. The hardware errors included wrong sensors placement or use of inadequate devices (radios).
Once we were able to produce correct point clouds, we started integrating the software required for collision avoidance and path planning. We modified specific parts of TAF system, whose main focus were aerial vehicles, to match our requirements for rover. We implemented OctoMap. We tested and incorporated Flexible Collision Library into collision detection module of TAF. We found out that a point cloud has to be filtered, downsampled and the ground has to be segmented before inserting into OctoMap. Otherwise the collision detection would not work in the desired manner.
Last thing was the modification of planning algorithms in TAF for rover usage. Firstly we implemented a simple planner, but since it turned out not to be working properly with the higher amount of present obstacles, with few modifications we inte- grated already available RRT* planner.
The result is a robust software framework that could be used in applications of un- manned ground vehicles equipped with LiDAR, IMU and RTK GPS, for path planning and collision avoidance.

Another approach is vision based. It can be achieved by using stereo camera such as D435 or Oak-D.

## Milestones
    - Design Rover hardware BOM and assembly a few Chassis to evaluate
    - Setup Rover software and make a autonomous drive with GNSS RTK
    - Integrate the data flow framework with ODD person detector
    - DepthAI Oak-D integration to achieve the OOD person detector
    - DepthAI Oak-D integration to achieve Obstacle Avoidance

## Video Links

![](/assets/img/rover_vfh_2.jpg)


Rover Setup
<iframe type="text/html" width="100%" height="385" src="https://www.youtube.com/embed/E74HYwpXjos" frameborder="0"></iframe>





















