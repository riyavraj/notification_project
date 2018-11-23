package com.example.mrk.design_project

import android.app.Notification
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main2.*

class Main2Activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        b1.setOnClickListener {
          val  intent = Intent(this,Main3Activity::class.java)
          val pendingIntent = PendingIntent.getActivity(this@Main2Activity,0,intent,0)
          val notification = Notification.Builder(this@Main2Activity)
              .setTicker("")
              .setContentText("\n" +
                      "MARINE DRIVE\n" +
                      "BRAND KERALA FOOTWARE EXPO @ MARINE DRIVE KOCHI\n" +
                      "ON NOV 20TH TO NOV 30TH")
              .setSmallIcon(R.drawable.notification_icon_background)
              .setContentIntent(pendingIntent).notification

           notification.flags = Notification.FLAG_AUTO_CANCEL
            val  notificationmanager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
          notificationmanager.notify(0,notification)

        }
        b2.setOnClickListener {
            val  intent = Intent(this,Main5Activity::class.java)
            val pendingIntent = PendingIntent.getActivity(this@Main2Activity,0,intent,0)
            val notification = Notification.Builder(this@Main2Activity)
                .setTicker("")
                .setContentText("NAVYA BAKERY SPECIAL OFFER RED VELVET FRESH CREAM CAKE RS 700 PER KG !!")
                .setSmallIcon(R.drawable.notification_icon_background)
                .setContentIntent(pendingIntent).notification

            notification.flags = Notification.FLAG_AUTO_CANCEL
            val  notificationmanager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationmanager.notify(0,notification)

        }
        b3.setOnClickListener {
            val  intent = Intent(this,Main6Activity::class.java)
            val pendingIntent = PendingIntent.getActivity(this@Main2Activity,0,intent,0)
            val notification = Notification.Builder(this@Main2Activity)
                .setTicker("")
                .setContentTitle("CARNIVAL CINEMAS ANGAMALY SARKAR NOW SHOWING!!")
                .setSmallIcon(R.drawable.notification_icon_background)
                .setContentIntent(pendingIntent).notification

            notification.flags = Notification.FLAG_AUTO_CANCEL
            val  notificationmanager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationmanager.notify(0,notification)

        }
        b4.setOnClickListener {
            val  intent = Intent(this,Main7Activity::class.java)
            val pendingIntent = PendingIntent.getActivity(this@Main2Activity,0,intent,0)
            val notification = Notification.Builder(this@Main2Activity)
                .setTicker("")
                .setContentTitle(" CHERAI BEACH .....Want to save up to 30% on your Vypin Island hotel?\n" +
                        "We check up to 200 sites for the latest and lowest prices. ")
                .setSmallIcon(R.drawable.notification_icon_background)
                .setContentIntent(pendingIntent).notification

            notification.flags = Notification.FLAG_AUTO_CANCEL
            val  notificationmanager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationmanager.notify(0,notification)

        }
        b5.setOnClickListener {
            val  intent = Intent(this,Main8Activity::class.java)
            val pendingIntent = PendingIntent.getActivity(this@Main2Activity,0,intent,0)
            val notification = Notification.Builder(this@Main2Activity)
                .setTicker("")
                .setContentTitle("Max\nLatest Women's Arrivals\n" +
                        "Get Creative with The Latest Trends\n" +
                        "Over 2,000 Stores & 9,000 Designers\n\n" +
                        "KFC SUPER SIXES 18PC CHICKEN @ RS499!! SAVE 43%")
                .setSmallIcon(R.drawable.notification_icon_background)
                .setContentIntent(pendingIntent).notification

            notification.flags = Notification.FLAG_AUTO_CANCEL
            val  notificationmanager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationmanager.notify(0,notification)

        }
        b6.setOnClickListener {
            val  intent = Intent(this,Main7Activity::class.java)
            val pendingIntent = PendingIntent.getActivity(this@Main2Activity,0,intent,0)
            val notification = Notification.Builder(this@Main2Activity)
                .setTicker("")
                .setContentTitle("CHERAI BEACH .....Want to save up to 30% on your Vypin Island hotel?\n" +
                        "We check up to 200 sites for the latest and lowest prices. ")
                .setSmallIcon(R.drawable.notification_icon_background)
                .setContentIntent(pendingIntent).notification

            notification.flags = Notification.FLAG_AUTO_CANCEL
            val  notificationmanager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationmanager.notify(0,notification)

        }
        b7.setOnClickListener {
            val  intent = Intent(this,Main9Activity::class.java)
            val pendingIntent = PendingIntent.getActivity(this@Main2Activity,0,intent,0)
            val notification = Notification.Builder(this@Main2Activity)
                .setTicker("")
                .setContentTitle("Joy Alukas 10-50 % OFF AADI DISCOUNT SALE.....Saving Big Has Never Been This Fashionable\n" +
                        "JOLLY SILKS BIG CLEARANCE SALE 10-70% OFF")
                .setSmallIcon(R.drawable.notification_icon_background)
                .setContentIntent(pendingIntent).notification

            notification.flags = Notification.FLAG_AUTO_CANCEL
            val  notificationmanager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationmanager.notify(0,notification)

        }
        b8.setOnClickListener {
            val  intent = Intent(this,Main10Activity::class.java)
            val pendingIntent = PendingIntent.getActivity(this@Main2Activity,0,intent,0)
            val notification = Notification.Builder(this@Main2Activity)
                .setTicker("")
                .setContentTitle("Dessi cuppa\n" +
                        "\n" +
                        "Slonkit Card Offer : Buy 2 favourite regular scoops of ice cream combo pack for 20% discount.\n" +
                        "\n" +
                        "DESSI CUPPA : Order Ice Creams from Rs.49 only\n" +
                        "\n")
                .setSmallIcon(R.drawable.notification_icon_background)
                .setContentIntent(pendingIntent).notification

            notification.flags = Notification.FLAG_AUTO_CANCEL
            val  notificationmanager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationmanager.notify(0,notification)

        }
        b9.setOnClickListener {
            val  intent = Intent(this,Main3Activity::class.java)
            val pendingIntent = PendingIntent.getActivity(this@Main2Activity,0,intent,0)
            val notification = Notification.Builder(this@Main2Activity)
                .setTicker("")
                .setContentTitle("MARINE DRIVE\n" +
                        "BRAND KERALA FOOTWARE EXPO @ MARINE DRIVE KOCHI\n" +
                        "ON NOV 20TH TO NOV 30TH")
                .setSmallIcon(R.drawable.notification_icon_background)
                .setContentIntent(pendingIntent).notification

            notification.flags = Notification.FLAG_AUTO_CANCEL
            val  notificationmanager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationmanager.notify(0,notification)

        }

        b11.setOnClickListener {
            val  intent = Intent(this,Main11Activity::class.java)
            val pendingIntent = PendingIntent.getActivity(this@Main2Activity,0,intent,0)
            val notification = Notification.Builder(this@Main2Activity)
                .setTicker("")
                .setContentTitle("\nIftar \nGreat yummy feast comes with grand discount @IFTAR \nSpicy Chicken Tandoori Grill Medium Meal @RS 129")
                .setSmallIcon(R.drawable.notification_icon_background)
                .setContentIntent(pendingIntent).notification

            notification.flags = Notification.FLAG_AUTO_CANCEL
            val  notificationmanager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationmanager.notify(0,notification)

        }

        b12.setOnClickListener {
            val  intent = Intent(this,Main12Activity::class.java)
            val pendingIntent = PendingIntent.getActivity(this@Main2Activity,0,intent,0)
            val notification = Notification.Builder(this@Main2Activity)
                .setTicker("")
                .setContentTitle("\n Seemas celebrate varnolsavam offer!!! \nGet 50% offer for purchases above RS 1000\n")
                .setSmallIcon(R.drawable.notification_icon_background)
                .setContentIntent(pendingIntent).notification

            notification.flags = Notification.FLAG_AUTO_CANCEL
            val  notificationmanager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationmanager.notify(0,notification)

        }




    }
    }

