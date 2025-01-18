## Folder Descriptions

### `vars/`
Contains Groovy files that define functions callable directly in Jenkins pipelines.  
Each file name becomes a step in the pipeline.  
**Example:** `exampleStep.groovy` defines a step `exampleStep`.

---

### `src/`
Holds helper classes or utilities organized in packages.  
**Example:** `org.mycompany.helpers.Utils` class for reusable logic.

---

### `resources/`
Stores external resources like templates, configuration files, or static assets.  
These resources are accessible via Groovy's resource loading.


# Create Jenkins Share Library 
1. Create Repository
   1. Create **Var Folder**: Include all function that call from Jenkinfile
      - Each function/execution step is its own Groovy file
   2. Create **src Folder** : Helper code
   3. **Resources Folder** : Allow you to run external resources library for non groovy file 
3. Write in Groovy code
4. Make the shared library available globally or for project
5. Use share library in Jenkinsfile to extend the Pipline
## Configure Jenkins Share Library in Jenkins 
1. Go to **Manage -> System -> Global Pipelines Library**
2. Add **Library Name**
3. Add **and Default Version : main** | **But Having a fix version should be a good idea Because whenever I make a change I create new version for that. If I use main branch without versioning my Jenkins Share Lib the old Code will not work anymore and my application will break**
4. Set SCM to **Git -> Add enpoint and credentials of Jenkins Shared Repo to that**  
## User Jenkins share Library 
1. **In Jenkinsfile** : @Library('name-of-jenkins-share-lib')
