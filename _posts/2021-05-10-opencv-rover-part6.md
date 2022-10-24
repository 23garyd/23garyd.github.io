---
layout: post
title: 'Eco-Friendly Farm Robot PoC Part 6'
subtitle: 'DepthAI Oak-D Weed Detection'
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
Using vision technology to identify weeds in agriculture is an area of active development, and a team of researchers recently shared their method of using a combination of machine vision plus depth information to identify and map weeds with the help of OpenCV, the open-source computer vision library. Agriculture is how people get fed, and improving weed management is one of its most important challenges.

Many current efforts at weed detection and classification use fancy and expensive cameras, but this project relies primarily on an OAK-D stereo depth camera. The system is still being developed, but is somewhat further along than a proof of concept. The portable setups use a Jetson Xavier, stereo camera unit, power banks, an Android tablet for interfacing, and currently require an obedient human to move and point them.

It’s an interesting peek at the kind of hands-on work that goes into data gathering for development. Armed with loads of field data from many different environments, the system can use the data to identify grasses, broad leaf plants, and soil in every image. This alone is useful, but depth information also allows the system to estimate overall plant density as well as try to determine the growth center of any particular plant. Knowing that a weed is present is one thing, but to eliminate it with precision — for example with a laser or mini weed whacker on a robot arm — knowing where the weed is actually growing from is an important detail.

## Implementation

The reference project is https://github.com/precision-sustainable-ag/PhenoCV-WeedCam/tree/master/depthai-experiments

This demo shows a deep learning based firework detector. You can use the following set of pre-trained models in the demo:

fire_detectionDetect flames and smoke
Other demo goals include:

video/camera as input (via OpenCV)
Use flame and smoke detection to monitor fires in video
installation and dependencies
dependencies

Python ( 3.6+ )
OpenCV (>=3.4.0)
Depthai (>=2.13.0.0)
To install all required Python modules you can use:

pip3 install -r requirements.txt

## Video Links

![](/assets/img/rover_vfh_2.jpg)


Rover Setup
<iframe type="text/html" width="100%" height="385" src="https://www.youtube.com/embed/E74HYwpXjos" frameborder="0"></iframe>





















