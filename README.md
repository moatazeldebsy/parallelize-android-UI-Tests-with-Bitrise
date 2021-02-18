## Demo for running parallelize Android UI Tests with Bitrise, Firebase TestLab and Flank - Bitrise User Group #7 :rocket:

<p align="center">
<img src="https://github.com/moatazeldebsy/parallelize-android-UI-Tests/blob/main/1.png">
</p>

<p align="center">
<img src="https://github.com/moatazeldebsy/parallelize-android-UI-Tests/blob/main/2.png">
</p>

## Project Setup:
- Create your Free [Bitrise account](https://app.bitrise.io/referral/27c9a409fb484d6b)
- [Flank](https://github.com/Flank/flank/)
- [Firebase Test Lab](https://firebase.google.com/docs/test-lab)

You should do the following steps:
- Create Google Cloud Project and Account
- Create a Firebase Account
- Add your project to firebase
- Create a service account to get access over the API
- Download the json file which contains the private key which can be added directly as an GENERIC FILE STORAGE in your Bitrise project and used it for authentication. 
- Don’t forget to enable the **Google Cloud Testing API** and **Cloud Tool Results API** in the Google Developers Console API. This is important for uploading the APKs and accessing the results.
- Configure Flank to your needs with `flank.yml`

You can find the `flank.yml` in flank directory and also the `bitrise.yml` file. 
