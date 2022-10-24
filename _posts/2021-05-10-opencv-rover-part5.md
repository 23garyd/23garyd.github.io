---
layout: post
title: 'Eco-Friendly Farm Robot PoC Part 5'
subtitle: 'DepthAI Oak-D Fire and Smoke Detection'
date: 2021-03-10
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
I finally added Fire detection with OAK-D to the rover. It is based on deep learning. The model come from the pre-trained model from DepthAI community.

## Implementation

The reference project is  https://github.com/OAKChina/depthai-examples/tree/master/fire_detection

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





















