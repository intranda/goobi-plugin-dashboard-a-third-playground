---
description: >-
  This is description for plugin and its functionality
  
---

goobi-plugin-dashboard-a-third-playground
===========================================================================


Introduction
---------------------------------------------------------------------------
ZZZ


Overview
---------------------------------------------------------------------------

Details             |  
------------------- | -----------------------------------------------------
Identifier          | intranda_dashboard_a_third_playground |
Source code         | [https://github.com/intranda/goobi-plugin-dashboard-a-third-playground](https://github.com/intranda/goobi-plugin-dashboard-a-third-playground)
License             | GPL 2.0 or newer 
Documentation date  | {DATE} 


Installation
---------------------------------------------------------------------------
The plugin consists in total of the following files to be installed:

```text
goobi_plugin_dashboard_a_third_playground.jar
goobi_plugin_dashboard_a_third_playground-GUI.jar
goobi_plugin_dashboard_a_third_playground.xml
```

These files must be installed in the correct directories so that they are available under the following paths after installation:

```bash
/opt/digiverso/goobi/plugins/dashboard/goobi_plugin_dashboard_a_third_playground.jar
/opt/digiverso/goobi/plugins/GUI/goobi_plugin_dashboard_a_third_playground-GUI.jar
/opt/digiverso/goobi/config/goobi_plugin_dashboard_a_third_playground.xml
```


Configuration
---------------------------------------------------------------------------
The plugin is configured via the configuration file `goobi-plugin-dashboard-a-third-playground.xml` and can be adapted during operation. The following is an example configuration file:

```xml
ZZZ
```

The block `<config>` can occur repeatedly for different projects or workflow steps in order to be able to perform different actions within different workflows. The other parameters within this configuration file have the following meanings:

Parameter           |  Explanation
------------------- | ----------------------------------------------------- 
`project`           | This parameter determines for which project the current block `<config>` should apply. The name of the project is used here. This parameter can occur several times per `<config>` block.
`step`              | This parameter controls which workflow steps the `<config>` block should apply to. The name of the workflow step is used here. This parameter can occur several times per `<config>` block.
`parameter`         | ZZZ
`parameter`         | ZZZ
`parameter`         | ZZZ
`parameter`         | ZZZ
`parameter`         | ZZZ
`parameter`         | ZZZ
`parameter`         | ZZZ



Setting up required rights
---------------------------------------------------------------------------
This plugin has its own permission level for use. For this reason, users must have the necessary rights. Therefore, please assign the following right to the user group of the corresponding users:

```
ZZZ
```

![Correctly assigned rights for the users](placeholder.png)


Integration of the plugin into the workflow
---------------------------------------------------------------------------
To put the plugin into operation, it must be activated for one or more desired tasks in the workflow. This is done as shown in the following screenshot by selecting the plugin `intranda_dashboard_a_third_playground` from the list of installed plugins.

![Assigning the plugin to a specific task](placeholder.png)

Since this plugin should usually be executed automatically, the workflow step should be configured as 'automatic'.


Operation of the plugin
---------------------------------------------------------------------------

ZZZ 


How the plugin works
---------------------------------------------------------------------------
Once the plugin has been fully installed and set up, it is usually run automatically within the workflow, so there is no manual interaction with the user. Instead, calling the plugin through the workflow in the background does the following: 

ZZZ