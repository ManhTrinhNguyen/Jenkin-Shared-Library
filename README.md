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
