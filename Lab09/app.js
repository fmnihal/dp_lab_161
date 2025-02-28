const express = require('express');
const path= require('path');
const app = express();
app.use(express.static(path.join(__dirname, 'time.html')));

// prayTimes.setMethod('Karachi');
// const time= prayTimes.getTimes(new Date(), [23.948521, 90.380030], +6);
// prayTimes.tune( {sunrise: -1, sunset: 3.5} );
// prayTimes.adjust({
//     fajr: 16,
//     dhuhr: '5 min',
//     asr: 'Hanafi',
//     isha: 15
// });

app.get('/', (req, res)=>{
    //var times= prayTimes.getTimes(new Date(), [23.948521, 90.380030], +6);
    //document.write('Sunrise: '+time.sunrise());
    //res.send('Sunrise: '+time.sunrise());
    //document.write('Prayer Time');
    //res.send('Prayer Time');
    res.sendFile(path.join(__dirname, 'time.html'));
});
//location();   //
//timeZone();
//prayerTime();

app.listen(4502, (req, res) => {
    console.log('Server running on port 4502');
});
//lat long: 23.948521,90.380030