---
description: >-
  This is description for plugin and its functionality
  
---

goobi-plugin-dashboard-a-third-playground
===========================================================================


Einführung
---------------------------------------------------------------------------
ZZZ


Übersicht
---------------------------------------------------------------------------

Details             |  
------------------- | -----------------------------------------------------
Identifier          | intranda_dashboard_a_third_playground |
Source code         | [https://github.com/intranda/goobi-plugin-dashboard-a-third-playground](https://github.com/intranda/goobi-plugin-dashboard-a-third-playground)
Lizenz              | GPL 2.0 oder neuer 
Dokumentationsdatum | {DATE} 


Installation
---------------------------------------------------------------------------
Das Plugin besteht insgesamt aus den folgenden zu installierenden Dateien:

```text
goobi_plugin_dashboard_a_third_playground.jar
goobi_plugin_dashboard_a_third_playground-GUI.jar
goobi_plugin_dashboard_a_third_playground.xml
```

Diese Dateien müssen in den richtigen Verzeichnissen installiert werden, so dass diese nach der Installation unter den folgenden Pfaden vorliegen:

```bash
/opt/digiverso/goobi/plugins/dashboard/goobi_plugin_dashboard_a_third_playground.jar
/opt/digiverso/goobi/plugins/GUI/goobi_plugin_dashboard_a_third_playground-GUI.jar
/opt/digiverso/goobi/config/goobi_plugin_dashboard_a_third_playground.xml
```


Konfiguration
---------------------------------------------------------------------------
Die Konfiguration des Plugins erfolgt über die Konfigurationsdatei `goobi-plugin-dashboard-a-third-playground.xml` und kann im laufenden Betrieb angepasst werden. Im folgenden ist eine beispielhafte Konfigurationsdatei aufgeführt:

```xml
ZZZ
```

Der Block `<config>` kann für verschiedene Projekte oder Arbeitsschritte wiederholt vorkommen, um innerhalb verschiedener Workflows unterschiedliche Aktionen durchführen zu können. Die weiteren Parameter innerhalb dieser Konfigurationsdatei haben folgende Bedeutungen:

Parameter           |  Erläuterung
------------------- | ----------------------------------------------------- 
`project`           | Dieser Parameter legt fest, für welches Projekt der aktuelle Block `<config>` gelten soll. Verwendet wird hierbei der Name des Projektes. Dieser Parameter kann mehrfach pro `<config>` Block vorkommen.
`step`              | Dieser Parameter steuert, für welche Arbeitsschritte der Block `<config>` gelten soll. Verwendet wird hier der Name des Arbeitsschritts. Dieser Parameter kann mehrfach pro `<config>` Block vorkommen.
`parameter`         | ZZZ
`parameter`         | ZZZ
`parameter`         | ZZZ
`parameter`         | ZZZ
`parameter`         | ZZZ
`parameter`         | ZZZ
`parameter`         | ZZZ



Einrichtung benötigter Berechtigungen
---------------------------------------------------------------------------
Dieses Plugin verfügt über eine eigene Berechtigungsstufe für die Verwendung. Aus diesem Grund müssen Nutzer über die erforderlichen Rechte verfügen. Bitte weisen Sie daher der Benutzergruppe der entsprechenden Nutzer das folgende Recht zu:

```
ZZZ
```

![Korrekt zugewiesenes Recht für die Nutzer](placeholder.png)


Integration des Plugins in den Workflow
---------------------------------------------------------------------------
Zur Inbetriebnahme des Plugins muss dieses für einen oder mehrere gewünschte Aufgaben im Workflow aktiviert werden. Dies erfolgt wie im folgenden Screenshot aufgezeigt durch Auswahl des Plugins `intranda_dashboard_a_third_playground` aus der Liste der installierten Plugins.

![Zuweisung des Plugins zu einer bestimmten Aufgabe](placeholder.png)

Da dieses Plugin üblicherweise automatisch ausgeführt werden soll, sollte der Arbeitsschritt im Workflow als `automatisch` konfiguriert werden.


Bedienung des Plugins
---------------------------------------------------------------------------

ZZZ 


Arbeitsweise des Plugins
---------------------------------------------------------------------------
Nachdem das Plugin vollständig installiert und eingerichtet wurde, wird es üblicherweise automatisch innerhalb des Workflows ausgeführt, so dass keine manuelle Interaktion mit dem Nutzer erfolgt. Stattdessen erfolgt der Aufruf des Plugins durch den Workflow im Hintergrund führt die folgenden Arbeiten durch: 

ZZZ