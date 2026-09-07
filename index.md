---
layout: page
home-title: Gary Ding 
description: Agents that act on physical systems — robots and GIS
cover: '/assets/img/garyding_bk5.jpg'
cover_author: 'Colin + Meg'
cover_author_link: 'https://unsplash.com/@colinandmeg'
---

# About me

I'm Gary — a Dartmouth undergraduate (class of 2027) reading Environmental Earth Sciences modified with Computer Science, originally from San Jose, California.

I build agents that act on physical systems. Both halves of my work have the same shape: a language model proposes, a real solver validates, and something in the world executes — a robot arm, or a fuel-break budget someone has to actually fund. The interesting part is never the model; it's the layer that refuses to let the model hallucinate a joint angle or a parcel boundary.

That started with robots. I first competed in FIRST Tech Challenge eight years ago, and have since worked on UR5 control and vision, Stanford's UMI and ALOHA replications, and two Google Summer of Code projects. It now runs equally through geospatial work: wildfire economics, native-species suitability modeling, and planning tools that land managers can actually open in a browser.

Reach me at garyding5678 [at] gmail [dot] com — or on [GitHub](https://github.com/23garyd) and [LinkedIn](https://www.linkedin.com/in/gary-ding-6ba10a201).

# Research & work

1. **ORISE Research Fellow — USDA Forest Service, Institute for Pacific Islands Forestry** *(Dec 2025 – present)* — Designed a green fuel break siting method for leeward Hawai'i Island and shipped it as a public planning tool for land managers. 280 road segments, 198 km of corridor, 20 native species, three-year cost models. First author on a manuscript in preparation. → **[open the live tool](https://23garyd.github.io/nksk-fuelbreak-tool/)**
2. **GeoAI Product Development — Dept. of Geography, Dartmouth** *(Summer 2026 – present)* — Authoring the system architecture for an LLM planning assistant embedded in QGIS that turns natural-language goals into validated, parcel-snapped design geometry for communities without planning budgets. Design and specification work; the build starts this year.
3. **[Google Summer of Code 2026 — dora-rs](https://github.com/dora-rs/gsoc2026-dora-agentic-robot)** — An LLM agent layer over the DORA dataflow runtime driving a UR5e through multi-step pick-and-place from a plain-language goal, with collision-aware RRT-Connect planning and automatic replanning on failure. Thirteen weekly PRs, ~200 unit tests.
4. **Undergraduate Research Assistant — Operations Research Lab, Thayer School of Engineering** *(Jan 2024 – present)* — Processed LANDFIRE fuels, NOAA weather, and NIFC incident records into simulation-ready inputs for 29 wildfires across six western states (505,000 acres, 213M USD in suppression spending), and built a deterministic damage-cost model over ~440,000 structures.
5. **Undergraduate Research Assistant — Climate Modeling and Impacts Group** *(Mar 2025 – present)* — Analyzed 13 CMIP6 model ensembles to evaluate potential evapotranspiration under 1%/yr CO2 scenarios, producing global aridity trend maps.
6. **Eggleston Fellow — Dartmouth Life Sciences Greenhouse** *(2026 – 2027)* — Named fellowship modernizing the living-collections database of a 6,000 sq ft teaching collection, and building a public interactive map of the holdings.
7. **[Robotics Intern — FutureDial, Inc.](tech/fd-ur5-part1.html)** *(2021 – 2024)* — Programmed a UR5 arm, linear rail, and conveyor for an assembly-line automation cell, with an OpenCV ArUco/QR vision pipeline for dynamic part positioning.
8. **[Google Summer of Code 2022 — OpenCV](tech/gsoc-2022-report.html)** — Python and Java computer-vision libraries for FRC teams on OAK-D stereo cameras and the DepthAI runtime.

# Projects

1. **[NKSK Green Fuel Break planning tool](https://23garyd.github.io/nksk-fuelbreak-tool/)** (2026) — client-side planning tool; full scenario state encoded in the URL hash, so a plan is a link. [Pipeline](https://github.com/23garyd/NKSK-greenbreaks) · [tool source](https://github.com/23garyd/nksk-fuelbreak-tool)
2. **RoundaboutDesigner** (2026) — an ArcGIS Pro add-in (C#/.NET 8) that sites and types roundabouts anywhere in the US from a natural-language request: an 11-tool agent loop over TIGER, OSM/Overpass, ACS, HPMS and FARS, with RAG-retrieved FHWA guidance behind every recommendation.
3. **[Isaac Sim to ROS 2 Nav2 for a Unitree Go2](https://github.com/23garyd/isaacSim-go2-humble)** (2026) — Isaac Sim 4.5 and Isaac Lab on RTX-50-series hardware under Ubuntu 22.04, bridged to ROS 2 Humble navigation.
4. **[ROS 2 navigation stacks in C++](https://github.com/23garyd/tracer-mini-ros2)** (2026) — FAST-LIO localization, rolling-costmap Nav2, AMCL tuning, and a mission wrapper on a versioned robot-interface contract.
5. **[Universal Manipulation Interface](tech/umi-part1.html)** (2024) — Stanford's UMI with a diffusion-policy controller, applied to warehouse reverse logistics.
6. **[OpenCV farm rover](tech/opencv-rover-part1.html)** (2021) — autonomous field rover on a Traxxas X-Maxx with ArduPilot/Pixhawk waypoint navigation and OpenCV row detection.

# Robotics teams

1. [**FIRST Robotics Competition**](tech/ftc-11311.html) — FRC 1072 Harker Robotics, Mechanical Lead
2. [**FIRST Tech Challenge**](tech/ftc-11311.html) — FTC 11311 Team Paragon, Vice Captain

# Skills

- **Languages** — Python, C++ (ROS 2), C#/.NET, Java, JavaScript, Bash
- **Robotics & simulation** — ROS 2, Nav2, DORA, Isaac Sim / Isaac Lab, MuJoCo, robosuite, LIBERO, RoboDK, ArduPilot/Pixhawk, RRT-Connect motion planning
- **Perception & learning** — OpenCV, DepthAI, PyTorch, imitation learning, diffusion policy, LLM tool-calling and agent orchestration, RAG with citation tracking
- **Geospatial** — QGIS, ArcGIS Pro add-in development, GeoPandas, Shapely, Rasterio, PyProj, GDAL, OSM/Overpass, TIGER, ACS, multi-criteria suitability modeling
- **Data & tools** — NumPy, pandas, Matplotlib, pytest, Git, Linux, Jupyter, LaTeX

# Awards

- **Earle S. Lenker 1956 Undergraduate Award**, Dartmouth Earth Sciences — outstanding junior major (2026)
- **Google Summer of Code** — selected twice: dora-rs (2026), OpenCV (2022)
- **Eggleston Fellowship**, Dartmouth Life Sciences Greenhouse (2026)
- **ORISE Research Participation Program**, USDA Forest Service (2026)
- **Undergraduate Research Assistantship (URAD)**, Dartmouth — four awards
- **Dartmouth Honor List** — 2023–24 and 2025–26
