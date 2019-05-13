package com.schedule;

import org.springframework.stereotype.Component;
import org.springframework.scheduling.annotation.Scheduled;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TareaSchedule
{
    private static final SimpleDateFormat DateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    @Scheduled(cron = "01 * * * * ?", zone = "America/Lima")
    public void ReportCurrentTime()
    {
        System.out.println("Fecha y hora " +DateFormat.format(new Date()));
    }
}