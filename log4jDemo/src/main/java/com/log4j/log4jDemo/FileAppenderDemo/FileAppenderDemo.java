package com.log4j.log4jDemo.FileAppenderDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.apache.logging.log4j.*;
import java.io.*;  
import java.sql.SQLException;  
import java.util.*;  
//import org.apache.logging.log4j.Logger;

public class FileAppenderDemo {
static	org.apache.logging.log4j.Logger log= LogManager.getLogger(FileAppenderDemo.class.getName());
			 public static void main(String[] args) {
		// TODO Auto-generated method stub
				 log.info("Hello World!!!");
				 log.warn("Helo world");
	}

}
