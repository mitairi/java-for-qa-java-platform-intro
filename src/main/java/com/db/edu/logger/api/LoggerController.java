package com.db.edu.logger.api;

import com.db.edu.logger.businesslogic.service.LogService;
import com.db.edu.logger.dal.ConsoleLoggerSaver;

/**
 * Responsibilities:
 * - Security: Authentication and authorization
 * - Logging
 * - Transactions management (TXs)
 * - Request preparation
 * - Routing
 * - other Aspects
 */
public class LoggerController {
    private LogService logService = new LogService();

    public void log(String message) {
        logService.log(message);
    }


/*
    private ConsoleLoggerSaver saver = new ConsoleLoggerSaver();

       /**
        *
        * @param message to be logged
       */
       /*
       @RolesAllowes("admin")
       @Transactional()
       @WebMethod("/url")
       */
       /*
       public void log(String message) {
          saver.save(message);
       }
       */
}
