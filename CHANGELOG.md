
# Change Log  
  
## Version 1.0  
A few of the features were changed or redesigned while porting the library from Android to HarmonyOS. These are listed below.  
  
### Displaying Errors  
Android's EditText supports `setError()` method that displays errors as shown:  
  
![alt text](https://i.stack.imgur.com/D1Uth.png "Android Error")  
  
Instead of extending the TextField to create a new component, this library utilizes the following logic: If `showErrors: true`, if a TextField is invalid, overwrite the hint text as the error message and change the color of the hint text to red. This is shown here:   
![alt text](https://i.imgur.com/VTDiEyS.png "HMOS Before Error")  
   
![alt text](https://i.imgur.com/DpYTc34.png "HMOS After Error")  
