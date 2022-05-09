
Campsite Availability REST API
==============================

This API is set up to handle the creation and management of
----------------------------------------------------------
**-Campsites**
    
    -id
    -name
    -location
**-Accounts**
   
    -id
    -name
**-Reservations**
  
    -reservationId
    -accountId
    -campsiteId
    -arrivalDate
    -departureDate
    

Reservations Functionality
=============================

**Save a new Reservation** 

-url: http://localhost:6060/reservations/save

-RequestBody:

    {
    "reservationId": 2,
    "accountId": "2",
    "campsiteId": "2",
    "arrivalDate": "01012022",
    "departureDate": "01012022"
    }
                  
**Find Reservation by Reservation ID**

-url: http://localhost:6060/reservations?id=?

-Request Parameter: Reservation ID (Integer)
   
**Find all Reservations**

-url: http://localhost:6060/reservations/all

**Find all Reservations by Campsite ID**

-url: http://localhost:6060/reservations/date?date=?????????

-Request Parameter: ddmmyyy(Integer)

**Find all Reservations by Campsite ID**

-url: http://localhost:6060/reservations/campsite?id=?

-Request Parameter: Campsite ID (Integer)

**Update Reservation by Reservation ID**

-url: http://localhost:6060/reservations/update?id=?

-Request Parameter: Reservation ID (Integer)

-RequestBody:

    {
    "reservationId": 2,
    "accountId": "2",
    "campsiteId": "2",
    "arrivalDate": "01012022",
    "departureDate": "01012022"
    }
                   
**Delete Reservation by Reservation ID**

-url: http://localhost:6060/campsites/delete?id=?

-Request Parameter: Reservation ID (Integer)
    

Campsites Functionality
=======================

**Save New Campsite**

-url: http://localhost:6060/campsites/save

-RequestBody:

    {
    "id": 5,
    "name": "Amantacha",
    "location": "West Side"
    }
    
**Find Campsite by Campsite ID**

-url: http://localhost:6060/campsites?id=?

-Request Parameter: Campsite ID (Integer)
    
**Find all Campsites**

-url: http://localhost:6060/campsites/all
    
**Update Campsite by Campsite ID**

-url: http://localhost:6060/campsites/update?id=?

-Request Parameter: Campsite ID (Integer)

-RequestBody:

    {
    "id": 5,
    "name": "Amantacha",
    "location": "West Side"
    }
                  
**Delete Campsite by Campsite ID**

-url: http://localhost:6060/campsites/delete?id=?

-Request Parameter: Campsite ID (Integer)
   
   
Accounts Functionality
======================

**Find Account by Account ID**

-url: http://localhost:6060/accounts/find?id=?
-Request Parameter: Account ID (Integer)

**Find All Accounts**

-url: http://localhost:6060/accounts/all
    
**Save Account**

-url: http://localhost:6060/accounts/save

-RequestBody:

    {
    "id": 6,
    "name": "Sylvan"
    }
                   
**Delete Account by Account ID**

-url: http://localhost:6060/accounts/delete?id=?

-Request Parameter: Account ID (Integer)
     
 **Update Account**
 
 -url: http://localhost:6060/accounts/update
 
 -RequestBody:
 
    {
    "id": 6,
    "name": "Sylvan"
    }
    
Availability Functionality
======================

**Find Availability by Campsite ID**

-url: http://localhost:6060/accounts/availability?id=?

-Request Parameter: Campsite ID (Integer)



