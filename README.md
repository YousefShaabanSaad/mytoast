"MyToast By Yousef Shaaban" 

Step 1. Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
 
Or  Add it in your root settings.gradle :

        dependencyResolutionManagement {
	        ...
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	 }
  
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.YousefShaabanSaad:mytoast:Tag'
	}
